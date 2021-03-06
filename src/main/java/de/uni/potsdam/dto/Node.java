package de.uni.potsdam.dto;

import java.io.Serializable;

public class Node implements Serializable{

	private static final long serialVersionUID = 1L;
	private long id;
	private String label;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", label=" + label + "]";
	}
}
