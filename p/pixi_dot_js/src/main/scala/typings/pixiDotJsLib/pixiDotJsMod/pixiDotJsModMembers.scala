package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", JSImport.Namespace)
@js.native
object pixiDotJsModMembers extends js.Object {
  val BLEND_MODES: pixiDotJsLib.Anon_SOFTLIGHT = js.native
  val DEG_TO_RAD: scala.Double = js.native
  val DRAW_MODES: pixiDotJsLib.Anon_TRIANGLESLINELOOP = js.native
  val GC_MODES: pixiDotJsLib.Anon_MANUAL = js.native
  val PI_2: scala.Double = js.native
  val PRECISION: pixiDotJsLib.Anon_MEDIUM = js.native
  val RAD_TO_DEG: scala.Double = js.native
  val RENDERER_TYPE: pixiDotJsLib.Anon_WEBGL = js.native
  val SCALE_MODES: pixiDotJsLib.Anon_LINEAR = js.native
  val SHAPES: pixiDotJsLib.Anon_POLY = js.native
  val TEXT_GRADIENT: pixiDotJsLib.Anon_LINEARVERTICAL = js.native
  val TRANSFORM_MODE: pixiDotJsLib.Anon_DEFAULT = js.native
  val UPDATE_PRIORITY: pixiDotJsLib.Anon_UTILITY = js.native
  // from CONST
  val VERSION: java.lang.String = js.native
  val WRAP_MODES: pixiDotJsLib.Anon_CLAMP = js.native
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

