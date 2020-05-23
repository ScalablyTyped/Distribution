package typings.playcanvas.pc

import typings.std.Float32Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a new pc.VertexIteratorAccessor object.
  * @param buffer - The vertex buffer containing the attribute to be accessed.
  * @param vertexElement - The vertex attribute to be accessed.
  * @param vertexElement.name - The meaning of the vertex element. This is used to link
  the vertex data to a shader input. Can be:
  
  * {@link pc.SEMANTIC_POSITION}
  * {@link pc.SEMANTIC_NORMAL}
  * {@link pc.SEMANTIC_TANGENT}
  * {@link pc.SEMANTIC_BLENDWEIGHT}
  * {@link pc.SEMANTIC_BLENDINDICES}
  * {@link pc.SEMANTIC_COLOR}
  * {@link pc.SEMANTIC_TEXCOORD0}
  * {@link pc.SEMANTIC_TEXCOORD1}
  * {@link pc.SEMANTIC_TEXCOORD2}
  * {@link pc.SEMANTIC_TEXCOORD3}
  * {@link pc.SEMANTIC_TEXCOORD4}
  * {@link pc.SEMANTIC_TEXCOORD5}
  * {@link pc.SEMANTIC_TEXCOORD6}
  * {@link pc.SEMANTIC_TEXCOORD7}
  
  If vertex data has a meaning other that one of those listed above, use the user-defined
  semantics: pc.SEMANTIC_ATTR0 to pc.SEMANTIC_ATTR15.
  * @param vertexElement.numComponents - The number of components of the vertex attribute.
  Can be 1, 2, 3 or 4.
  * @param vertexElement.dataType - The data type of the attribute. Can be:
  
  * {@link pc.TYPE_INT8}
  * {@link pc.TYPE_UINT8}
  * {@link pc.TYPE_INT16}
  * {@link pc.TYPE_UINT16}
  * {@link pc.TYPE_INT32}
  * {@link pc.TYPE_UINT32}
  * {@link pc.TYPE_FLOAT32}
  * @param vertexElement.normalize - If true, vertex attribute data will be mapped from a
  0 to 255 range down to 0 to 1 when fed to a shader. If false, vertex attribute data is left
  unchanged. If this property is unspecified, false is assumed.
  * @param vertexElement.offset - The number of initial bytes at the start of a vertex that are not relevant to this attribute.
  * @param vertexElement.stride - The number of total bytes that are between the start of one vertex, and the start of the next.
  * @param vertexElement.scopeId - The shader input variable corresponding to the attribute.
  * @param vertexElement.size - The size of the attribute in bytes.
  * @param vertexFormat - A vertex format that defines the layout of vertex data inside the buffer.
  */
@js.native
trait VertexIteratorAccessor extends js.Object {
  /**
    * Get a attribute component at the iterator's current index.
    * @param offset - The component offset. Should be either 0, 1, 2, or 3.
    * @returns The value of a attribute component.
    */
  def get(offset: Double): Double = js.native
  /**
    * Read attribute components to an output array.
    * @param offset - The component offset at which to read data from the buffer. Will be used instead of the iterator's current index.
    * @param outputArray - The output array to write data into.
    * @param outputIndex - The output index at which to write into the output array.
    */
  def getToArray(offset: Double, outputArray: js.Array[Double], outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: Float32Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: Int16Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: Int32Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: Int8Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: Uint16Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: Uint32Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: Uint8Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: Uint8ClampedArray, outputIndex: Double): Unit = js.native
  /**
    * Set all the attribute components at the iterator's current index.
    * @param a - The first component value.
    * @param [b] - The second component value (if applicable).
    * @param [c] - The third component value (if applicable).
    * @param [d] - The fourth component value (if applicable).
    */
  def set(a: Double): Unit = js.native
  def set(a: Double, b: Double): Unit = js.native
  def set(a: Double, b: Double, c: Double): Unit = js.native
  def set(a: Double, b: Double, c: Double, d: Double): Unit = js.native
  /**
    * Write attribute components from an input array.
    * @param index - The starting index at which to write data into the buffer. Will be used instead of the iterator's current index.
    * @param inputArray - The input array to read data from.
    * @param inputIndex - The input index at which to read from the input array.
    */
  def setFromArray(index: Double, inputArray: js.Array[Double], inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: Float32Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: Int16Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: Int32Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: Int8Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: Uint16Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: Uint32Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: Uint8Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: Uint8ClampedArray, inputIndex: Double): Unit = js.native
}

