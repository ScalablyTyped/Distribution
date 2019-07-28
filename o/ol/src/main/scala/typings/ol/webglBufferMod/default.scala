package typings.ol.webglBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Buffer", JSImport.Default)
@js.native
class default () extends WebGLBuffer {
  def this(opt_arr: js.Array[Double]) = this()
  def this(opt_arr: js.Array[Double], opt_usage: Double) = this()
  /* CompleteClass */
  override def getArray(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getUsage(): Double = js.native
}

