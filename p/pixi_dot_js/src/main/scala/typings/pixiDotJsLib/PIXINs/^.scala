package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI")
@js.native
object ^ extends js.Object {
  val DEG_TO_RAD: scala.Double = js.native
  val PI_2: scala.Double = js.native
  val RAD_TO_DEG: scala.Double = js.native
  // from CONST
  val VERSION: java.lang.String = js.native
  val loader: pixiDotJsLib.PIXINs.loadersNs.Loader = js.native
  def autoDetectRenderer(): WebGLRenderer | CanvasRenderer = js.native
  def autoDetectRenderer(options: RendererOptions): WebGLRenderer | CanvasRenderer = js.native
  def autoDetectRenderer(width: scala.Double, height: scala.Double): WebGLRenderer | CanvasRenderer = js.native
  def autoDetectRenderer(width: scala.Double, height: scala.Double, options: RendererOptions): WebGLRenderer | CanvasRenderer = js.native
  def autoDetectRenderer(width: scala.Double, height: scala.Double, options: RendererOptions, forceCanvas: scala.Boolean): WebGLRenderer | CanvasRenderer = js.native
}

