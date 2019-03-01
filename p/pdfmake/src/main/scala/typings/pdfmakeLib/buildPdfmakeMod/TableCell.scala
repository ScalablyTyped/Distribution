package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCell extends js.Object {
  var border: js.UndefOr[js.Tuple4[scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean]] = js.undefined
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  var text: java.lang.String
}

object TableCell {
  @scala.inline
  def apply(
    text: java.lang.String,
    border: js.Tuple4[scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean] = null,
    colSpan: scala.Int | scala.Double = null,
    fillColor: java.lang.String = null,
    rowSpan: scala.Int | scala.Double = null
  ): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (border != null) __obj.updateDynamic("border")(border)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
}

