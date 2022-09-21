package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helps with accessing a specific vertex attribute.
  */
@js.native
trait VertexIteratorAccessor extends StObject {
  
  var array: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array = js.native
  
  /**
    * Get a attribute component at the iterator's current index.
    *
    * @param {number} offset - The component offset. Should be either 0, 1, 2, or 3.
    * @returns {number} The value of a attribute component.
    */
  def get(offset: Double): Double = js.native
  
  /**
    * Read attribute components to an output array.
    *
    * @param {number} offset - The component offset at which to read data from the buffer. Will be
    * used instead of the iterator's current index.
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} outputArray - The output array to write data into.
    * @param {number} outputIndex - The output index at which to write into the output array.
    */
  def getToArray(offset: Double, outputArray: js.Array[Double], outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: js.typedarray.Float32Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: js.typedarray.Int16Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: js.typedarray.Int32Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: js.typedarray.Int8Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: js.typedarray.Uint16Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: js.typedarray.Uint32Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: js.typedarray.Uint8Array, outputIndex: Double): Unit = js.native
  def getToArray(offset: Double, outputArray: js.typedarray.Uint8ClampedArray, outputIndex: Double): Unit = js.native
  
  var index: Double = js.native
  
  var numComponents: Double = js.native
  
  /**
    * Set all the attribute components at the iterator's current index.
    *
    * @param {number} a - The first component value.
    * @param {number} [b] - The second component value (if applicable).
    * @param {number} [c] - The third component value (if applicable).
    * @param {number} [d] - The fourth component value (if applicable).
    */
  def set(a: Double): Unit = js.native
  def set(a: Double, b: Double): Unit = js.native
  def set(a: Double, b: Double, c: Double): Unit = js.native
  def set(a: Double, b: Double, c: Double, d: Double): Unit = js.native
  def set(a: Double, b: Double, c: Unit, d: Double): Unit = js.native
  def set(a: Double, b: Unit, c: Double): Unit = js.native
  def set(a: Double, b: Unit, c: Double, d: Double): Unit = js.native
  def set(a: Double, b: Unit, c: Unit, d: Double): Unit = js.native
  
  /**
    * Write attribute components from an input array.
    *
    * @param {number} index - The starting index at which to write data into the buffer. Will be
    * used instead of the iterator's current index.
    * @param {number[]|Int8Array|Uint8Array|Uint8ClampedArray|Int16Array|Uint16Array|Int32Array|Uint32Array|Float32Array} inputArray - The input array to read data from.
    * @param {number} inputIndex - The input index at which to read from the input array.
    */
  def setFromArray(index: Double, inputArray: js.Array[Double], inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: js.typedarray.Float32Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: js.typedarray.Int16Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: js.typedarray.Int32Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: js.typedarray.Int8Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: js.typedarray.Uint16Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: js.typedarray.Uint32Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: js.typedarray.Uint8Array, inputIndex: Double): Unit = js.native
  def setFromArray(index: Double, inputArray: js.typedarray.Uint8ClampedArray, inputIndex: Double): Unit = js.native
  
  var stride: Double = js.native
}
