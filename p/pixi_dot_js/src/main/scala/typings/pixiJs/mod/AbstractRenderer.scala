package typings.pixiJs.mod

import typings.pixiCore.mod.IRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "AbstractRenderer")
@js.native
/**
  * @param type - The renderer type.
  * @param [options] - The optional renderer parameters.
  * @param {number} [options.width=800] - The width of the screen.
  * @param {number} [options.height=600] - The height of the screen.
  * @param {HTMLCanvasElement} [options.view] - The canvas to use as a view, optional.
  * @param {boolean} [options.useContextAlpha=true] - Pass-through value for canvas' context `alpha` property.
  *   If you want to set transparency, please use `backgroundAlpha`. This option is for cases where the
  *   canvas needs to be opaque, possibly for performance reasons on some older devices.
  * @param {boolean} [options.autoDensity=false] - Resizes renderer view in CSS pixels to allow for
  *   resolutions other than 1.
  * @param {boolean} [options.antialias=false] - Sets antialias
  * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the renderer.
  * @param {boolean} [options.preserveDrawingBuffer=false] - Enables drawing buffer preservation,
  *  enable this if you need to call toDataUrl on the WebGL context.
  * @param {boolean} [options.clearBeforeRender=true] - This sets if the renderer will clear the canvas or
  *      not before the new render pass.
  * @param {number} [options.backgroundColor=0x000000] - The background color of the rendered area
  *  (shown if not transparent).
  * @param {number} [options.backgroundAlpha=1] - Value from 0 (fully transparent) to 1 (fully opaque).
  */
abstract class AbstractRenderer ()
  extends typings.pixiCore.mod.AbstractRenderer {
  def this(`type`: typings.pixiConstants.mod.RENDERER_TYPE) = this()
  def this(`type`: Unit, options: IRendererOptions) = this()
  def this(`type`: typings.pixiConstants.mod.RENDERER_TYPE, options: IRendererOptions) = this()
}
