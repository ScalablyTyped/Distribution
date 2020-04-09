package typings.pdfmake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorder extends js.Object {
  var border: js.UndefOr[js.Tuple4[Boolean, Boolean, Boolean, Boolean]] = js.undefined
  var borderColor: js.UndefOr[js.Tuple4[String, String, String, String]] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object AnonBorder {
  @scala.inline
  def apply(
    border: js.Tuple4[Boolean, Boolean, Boolean, Boolean] = null,
    borderColor: js.Tuple4[String, String, String, String] = null,
    colSpan: Int | Double = null,
    fillOpacity: Int | Double = null,
    rowSpan: Int | Double = null
  ): AnonBorder = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorder]
  }
}

