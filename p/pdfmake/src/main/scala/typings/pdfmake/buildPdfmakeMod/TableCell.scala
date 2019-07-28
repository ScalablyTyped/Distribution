package typings.pdfmake.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  var border: js.UndefOr[js.Tuple4[Boolean, Boolean, Boolean, Boolean]] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var text: String
}

object TableCell {
  @scala.inline
  def apply(
    text: String,
    border: js.Tuple4[Boolean, Boolean, Boolean, Boolean] = null,
    colSpan: Int | Double = null,
    fillColor: String = null,
    rowSpan: Int | Double = null
  ): TableCell = {
    val __obj = js.Dynamic.literal(text = text)
    if (border != null) __obj.updateDynamic("border")(border)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
}

