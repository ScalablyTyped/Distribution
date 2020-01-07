package typings.ol.webglBufferMod

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLArrayBuffer extends js.Object {
  def fromArray(array: js.Array[Double]): Unit
  def fromArrayBuffer(buffer: ArrayBuffer): Unit
  def getArray(): Float32Array | Uint32Array
  def getSize(): Double
  def getType(): Double
  def getUsage(): Double
  def ofSize(size: Double): Unit
}

object WebGLArrayBuffer {
  @scala.inline
  def apply(
    fromArray: js.Array[Double] => Unit,
    fromArrayBuffer: ArrayBuffer => Unit,
    getArray: () => Float32Array | Uint32Array,
    getSize: () => Double,
    getType: () => Double,
    getUsage: () => Double,
    ofSize: Double => Unit
  ): WebGLArrayBuffer = {
    val __obj = js.Dynamic.literal(fromArray = js.Any.fromFunction1(fromArray), fromArrayBuffer = js.Any.fromFunction1(fromArrayBuffer), getArray = js.Any.fromFunction0(getArray), getSize = js.Any.fromFunction0(getSize), getType = js.Any.fromFunction0(getType), getUsage = js.Any.fromFunction0(getUsage), ofSize = js.Any.fromFunction1(ofSize))
  
    __obj.asInstanceOf[WebGLArrayBuffer]
  }
}

