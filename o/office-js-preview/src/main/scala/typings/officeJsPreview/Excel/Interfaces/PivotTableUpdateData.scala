package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTable object, for use in `pivotTable.set({ ... })`. */
@js.native
trait PivotTableUpdateData extends js.Object {
  /**
    *
    * Specifies if the PivotTable allows the application of multiple PivotFilters on a given PivotField in the table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.native
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Specifies if the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.native
}

object PivotTableUpdateData {
  @scala.inline
  def apply(): PivotTableUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableUpdateData]
  }
  @scala.inline
  implicit class PivotTableUpdateDataOps[Self <: PivotTableUpdateData] (val x: Self) extends AnyVal {
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
    def setAllowMultipleFiltersPerField(value: Boolean): Self = this.set("allowMultipleFiltersPerField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultipleFiltersPerField: Self = this.set("allowMultipleFiltersPerField", js.undefined)
    @scala.inline
    def setEnableDataValueEditing(value: Boolean): Self = this.set("enableDataValueEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDataValueEditing: Self = this.set("enableDataValueEditing", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUseCustomSortLists(value: Boolean): Self = this.set("useCustomSortLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCustomSortLists: Self = this.set("useCustomSortLists", js.undefined)
  }
  
}

