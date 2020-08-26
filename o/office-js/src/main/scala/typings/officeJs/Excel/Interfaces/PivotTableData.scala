package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotTable.toJSON()`. */
@js.native
trait PivotTableData extends js.Object {
  /**
    *
    * The Column Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var columnHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.native
  /**
    *
    * The Data Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataHierarchies: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.native
  /**
    *
    * Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.native
  /**
    *
    * The Filter Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var filterHierarchies: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.native
  /**
    *
    * The Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var hierarchies: js.UndefOr[js.Array[PivotHierarchyData]] = js.native
  /**
    *
    * Id of the PivotTable.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * The Row Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rowHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.native
  /**
    *
    * Specifies if the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.native
}

object PivotTableData {
  @scala.inline
  def apply(): PivotTableData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableData]
  }
  @scala.inline
  implicit class PivotTableDataOps[Self <: PivotTableData] (val x: Self) extends AnyVal {
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
    def setColumnHierarchiesVarargs(value: RowColumnPivotHierarchyData*): Self = this.set("columnHierarchies", js.Array(value :_*))
    @scala.inline
    def setColumnHierarchies(value: js.Array[RowColumnPivotHierarchyData]): Self = this.set("columnHierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHierarchies: Self = this.set("columnHierarchies", js.undefined)
    @scala.inline
    def setDataHierarchiesVarargs(value: DataPivotHierarchyData*): Self = this.set("dataHierarchies", js.Array(value :_*))
    @scala.inline
    def setDataHierarchies(value: js.Array[DataPivotHierarchyData]): Self = this.set("dataHierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataHierarchies: Self = this.set("dataHierarchies", js.undefined)
    @scala.inline
    def setEnableDataValueEditing(value: Boolean): Self = this.set("enableDataValueEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDataValueEditing: Self = this.set("enableDataValueEditing", js.undefined)
    @scala.inline
    def setFilterHierarchiesVarargs(value: FilterPivotHierarchyData*): Self = this.set("filterHierarchies", js.Array(value :_*))
    @scala.inline
    def setFilterHierarchies(value: js.Array[FilterPivotHierarchyData]): Self = this.set("filterHierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterHierarchies: Self = this.set("filterHierarchies", js.undefined)
    @scala.inline
    def setHierarchiesVarargs(value: PivotHierarchyData*): Self = this.set("hierarchies", js.Array(value :_*))
    @scala.inline
    def setHierarchies(value: js.Array[PivotHierarchyData]): Self = this.set("hierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHierarchies: Self = this.set("hierarchies", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRowHierarchiesVarargs(value: RowColumnPivotHierarchyData*): Self = this.set("rowHierarchies", js.Array(value :_*))
    @scala.inline
    def setRowHierarchies(value: js.Array[RowColumnPivotHierarchyData]): Self = this.set("rowHierarchies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHierarchies: Self = this.set("rowHierarchies", js.undefined)
    @scala.inline
    def setUseCustomSortLists(value: Boolean): Self = this.set("useCustomSortLists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCustomSortLists: Self = this.set("useCustomSortLists", js.undefined)
  }
  
}

