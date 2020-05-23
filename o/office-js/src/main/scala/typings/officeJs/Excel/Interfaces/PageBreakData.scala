package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pageBreak.toJSON()`. */
trait PageBreakData extends js.Object {
  /**
    *
    * Specifies the column index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the row index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object PageBreakData {
  @scala.inline
  def apply(columnIndex: js.UndefOr[Double] = js.undefined, rowIndex: js.UndefOr[Double] = js.undefined): PageBreakData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageBreakData]
  }
}

