package typings
package olLib.renderCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextState extends js.Object {
  var backgroundFill: js.UndefOr[olLib.styleFillMod.default] = js.undefined
  var backgroundStroke: js.UndefOr[olLib.styleStrokeMod.default] = js.undefined
  var font: java.lang.String
  var maxAngle: js.UndefOr[scala.Double] = js.undefined
  var overflow: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var textBaseline: java.lang.String
}

object TextState {
  @scala.inline
  def apply(
    font: java.lang.String,
    textBaseline: java.lang.String,
    backgroundFill: olLib.styleFillMod.default = null,
    backgroundStroke: olLib.styleStrokeMod.default = null,
    maxAngle: scala.Int | scala.Double = null,
    overflow: js.UndefOr[scala.Boolean] = js.undefined,
    padding: js.Array[scala.Double] = null,
    placement: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    textAlign: java.lang.String = null
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

