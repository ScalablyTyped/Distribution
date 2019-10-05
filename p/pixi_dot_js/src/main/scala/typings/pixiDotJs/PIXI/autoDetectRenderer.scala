package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.autoDetectRenderer")
@js.native
object autoDetectRenderer extends js.Object {
  /**
    * This helper function will automatically detect which renderer you should be using.
    * WebGL is the preferred renderer as it is a lot faster. If webGL is not supported by
    * the browser then this function will return a canvas renderer
    * @param [options] - The optional renderer parameters
    * @param [options.width=800] - the width of the renderers view
    * @param [options.height=600] - the height of the renderers view
    * @param [options.view] - the canvas to use as a view, optional
    * @param [options.transparent=false] - If the render view is transparent, default false
    * @param [options.antialias=false] - sets antialias (only applicable in chrome at the moment)
    * @param [options.preserveDrawingBuffer=false] - enables drawing buffer preservation, enable this if you
    *  need to call toDataUrl on the webgl context
    * @param [options.backgroundColor=0x000000] - The background color of the rendered area
    *  (shown if not transparent).
    * @param [options.clearBeforeRender=true] - This sets if the renderer will clear the canvas or
    *   not before the new render pass.
    * @param [options.resolution=1] - The resolution / device pixel ratio of the renderer, retina would be 2
    * @param [options.forceCanvas=false] - prevents selection of WebGL renderer, even if such is present
    * @param [options.roundPixels=false] - If true PixiJS will Math.floor() x/y values when rendering,
    *  stopping pixel interpolation.
    * @param [options.forceFXAA=false] - forces FXAA antialiasing to be used over native.
    *  FXAA is faster, but may not always look as great **webgl only**
    * @param [options.legacy=false] - `true` to ensure compatibility with older / less advanced devices.
    *  If you experience unexplained flickering try setting this to true. **webgl only**
    * @param [options.powerPreference] - Parameter passed to webgl context, set to "high-performance"
    *  for devices with dual graphics card **webgl only**
    * @return Returns WebGL renderer if available, otherwise CanvasRenderer
    */
  def apply(): WebGLRenderer | CanvasRenderer = js.native
  def apply(options: RendererOptions): WebGLRenderer | CanvasRenderer = js.native
  def apply(width: Double, height: Double): WebGLRenderer | CanvasRenderer = js.native
  def apply(width: Double, height: Double, options: RendererOptions): WebGLRenderer | CanvasRenderer = js.native
  def apply(width: Double, height: Double, options: RendererOptions, forceCanvas: Boolean): WebGLRenderer | CanvasRenderer = js.native
}

