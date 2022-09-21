package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotTable.toJSON()`. */
trait PivotTableData extends StObject {
  
  /**
    * Specifies if the PivotTable allows the application of multiple PivotFilters on a given PivotField in the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Column Pivot Hierarchies of the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var columnHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
  
  /**
    * The Data Pivot Hierarchies of the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var dataHierarchies: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
  
  /**
    * Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Filter Pivot Hierarchies of the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var filterHierarchies: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.undefined
  
  /**
    * The Pivot Hierarchies of the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var hierarchies: js.UndefOr[js.Array[PivotHierarchyData]] = js.undefined
  
  /**
    * ID of the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the PivotTable refreshes when the workbook opens. Corresponds to "Refresh on load" setting in the UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    */
  var refreshOnOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Row Pivot Hierarchies of the PivotTable.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var rowHierarchies: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
  
  /**
    * Specifies if the PivotTable uses custom lists when sorting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.undefined
}
object PivotTableData {
  
  inline def apply(): PivotTableData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableData]
  }
  
  extension [Self <: PivotTableData](x: Self) {
    
    inline def setAllowMultipleFiltersPerField(value: Boolean): Self = StObject.set(x, "allowMultipleFiltersPerField", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleFiltersPerFieldUndefined: Self = StObject.set(x, "allowMultipleFiltersPerField", js.undefined)
    
    inline def setColumnHierarchies(value: js.Array[RowColumnPivotHierarchyData]): Self = StObject.set(x, "columnHierarchies", value.asInstanceOf[js.Any])
    
    inline def setColumnHierarchiesUndefined: Self = StObject.set(x, "columnHierarchies", js.undefined)
    
    inline def setColumnHierarchiesVarargs(value: RowColumnPivotHierarchyData*): Self = StObject.set(x, "columnHierarchies", js.Array(value*))
    
    inline def setDataHierarchies(value: js.Array[DataPivotHierarchyData]): Self = StObject.set(x, "dataHierarchies", value.asInstanceOf[js.Any])
    
    inline def setDataHierarchiesUndefined: Self = StObject.set(x, "dataHierarchies", js.undefined)
    
    inline def setDataHierarchiesVarargs(value: DataPivotHierarchyData*): Self = StObject.set(x, "dataHierarchies", js.Array(value*))
    
    inline def setEnableDataValueEditing(value: Boolean): Self = StObject.set(x, "enableDataValueEditing", value.asInstanceOf[js.Any])
    
    inline def setEnableDataValueEditingUndefined: Self = StObject.set(x, "enableDataValueEditing", js.undefined)
    
    inline def setFilterHierarchies(value: js.Array[FilterPivotHierarchyData]): Self = StObject.set(x, "filterHierarchies", value.asInstanceOf[js.Any])
    
    inline def setFilterHierarchiesUndefined: Self = StObject.set(x, "filterHierarchies", js.undefined)
    
    inline def setFilterHierarchiesVarargs(value: FilterPivotHierarchyData*): Self = StObject.set(x, "filterHierarchies", js.Array(value*))
    
    inline def setHierarchies(value: js.Array[PivotHierarchyData]): Self = StObject.set(x, "hierarchies", value.asInstanceOf[js.Any])
    
    inline def setHierarchiesUndefined: Self = StObject.set(x, "hierarchies", js.undefined)
    
    inline def setHierarchiesVarargs(value: PivotHierarchyData*): Self = StObject.set(x, "hierarchies", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRefreshOnOpen(value: Boolean): Self = StObject.set(x, "refreshOnOpen", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnOpenUndefined: Self = StObject.set(x, "refreshOnOpen", js.undefined)
    
    inline def setRowHierarchies(value: js.Array[RowColumnPivotHierarchyData]): Self = StObject.set(x, "rowHierarchies", value.asInstanceOf[js.Any])
    
    inline def setRowHierarchiesUndefined: Self = StObject.set(x, "rowHierarchies", js.undefined)
    
    inline def setRowHierarchiesVarargs(value: RowColumnPivotHierarchyData*): Self = StObject.set(x, "rowHierarchies", js.Array(value*))
    
    inline def setUseCustomSortLists(value: Boolean): Self = StObject.set(x, "useCustomSortLists", value.asInstanceOf[js.Any])
    
    inline def setUseCustomSortListsUndefined: Self = StObject.set(x, "useCustomSortLists", js.undefined)
  }
}
