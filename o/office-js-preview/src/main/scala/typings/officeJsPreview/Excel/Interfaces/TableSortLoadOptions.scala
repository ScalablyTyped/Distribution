package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Manages sorting operations on Table objects.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait TableSortLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the current conditions used to last sort the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[Boolean] = js.native
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
  var method: js.UndefOr[Boolean] = js.native
}

object TableSortLoadOptions {
  @scala.inline
  def apply(): TableSortLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableSortLoadOptions]
  }
  @scala.inline
  implicit class TableSortLoadOptionsOps[Self <: TableSortLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setFields(value: Boolean): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    @scala.inline
    def setMethod(value: Boolean): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

