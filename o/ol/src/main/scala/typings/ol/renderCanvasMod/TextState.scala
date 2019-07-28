package typings.ol.renderCanvasMod

import typings.ol.styleFillMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextState extends js.Object {
  var backgroundFill: js.UndefOr[default] = js.undefined
  var backgroundStroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
  var font: String
  var maxAngle: js.UndefOr[Double] = js.undefined
  var overflow: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var textBaseline: String
}

object TextState {
  @scala.inline
  def apply(
    font: String,
    textBaseline: String,
    backgroundFill: default = null,
    backgroundStroke: typings.ol.styleStrokeMod.default = null,
    maxAngle: Int | Double = null,
    overflow: js.UndefOr[Boolean] = js.undefined,
    padding: js.Array[Double] = null,
    placement: String = null,
    scale: Int | Double = null,
    textAlign: String = null
  ): TextState = {
    val __obj = js.Dynamic.literal(font = font, textBaseline = textBaseline)
    if (backgroundFill != null) __obj.updateDynamic("backgroundFill")(backgroundFill)
    if (backgroundStroke != null) __obj.updateDynamic("backgroundStroke")(backgroundStroke)
    if (maxAngle != null) __obj.updateDynamic("maxAngle")(maxAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    __obj.asInstanceOf[TextState]
  }
}

