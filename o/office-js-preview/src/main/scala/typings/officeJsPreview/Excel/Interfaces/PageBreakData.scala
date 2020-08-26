package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pageBreak.toJSON()`. */
@js.native
trait PageBreakData extends js.Object {
  /**
    *
    * Specifies the column index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the row index for the page break
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Double] = js.native
}

object PageBreakData {
  @scala.inline
  def apply(): PageBreakData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakData]
  }
  @scala.inline
  implicit class PageBreakDataOps[Self <: PageBreakData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}

