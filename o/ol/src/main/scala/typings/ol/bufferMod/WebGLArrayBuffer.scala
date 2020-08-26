package typings.ol.bufferMod

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLArrayBuffer extends js.Object {
  def fromArray(array: js.Array[Double]): Unit = js.native
  def fromArrayBuffer(buffer: ArrayBuffer): Unit = js.native
  def getArray(): Float32Array | Uint32Array = js.native
  def getSize(): Double = js.native
  def getType(): Double = js.native
  def getUsage(): Double = js.native
  def ofSize(size: Double): Unit = js.native
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
  @scala.inline
  implicit class WebGLArrayBufferOps[Self <: WebGLArrayBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFromArray(value: js.Array[Double] => Unit): Self = this.set("fromArray", js.Any.fromFunction1(value))
    @scala.inline
    def setFromArrayBuffer(value: ArrayBuffer => Unit): Self = this.set("fromArrayBuffer", js.Any.fromFunction1(value))
    @scala.inline
    def setGetArray(value: () => Float32Array | Uint32Array): Self = this.set("getArray", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => Double): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => Double): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUsage(value: () => Double): Self = this.set("getUsage", js.Any.fromFunction0(value))
    @scala.inline
    def setOfSize(value: Double => Unit): Self = this.set("ofSize", js.Any.fromFunction1(value))
  }
  
}

