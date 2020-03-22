package typings.pixiJs

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAntialias extends js.Object {
  var antialias: js.UndefOr[Boolean] = js.undefined
  var autoDensity: js.UndefOr[Boolean] = js.undefined
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[Double] = js.undefined
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  var forceCanvas: js.UndefOr[Boolean] = js.undefined
  var forceFXAA: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var powerPreference: js.UndefOr[String] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  var resizeTo: js.UndefOr[Window_ | HTMLElement] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var sharedLoader: js.UndefOr[Boolean] = js.undefined
  var sharedTicker: js.UndefOr[Boolean] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var view: js.UndefOr[HTMLCanvasElement] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonAntialias {
  @scala.inline
  def apply(
    antialias: js.UndefOr[Boolean] = js.undefined,
    autoDensity: js.UndefOr[Boolean] = js.undefined,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: Int | Double = null,
    clearBeforeRender: js.UndefOr[Boolean] = js.undefined,
    forceCanvas: js.UndefOr[Boolean] = js.undefined,
    forceFXAA: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    powerPreference: String = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    resizeTo: Window_ | HTMLElement = null,
    resolution: Int | Double = null,
    sharedLoader: js.UndefOr[Boolean] = js.undefined,
    sharedTicker: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    view: HTMLCanvasElement = null,
    width: Int | Double = null
  ): AnonAntialias = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDensity)) __obj.updateDynamic("autoDensity")(autoDensity.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(clearBeforeRender)) __obj.updateDynamic("clearBeforeRender")(clearBeforeRender.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCanvas)) __obj.updateDynamic("forceCanvas")(forceCanvas.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFXAA)) __obj.updateDynamic("forceFXAA")(forceFXAA.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (resizeTo != null) __obj.updateDynamic("resizeTo")(resizeTo.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedLoader)) __obj.updateDynamic("sharedLoader")(sharedLoader.asInstanceOf[js.Any])
    if (!js.isUndefined(sharedTicker)) __obj.updateDynamic("sharedTicker")(sharedTicker.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAntialias]
  }
}

