package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEG_TO_RAD: scala.Double = js.native
  val PI_2: scala.Double = js.native
  val RAD_TO_DEG: scala.Double = js.native
  // from CONST
  val VERSION: java.lang.String = js.native
  val loader: pixiDotJsLib.PIXINs.loadersNs.Loader = js.native
  def autoDetectRenderer(): pixiDotJsLib.PIXINs.WebGLRenderer | pixiDotJsLib.PIXINs.CanvasRenderer = js.native
  def autoDetectRenderer(options: pixiDotJsLib.PIXINs.RendererOptions): pixiDotJsLib.PIXINs.WebGLRenderer | pixiDotJsLib.PIXINs.CanvasRenderer = js.native
  def autoDetectRenderer(width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.WebGLRenderer | pixiDotJsLib.PIXINs.CanvasRenderer = js.native
  def autoDetectRenderer(width: scala.Double, height: scala.Double, options: pixiDotJsLib.PIXINs.RendererOptions): pixiDotJsLib.PIXINs.WebGLRenderer | pixiDotJsLib.PIXINs.CanvasRenderer = js.native
  def autoDetectRenderer(
    width: scala.Double,
    height: scala.Double,
    options: pixiDotJsLib.PIXINs.RendererOptions,
    forceCanvas: scala.Boolean
  ): pixiDotJsLib.PIXINs.WebGLRenderer | pixiDotJsLib.PIXINs.CanvasRenderer = js.native
}

