package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the PivotTables that are part of the workbook or worksheet.
  *
  * [Api set: ExcelApi 1.3]
  */
trait PivotTableCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotTable allows the application of multiple PivotFilters on a given PivotField in the table.
    *
    * [Api set: ExcelApi 1.12]
    */
  var allowMultipleFiltersPerField: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotTable allows values in the data body to be edited by the user.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableDataValueEditing: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Id of the PivotTable.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The PivotLayout describing the layout and visual structure of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layout: js.UndefOr[PivotLayoutLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies whether the PivotTable refreshes when the workbook opens. Corresponds to "Refresh on load" setting in the UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var refreshOnOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotTable uses custom lists when sorting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useCustomSortLists: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The worksheet containing the current PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}
object PivotTableCollectionLoadOptions {
  
  @scala.inline
  def apply(): PivotTableCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class PivotTableCollectionLoadOptionsMutableBuilder[Self <: PivotTableCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAllowMultipleFiltersPerField(value: Boolean): Self = StObject.set(x, "allowMultipleFiltersPerField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleFiltersPerFieldUndefined: Self = StObject.set(x, "allowMultipleFiltersPerField", js.undefined)
    
    @scala.inline
    def setEnableDataValueEditing(value: Boolean): Self = StObject.set(x, "enableDataValueEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDataValueEditingUndefined: Self = StObject.set(x, "enableDataValueEditing", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLayout(value: PivotLayoutLoadOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setWorksheet(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
