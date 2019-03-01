package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var body: js.Array[js.Array[Content]] | js.Array[js.Array[TableCell]]
  var headerRows: js.UndefOr[scala.Double] = js.undefined
  var heights: js.UndefOr[(js.Array[java.lang.String | scala.Double]) | TableRowFunction] = js.undefined
  var layout: js.UndefOr[java.lang.String | TableLayoutFunctions] = js.undefined
  var widths: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    body: js.Array[js.Array[Content]] | js.Array[js.Array[TableCell]],
    headerRows: scala.Int | scala.Double = null,
    heights: (js.Array[java.lang.String | scala.Double]) | TableRowFunction = null,
    layout: java.lang.String | TableLayoutFunctions = null,
    widths: js.Array[java.lang.String | scala.Double] = null
  ): Table = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[Table]
  }
}

