package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vertex iterator simplifies the process of writing vertex data to a vertex buffer.
  */
@JSImport("playcanvas", "VertexIterator")
@js.native
open class VertexIterator protected () extends StObject {
  /**
    * Create a new VertexIterator instance.
    *
    * @param {import('./vertex-buffer.js').VertexBuffer} vertexBuffer - The vertex buffer to be
    * iterated.
    */
  def this(vertexBuffer: VertexBuffer) = this()
  
  var accessors: js.Array[VertexIteratorAccessor] = js.native
  
  var buffer: js.typedarray.ArrayBuffer = js.native
  
  /**
    * The vertex buffer elements.
    *
    * @type {Object<string, VertexIteratorAccessor>}
    */
  var element: StringDictionary[VertexIteratorAccessor] = js.native
  
  /**
    * Notifies the vertex buffer being iterated that writes are complete. Internally the vertex
    * buffer is unlocked and vertex data is uploaded to video memory.
    *
    * @example
    * const iterator = new pc.VertexIterator(vertexBuffer);
    * iterator.element[pc.SEMANTIC_POSITION].set(-0.9, -0.9, 0.0);
    * iterator.element[pc.SEMANTIC_COLOR].set(255, 0, 0, 255);
    * iterator.next();
    * iterator.element[pc.SEMANTIC_POSITION].set(0.9, -0.9, 0.0);
    * iterator.element[pc.SEMANTIC_COLOR].set(0, 255, 0, 255);
    * iterator.next();
    * iterator.element[pc.SEMANTIC_POSITION].set(0.0, 0.9, 0.0);
    * iterator.element[pc.SEMANTIC_COLOR].set(0, 0, 255, 255);
    * iterator.end();
    */
  def end(): Unit = js.native
  
  /**
    * Moves the vertex iterator on to the next vertex.
    *
    * @param {number} [count] - Optional number of steps to move on when calling next. Defaults to
    * 1.
    * @example
    * const iterator = new pc.VertexIterator(vertexBuffer);
    * iterator.element[pc.SEMANTIC_POSITION].set(-0.9, -0.9, 0.0);
    * iterator.element[pc.SEMANTIC_COLOR].set(255, 0, 0, 255);
    * iterator.next();
    * iterator.element[pc.SEMANTIC_POSITION].set(0.9, -0.9, 0.0);
    * iterator.element[pc.SEMANTIC_COLOR].set(0, 255, 0, 255);
    * iterator.next();
    * iterator.element[pc.SEMANTIC_POSITION].set(0.0, 0.9, 0.0);
    * iterator.element[pc.SEMANTIC_COLOR].set(0, 0, 255, 255);
    * iterator.end();
    */
  def next(): Unit = js.native
  def next(count: Double): Unit = js.native
  
  /**
    * Function to extract elements of a specified semantic from vertex buffer into flat array
    * (data). Works with both interleaved (slower) and non-interleaved (fast) vertex buffers.
    * Returns number of vertices. Note: when data is a typed array and is smaller than needed,
    * only part of the data gets copied out (typed arrays ignore read/write out of range).
    *
    * @param {string} semantic - The semantic of the vertex element to read.
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} data - The
    * array to receive the data.
    * @returns {number} The number of vertices read.
    * @ignore
    */
  def readData(semantic: String, data: js.Array[Double]): Double = js.native
  def readData(semantic: String, data: js.typedarray.Float32Array): Double = js.native
  def readData(semantic: String, data: js.typedarray.Int16Array): Double = js.native
  def readData(semantic: String, data: js.typedarray.Int32Array): Double = js.native
  def readData(semantic: String, data: js.typedarray.Int8Array): Double = js.native
  def readData(semantic: String, data: js.typedarray.Uint16Array): Double = js.native
  def readData(semantic: String, data: js.typedarray.Uint32Array): Double = js.native
  def readData(semantic: String, data: js.typedarray.Uint8Array): Double = js.native
  def readData(semantic: String, data: js.typedarray.Uint8ClampedArray): Double = js.native
  
  var vertexBuffer: VertexBuffer = js.native
  
  var vertexFormatSize: Double = js.native
  
  /**
    * Copies data for specified semantic into vertex buffer. Works with both interleaved (slower)
    * and non-interleaved (fast) vertex buffers.
    *
    * @param {string} semantic - The semantic of the vertex element to set.
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} data - The data to set.
    * @param {number} numVertices - The number of vertices to write.
    * @ignore
    */
  def writeData(semantic: String, data: js.Array[Double], numVertices: Double): Unit = js.native
  def writeData(semantic: String, data: js.typedarray.Float32Array, numVertices: Double): Unit = js.native
  def writeData(semantic: String, data: js.typedarray.Int16Array, numVertices: Double): Unit = js.native
  def writeData(semantic: String, data: js.typedarray.Int32Array, numVertices: Double): Unit = js.native
  def writeData(semantic: String, data: js.typedarray.Int8Array, numVertices: Double): Unit = js.native
  def writeData(semantic: String, data: js.typedarray.Uint16Array, numVertices: Double): Unit = js.native
  def writeData(semantic: String, data: js.typedarray.Uint32Array, numVertices: Double): Unit = js.native
  def writeData(semantic: String, data: js.typedarray.Uint8Array, numVertices: Double): Unit = js.native
  def writeData(semantic: String, data: js.typedarray.Uint8ClampedArray, numVertices: Double): Unit = js.native
}
