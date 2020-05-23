package typings.pixiJs.anon

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearBeforeRender extends js.Object {
  var antialias: js.UndefOr[Boolean] = js.undefined
  var autoDensity: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[Double] = js.undefined
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  var forceCanvas: js.UndefOr[Boolean] = js.undefined
  var forceFXAA: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var powerPreference: js.UndefOr[String] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var view: js.UndefOr[HTMLCanvasElement] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ClearBeforeRender {
  @scala.inline
  def apply(
    antialias: js.UndefOr[Boolean] = js.undefined,
    autoDensity: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: js.UndefOr[Double] = js.undefined,
    clearBeforeRender: js.UndefOr[Boolean] = js.undefined,
    forceCanvas: js.UndefOr[Boolean] = js.undefined,
    forceFXAA: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    powerPreference: String = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    resolution: js.UndefOr[Double] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    view: HTMLCanvasElement = null,
    width: js.UndefOr[Double] = js.undefined
  ): ClearBeforeRender = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDensity)) __obj.updateDynamic("autoDensity")(autoDensity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearBeforeRender)) __obj.updateDynamic("clearBeforeRender")(clearBeforeRender.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCanvas)) __obj.updateDynamic("forceCanvas")(forceCanvas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFXAA)) __obj.updateDynamic("forceFXAA")(forceFXAA.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearBeforeRender]
  }
}

