package typings.ol

import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl", JSImport.Namespace)
@js.native
object webglMod extends js.Object {
  val HAS: Boolean = js.native
  def getContext(canvas: HTMLCanvasElement): WebGLRenderingContext = js.native
  def getContext(canvas: HTMLCanvasElement, opt_attributes: js.Any): WebGLRenderingContext = js.native
}

