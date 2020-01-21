package typings.ol.bufferMod

import typings.std.ArrayBuffer
import typings.std.Float32Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Buffer", JSImport.Default)
@js.native
class default protected () extends WebGLArrayBuffer {
  def this(`type`: Double) = this()
  def this(`type`: Double, opt_usage: Double) = this()
  /* CompleteClass */
  override def fromArray(array: js.Array[Double]): Unit = js.native
  /* CompleteClass */
  override def fromArrayBuffer(buffer: ArrayBuffer): Unit = js.native
  /* CompleteClass */
  override def getArray(): Float32Array | Uint32Array = js.native
  /* CompleteClass */
  override def getSize(): Double = js.native
  /* CompleteClass */
  override def getType(): Double = js.native
  /* CompleteClass */
  override def getUsage(): Double = js.native
  /* CompleteClass */
  override def ofSize(size: Double): Unit = js.native
}

