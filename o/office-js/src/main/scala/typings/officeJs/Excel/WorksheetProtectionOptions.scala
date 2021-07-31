package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Normal
import typings.officeJs.officeJsStrings.Unlocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the options in sheet protection.
  *
  * [Api set: ExcelApi 1.2]
  */
trait WorksheetProtectionOptions extends StObject {
  
  /**
    *
    * Represents the worksheet protection option of allowing using auto filter feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowAutoFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing deleting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing deleting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing editing objects.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditObjects: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing editing scenarios.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditScenarios: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing formatting cells.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing formatting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing formatting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing inserting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing inserting hyperlinks.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing inserting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing using PivotTable feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowPivotTables: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of allowing using sort feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowSort: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the worksheet protection option of selection mode.
    *
    * [Api set: ExcelApi 1.7]
    */
  var selectionMode: js.UndefOr[ProtectionSelectionMode | Normal | Unlocked | None] = js.undefined
}
object WorksheetProtectionOptions {
  
  @scala.inline
  def apply(): WorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionOptions]
  }
  
  @scala.inline
  implicit class WorksheetProtectionOptionsMutableBuilder[Self <: WorksheetProtectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAutoFilter(value: Boolean): Self = StObject.set(x, "allowAutoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAutoFilterUndefined: Self = StObject.set(x, "allowAutoFilter", js.undefined)
    
    @scala.inline
    def setAllowDeleteColumns(value: Boolean): Self = StObject.set(x, "allowDeleteColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeleteColumnsUndefined: Self = StObject.set(x, "allowDeleteColumns", js.undefined)
    
    @scala.inline
    def setAllowDeleteRows(value: Boolean): Self = StObject.set(x, "allowDeleteRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeleteRowsUndefined: Self = StObject.set(x, "allowDeleteRows", js.undefined)
    
    @scala.inline
    def setAllowEditObjects(value: Boolean): Self = StObject.set(x, "allowEditObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditObjectsUndefined: Self = StObject.set(x, "allowEditObjects", js.undefined)
    
    @scala.inline
    def setAllowEditScenarios(value: Boolean): Self = StObject.set(x, "allowEditScenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditScenariosUndefined: Self = StObject.set(x, "allowEditScenarios", js.undefined)
    
    @scala.inline
    def setAllowFormatCells(value: Boolean): Self = StObject.set(x, "allowFormatCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFormatCellsUndefined: Self = StObject.set(x, "allowFormatCells", js.undefined)
    
    @scala.inline
    def setAllowFormatColumns(value: Boolean): Self = StObject.set(x, "allowFormatColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFormatColumnsUndefined: Self = StObject.set(x, "allowFormatColumns", js.undefined)
    
    @scala.inline
    def setAllowFormatRows(value: Boolean): Self = StObject.set(x, "allowFormatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFormatRowsUndefined: Self = StObject.set(x, "allowFormatRows", js.undefined)
    
    @scala.inline
    def setAllowInsertColumns(value: Boolean): Self = StObject.set(x, "allowInsertColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInsertColumnsUndefined: Self = StObject.set(x, "allowInsertColumns", js.undefined)
    
    @scala.inline
    def setAllowInsertHyperlinks(value: Boolean): Self = StObject.set(x, "allowInsertHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInsertHyperlinksUndefined: Self = StObject.set(x, "allowInsertHyperlinks", js.undefined)
    
    @scala.inline
    def setAllowInsertRows(value: Boolean): Self = StObject.set(x, "allowInsertRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInsertRowsUndefined: Self = StObject.set(x, "allowInsertRows", js.undefined)
    
    @scala.inline
    def setAllowPivotTables(value: Boolean): Self = StObject.set(x, "allowPivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPivotTablesUndefined: Self = StObject.set(x, "allowPivotTables", js.undefined)
    
    @scala.inline
    def setAllowSort(value: Boolean): Self = StObject.set(x, "allowSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSortUndefined: Self = StObject.set(x, "allowSort", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: ProtectionSelectionMode | Normal | Unlocked | None): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
