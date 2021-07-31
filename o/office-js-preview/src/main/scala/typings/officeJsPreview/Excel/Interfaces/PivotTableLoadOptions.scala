package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an Excel PivotTable.
  To learn more about the PivotTable object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-pivottables | Work with PivotTables using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.3]
  */
trait PivotTableLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
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
    * Id of the PivotTable.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The PivotLayout describing the layout and visual structure of the PivotTable.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layout: js.UndefOr[PivotLayoutLoadOptions] = js.undefined
  
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
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
  
  /**
    *
    * The worksheet containing the current PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}
object PivotTableLoadOptions {
  
  @scala.inline
  def apply(): PivotTableLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableLoadOptions]
  }
  
  @scala.inline
  implicit class PivotTableLoadOptionsMutableBuilder[Self <: PivotTableLoadOptions] (val x: Self) extends AnyVal {
    
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
