package typings.pdfmake.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var body: js.Array[js.Array[Content | TableCell]]
  var dontBreakRows: js.UndefOr[Boolean] = js.undefined
  var headerRows: js.UndefOr[Double] = js.undefined
  var heights: js.UndefOr[(js.Array[String | Double]) | TableRowFunction] = js.undefined
  var layout: js.UndefOr[String | TableLayoutFunctions] = js.undefined
  var widths: js.UndefOr[js.Array[String | Double]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    body: js.Array[js.Array[Content | TableCell]],
    dontBreakRows: js.UndefOr[Boolean] = js.undefined,
    headerRows: Int | Double = null,
    heights: (js.Array[String | Double]) | TableRowFunction = null,
    layout: String | TableLayoutFunctions = null,
    widths: js.Array[String | Double] = null
  ): Table = {
    val __obj = js.Dynamic.literal(body = body)
    if (!js.isUndefined(dontBreakRows)) __obj.updateDynamic("dontBreakRows")(dontBreakRows)
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[Table]
  }
}

