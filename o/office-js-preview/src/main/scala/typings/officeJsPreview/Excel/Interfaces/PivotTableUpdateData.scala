package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotTable object, for use in `pivotTable.set({ ... })`. */
trait PivotTableUpdateData extends StObject {
  
  /**
    *
    * Specifies if the PivotTable allows the application of multiple PivotFilters on a given PivotField in the table.
    *
    * [Api set: ExcelApi 1.12]
    */
  var allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies whether the PivotTable refreshes when the workbook opens. Corresponds to "Refresh on load" setting in the UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshOnOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.undefined
}
object PivotTableUpdateData {
  
  @scala.inline
  def apply(): PivotTableUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableUpdateData]
  }
  
  @scala.inline
  implicit class PivotTableUpdateDataMutableBuilder[Self <: PivotTableUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultipleFiltersPerField(value: Boolean): Self = StObject.set(x, "allowMultipleFiltersPerField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleFiltersPerFieldUndefined: Self = StObject.set(x, "allowMultipleFiltersPerField", js.undefined)
    
    @scala.inline
    def setEnableDataValueEditing(value: Boolean): Self = StObject.set(x, "enableDataValueEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDataValueEditingUndefined: Self = StObject.set(x, "enableDataValueEditing", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRefreshOnOpen(value: Boolean): Self = StObject.set(x, "refreshOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshOnOpenUndefined: Self = StObject.set(x, "refreshOnOpen", js.undefined)
    
    @scala.inline
    def setUseCustomSortLists(value: Boolean): Self = StObject.set(x, "useCustomSortLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomSortListsUndefined: Self = StObject.set(x, "useCustomSortLists", js.undefined)
  }
}
