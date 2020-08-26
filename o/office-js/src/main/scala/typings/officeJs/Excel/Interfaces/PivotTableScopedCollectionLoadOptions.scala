package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a scoped collection of PivotTables. The PivotTables are sorted based on the location of the PivotTable's top-left corner. They are ordered top to bottom and then left to right.
  *
  * [Api set: ExcelApiOnline 1.1]
  */
@js.native
trait PivotTableScopedCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Id of the PivotTable.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The PivotLayout describing the layout and visual structure of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layout: js.UndefOr[PivotLayoutLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The worksheet containing the current PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
}

object PivotTableScopedCollectionLoadOptions {
  @scala.inline
  def apply(): PivotTableScopedCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableScopedCollectionLoadOptions]
  }
  @scala.inline
  implicit class PivotTableScopedCollectionLoadOptionsOps[Self <: PivotTableScopedCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def setEnableDataValueEditing(value: Boolean): Self = this.set("enableDataValueEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDataValueEditing: Self = this.set("enableDataValueEditing", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLayout(value: PivotLayoutLoadOptions): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUseCustomSortLists(value: Boolean): Self = this.set("useCustomSortLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCustomSortLists: Self = this.set("useCustomSortLists", js.undefined)
    @scala.inline
    def setWorksheet(value: WorksheetLoadOptions): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

