package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.Asterisk
import typings.pdfmake.pdfmakeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var body: js.Array[js.Array[TableCell]]
  var dontBreakRows: js.UndefOr[Boolean] = js.undefined
  var headerRows: js.UndefOr[Double] = js.undefined
  var heights: js.UndefOr[Double | js.Array[Double] | DynamicRowSize] = js.undefined
  var keepWithHeaderRows: js.UndefOr[Double] = js.undefined
  var layout: js.UndefOr[TableLayout] = js.undefined
  var widths: js.UndefOr[Asterisk | auto | js.Array[Size]] = js.undefined
}

object Table {
  @scala.inline
  def apply(
    body: js.Array[js.Array[TableCell]],
    dontBreakRows: js.UndefOr[Boolean] = js.undefined,
    headerRows: Int | Double = null,
    heights: Double | js.Array[Double] | DynamicRowSize = null,
    keepWithHeaderRows: Int | Double = null,
    layout: TableLayout = null,
    widths: Asterisk | auto | js.Array[Size] = null
  ): Table = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(dontBreakRows)) __obj.updateDynamic("dontBreakRows")(dontBreakRows.asInstanceOf[js.Any])
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights.asInstanceOf[js.Any])
    if (keepWithHeaderRows != null) __obj.updateDynamic("keepWithHeaderRows")(keepWithHeaderRows.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

