package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// renderers
trait RendererOptions extends js.Object {
  /**
    * sets antialias (only applicable in chrome at the moment) [default=false]
    */
  var antialias: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Deprecated
    */
  var autoResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The background color of the rendered area (shown if not transparent) [default=0x000000]
    */
  var backgroundColor: js.UndefOr[scala.Double] = js.undefined
  /**
    * This sets if the renderer will clear the canvas or not before the new render pass. [default=true]
    */
  var clearBeforeRender: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Deprecated
    */
  var context: js.UndefOr[stdLib.WebGLRenderingContext] = js.undefined
  /**
    * prevents selection of WebGL renderer, even if such is present [default=false]
    */
  var forceCanvas: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * forces FXAA antialiasing to be used over native FXAA is faster, but may not always look as great ** webgl only** [default=false]
    */
  var forceFXAA: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the height of the renderers view [default=600]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * `true` to ensure compatibility with older / less advanced devices. If you experience unexplained flickering try setting this to true. **webgl only** [default=false]
    */
  var legacy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Parameter passed to webgl context, set to "high-performance" for devices with dual graphics card
    */
  var powerPreference: js.UndefOr[pixiDotJsLib.pixiDotJsLibStrings.`high-performance`] = js.undefined
  /**
    * enables drawing buffer preservation, enable this if you need to call toDataUrl on the webgl context [default=false]
    */
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The resolution / device pixel ratio of the renderer, retina would be 2 [default=1]
    */
  var resolution: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true Pixi will Math.floor() x/ y values when rendering, stopping pixel interpolation. [default=false]
    */
  var roundPixels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If the render view is transparent, [default=false]
    */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * the canvas to use as a view, optional
    */
  var view: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  /**
    * the width of the renderers view [default=800]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object RendererOptions {
  @scala.inline
  def apply(
    antialias: js.UndefOr[scala.Boolean] = js.undefined,
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: scala.Int | scala.Double = null,
    clearBeforeRender: js.UndefOr[scala.Boolean] = js.undefined,
    context: stdLib.WebGLRenderingContext = null,
    forceCanvas: js.UndefOr[scala.Boolean] = js.undefined,
    forceFXAA: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    legacy: js.UndefOr[scala.Boolean] = js.undefined,
    powerPreference: pixiDotJsLib.pixiDotJsLibStrings.`high-performance` = null,
    preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined,
    resolution: scala.Int | scala.Double = null,
    roundPixels: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    view: stdLib.HTMLCanvasElement = null,
    width: scala.Int | scala.Double = null
  ): RendererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(clearBeforeRender)) __obj.updateDynamic("clearBeforeRender")(clearBeforeRender)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(forceCanvas)) __obj.updateDynamic("forceCanvas")(forceCanvas)
    if (!js.isUndefined(forceFXAA)) __obj.updateDynamic("forceFXAA")(forceFXAA)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(legacy)) __obj.updateDynamic("legacy")(legacy)
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference)
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(roundPixels)) __obj.updateDynamic("roundPixels")(roundPixels)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererOptions]
  }
}

