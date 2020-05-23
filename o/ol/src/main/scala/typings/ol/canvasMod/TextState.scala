package typings.ol.canvasMod

import typings.ol.fillMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextState extends js.Object {
  var backgroundFill: js.UndefOr[default] = js.undefined
  var backgroundStroke: js.UndefOr[typings.ol.strokeMod.default] = js.undefined
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
    backgroundStroke: typings.ol.strokeMod.default = null,
    maxAngle: js.UndefOr[Double] = js.undefined,
    overflow: js.UndefOr[Boolean] = js.undefined,
    padding: js.Array[Double] = null,
    placement: String = null,
    scale: js.UndefOr[Double] = js.undefined,
    textAlign: String = null
  ): TextState = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    if (backgroundFill != null) __obj.updateDynamic("backgroundFill")(backgroundFill.asInstanceOf[js.Any])
    if (backgroundStroke != null) __obj.updateDynamic("backgroundStroke")(backgroundStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAngle)) __obj.updateDynamic("maxAngle")(maxAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextState]
  }
}

