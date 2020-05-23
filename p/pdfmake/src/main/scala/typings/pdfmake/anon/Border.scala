package typings.pdfmake.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var border: js.UndefOr[js.Tuple4[Boolean, Boolean, Boolean, Boolean]] = js.undefined
  var borderColor: js.UndefOr[js.Tuple4[String, String, String, String]] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object Border {
  @scala.inline
  def apply(
    border: js.Tuple4[Boolean, Boolean, Boolean, Boolean] = null,
    borderColor: js.Tuple4[String, String, String, String] = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    rowSpan: js.UndefOr[Double] = js.undefined
  ): Border = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

