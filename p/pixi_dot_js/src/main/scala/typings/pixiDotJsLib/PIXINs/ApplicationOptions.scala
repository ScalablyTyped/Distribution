package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationOptions extends RendererOptions {
  /**
    * automatically starts the rendering after the construction.
    * Note that setting this parameter to false does NOT stop the shared ticker even if you set
    * options.sharedTicker to true in case that it is already started. Stop it by your own.
    */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * `true` to use PIXI.loaders.shared, `false` to create new Loader.
    */
  var sharedLoader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * `true` to use PIXI.ticker.shared, `false` to create new ticker. [default=false]
    */
  var sharedTicker: js.UndefOr[scala.Boolean] = js.undefined
}

object ApplicationOptions {
  @scala.inline
  def apply(
    antialias: js.UndefOr[scala.Boolean] = js.undefined,
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
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
    sharedLoader: js.UndefOr[scala.Boolean] = js.undefined,
    sharedTicker: js.UndefOr[scala.Boolean] = js.undefined,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    view: stdLib.HTMLCanvasElement = null,
    width: scala.Int | scala.Double = null
  ): ApplicationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias)
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
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
    if (!js.isUndefined(sharedLoader)) __obj.updateDynamic("sharedLoader")(sharedLoader)
    if (!js.isUndefined(sharedTicker)) __obj.updateDynamic("sharedTicker")(sharedTicker)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (view != null) __obj.updateDynamic("view")(view)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationOptions]
  }
}

