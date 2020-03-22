package typings.pixiJs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var antialias: js.UndefOr[Boolean] = js.undefined
  var autoDensity: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[Double] = js.undefined
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var forceFXAA: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var powerPreference: js.UndefOr[String] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var view: js.UndefOr[HTMLCanvasElement] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonBackgroundColor {
  @scala.inline
  def apply(
    antialias: js.UndefOr[Boolean] = js.undefined,
    autoDensity: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: Int | Double = null,
    clearBeforeRender: js.UndefOr[Boolean] = js.undefined,
    context: js.Any = null,
    forceFXAA: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    powerPreference: String = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    resolution: Int | Double = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    view: HTMLCanvasElement = null,
    width: Int | Double = null
  ): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDensity)) __obj.updateDynamic("autoDensity")(autoDensity.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(clearBeforeRender)) __obj.updateDynamic("clearBeforeRender")(clearBeforeRender.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFXAA)) __obj.updateDynamic("forceFXAA")(forceFXAA.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (powerPreference != null) __obj.updateDynamic("powerPreference")(powerPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

