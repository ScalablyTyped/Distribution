package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotTable.toJSON()`. */
trait PivotTableData extends js.Object {
  /**
    *
    * Specifies if the PivotTable allows the application of multiple PivotFilters on a given PivotField in the table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The Column Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var columnHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
  /**
    *
    * The Data Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataHierarchies: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
  /**
    *
    * Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The Filter Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var filterHierarchies: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.undefined
  /**
    *
    * The Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var hierarchies: js.UndefOr[js.Array[PivotHierarchyData]] = js.undefined
  /**
    *
    * Id of the PivotTable.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * The Row Pivot Hierarchies of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rowHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
  /**
    *
    * Specifies if the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.undefined
}

object PivotTableData {
  @scala.inline
  def apply(
    allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.undefined,
    columnHierarchies: js.Array[RowColumnPivotHierarchyData] = null,
    dataHierarchies: js.Array[DataPivotHierarchyData] = null,
    enableDataValueEditing: js.UndefOr[Boolean] = js.undefined,
    filterHierarchies: js.Array[FilterPivotHierarchyData] = null,
    hierarchies: js.Array[PivotHierarchyData] = null,
    id: String = null,
    name: String = null,
    rowHierarchies: js.Array[RowColumnPivotHierarchyData] = null,
    useCustomSortLists: js.UndefOr[Boolean] = js.undefined
  ): PivotTableData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleFiltersPerField)) __obj.updateDynamic("allowMultipleFiltersPerField")(allowMultipleFiltersPerField.get.asInstanceOf[js.Any])
    if (columnHierarchies != null) __obj.updateDynamic("columnHierarchies")(columnHierarchies.asInstanceOf[js.Any])
    if (dataHierarchies != null) __obj.updateDynamic("dataHierarchies")(dataHierarchies.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDataValueEditing)) __obj.updateDynamic("enableDataValueEditing")(enableDataValueEditing.get.asInstanceOf[js.Any])
    if (filterHierarchies != null) __obj.updateDynamic("filterHierarchies")(filterHierarchies.asInstanceOf[js.Any])
    if (hierarchies != null) __obj.updateDynamic("hierarchies")(hierarchies.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rowHierarchies != null) __obj.updateDynamic("rowHierarchies")(rowHierarchies.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomSortLists)) __obj.updateDynamic("useCustomSortLists")(useCustomSortLists.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableData]
  }
}

