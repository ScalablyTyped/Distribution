package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl", JSImport.Namespace)
@js.native
object webglMod extends js.Object {
  val HAS: scala.Boolean = js.native
  def getContext(canvas: stdLib.HTMLCanvasElement): stdLib.WebGLRenderingContext = js.native
  def getContext(canvas: stdLib.HTMLCanvasElement, opt_attributes: js.Any): stdLib.WebGLRenderingContext = js.native
}

