package typings
package olLib.webglBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Buffer", JSImport.Default)
@js.native
class default () extends WebGLBuffer {
  def this(opt_arr: js.Array[scala.Double]) = this()
  def this(opt_arr: js.Array[scala.Double], opt_usage: scala.Double) = this()
  /* CompleteClass */
  override def getArray(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getUsage(): scala.Double = js.native
}

