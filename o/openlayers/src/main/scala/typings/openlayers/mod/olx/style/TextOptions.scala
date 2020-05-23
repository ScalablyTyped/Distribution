package typings.openlayers.mod.olx.style

import typings.openlayers.mod.style.Fill
import typings.openlayers.mod.style.Stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextOptions extends js.Object {
  var backgroundFill: js.UndefOr[Fill] = js.undefined
  var backgroundStroke: js.UndefOr[Stroke] = js.undefined
  var fill: js.UndefOr[Fill] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var maxAngle: js.UndefOr[Boolean] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var overflow: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  var placement: js.UndefOr[TextPlacement] = js.undefined
  var rotateWithView: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[Stroke] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var textBaseline: js.UndefOr[String] = js.undefined
}

object TextOptions {
  @scala.inline
  def apply(
    backgroundFill: Fill = null,
    backgroundStroke: Stroke = null,
    fill: Fill = null,
    font: String = null,
    maxAngle: js.UndefOr[Boolean] = js.undefined,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    overflow: js.UndefOr[Boolean] = js.undefined,
    padding: js.Array[Double] = null,
    placement: TextPlacement = null,
    rotateWithView: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    stroke: Stroke = null,
    text: String = null,
    textAlign: String = null,
    textBaseline: String = null
  ): TextOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundFill != null) __obj.updateDynamic("backgroundFill")(backgroundFill.asInstanceOf[js.Any])
    if (backgroundStroke != null) __obj.updateDynamic("backgroundStroke")(backgroundStroke.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAngle)) __obj.updateDynamic("maxAngle")(maxAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textBaseline != null) __obj.updateDynamic("textBaseline")(textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
}

