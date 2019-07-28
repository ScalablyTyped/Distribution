package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.loadersNs.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI")
@js.native
object ^ extends js.Object {
  val DEG_TO_RAD: Double = js.native
  val PI_2: Double = js.native
  val RAD_TO_DEG: Double = js.native
  // from CONST
  val VERSION: String = js.native
  val loader: Loader = js.native
  def autoDetectRenderer(): WebGLRenderer | CanvasRenderer = js.native
  def autoDetectRenderer(options: RendererOptions): WebGLRenderer | CanvasRenderer = js.native
  def autoDetectRenderer(width: Double, height: Double): WebGLRenderer | CanvasRenderer = js.native
  def autoDetectRenderer(width: Double, height: Double, options: RendererOptions): WebGLRenderer | CanvasRenderer = js.native
  def autoDetectRenderer(width: Double, height: Double, options: RendererOptions, forceCanvas: Boolean): WebGLRenderer | CanvasRenderer = js.native
}

