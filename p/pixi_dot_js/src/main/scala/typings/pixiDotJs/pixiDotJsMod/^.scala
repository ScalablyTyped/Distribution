package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXINs.RendererOptions
import typings.pixiDotJs.PIXINs.loadersNs.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEG_TO_RAD: Double = js.native
  val PI_2: Double = js.native
  val RAD_TO_DEG: Double = js.native
  // from CONST
  val VERSION: String = js.native
  val loader: Loader = js.native
  def autoDetectRenderer(): typings.pixiDotJs.PIXINs.WebGLRenderer | typings.pixiDotJs.PIXINs.CanvasRenderer = js.native
  def autoDetectRenderer(options: RendererOptions): typings.pixiDotJs.PIXINs.WebGLRenderer | typings.pixiDotJs.PIXINs.CanvasRenderer = js.native
  def autoDetectRenderer(width: Double, height: Double): typings.pixiDotJs.PIXINs.WebGLRenderer | typings.pixiDotJs.PIXINs.CanvasRenderer = js.native
  def autoDetectRenderer(width: Double, height: Double, options: RendererOptions): typings.pixiDotJs.PIXINs.WebGLRenderer | typings.pixiDotJs.PIXINs.CanvasRenderer = js.native
  def autoDetectRenderer(width: Double, height: Double, options: RendererOptions, forceCanvas: Boolean): typings.pixiDotJs.PIXINs.WebGLRenderer | typings.pixiDotJs.PIXINs.CanvasRenderer = js.native
}

