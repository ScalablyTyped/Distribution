package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.SortField
import typings.officeJsPreview.Excel.SortMethod
import typings.officeJsPreview.officeJsPreviewStrings.PinYin
import typings.officeJsPreview.officeJsPreviewStrings.StrokeCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableSort.toJSON()`. */
@js.native
trait TableSortData extends js.Object {
  /**
    *
    * Specifies the current conditions used to last sort the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[js.Array[SortField]] = js.native
  /**
    *
    * Specifies if the casing impacts the last sort of the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents Chinese character ordering method last used to sort the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var method: js.UndefOr[SortMethod | PinYin | StrokeCount] = js.native
}

object TableSortData {
  @scala.inline
  def apply(): TableSortData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSortData]
  }
  @scala.inline
  implicit class TableSortDataOps[Self <: TableSortData] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: SortField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SortField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    @scala.inline
    def setMethod(value: SortMethod | PinYin | StrokeCount): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

