package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Normal
import typings.officeJs.officeJsStrings.Unlocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the options in sheet protection.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait WorksheetProtectionOptions extends StObject {
  
  /**
    * Represents the worksheet protection option allowing use of the AutoFilter feature.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowAutoFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing deleting of columns.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing deleting of rows.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing editing of objects.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var allowEditObjects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing editing of scenarios.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var allowEditScenarios: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing formatting of cells.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing formatting of columns.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing formatting of rows.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing inserting of columns.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing inserting of hyperlinks.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing inserting of rows.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing use of the PivotTable feature.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowPivotTables: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option allowing use of the sort feature.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var allowSort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the worksheet protection option of selection mode.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var selectionMode: js.UndefOr[ProtectionSelectionMode | Normal | Unlocked | None] = js.undefined
}
object WorksheetProtectionOptions {
  
  inline def apply(): WorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionOptions]
  }
  
  extension [Self <: WorksheetProtectionOptions](x: Self) {
    
    inline def setAllowAutoFilter(value: Boolean): Self = StObject.set(x, "allowAutoFilter", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoFilterUndefined: Self = StObject.set(x, "allowAutoFilter", js.undefined)
    
    inline def setAllowDeleteColumns(value: Boolean): Self = StObject.set(x, "allowDeleteColumns", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteColumnsUndefined: Self = StObject.set(x, "allowDeleteColumns", js.undefined)
    
    inline def setAllowDeleteRows(value: Boolean): Self = StObject.set(x, "allowDeleteRows", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteRowsUndefined: Self = StObject.set(x, "allowDeleteRows", js.undefined)
    
    inline def setAllowEditObjects(value: Boolean): Self = StObject.set(x, "allowEditObjects", value.asInstanceOf[js.Any])
    
    inline def setAllowEditObjectsUndefined: Self = StObject.set(x, "allowEditObjects", js.undefined)
    
    inline def setAllowEditScenarios(value: Boolean): Self = StObject.set(x, "allowEditScenarios", value.asInstanceOf[js.Any])
    
    inline def setAllowEditScenariosUndefined: Self = StObject.set(x, "allowEditScenarios", js.undefined)
    
    inline def setAllowFormatCells(value: Boolean): Self = StObject.set(x, "allowFormatCells", value.asInstanceOf[js.Any])
    
    inline def setAllowFormatCellsUndefined: Self = StObject.set(x, "allowFormatCells", js.undefined)
    
    inline def setAllowFormatColumns(value: Boolean): Self = StObject.set(x, "allowFormatColumns", value.asInstanceOf[js.Any])
    
    inline def setAllowFormatColumnsUndefined: Self = StObject.set(x, "allowFormatColumns", js.undefined)
    
    inline def setAllowFormatRows(value: Boolean): Self = StObject.set(x, "allowFormatRows", value.asInstanceOf[js.Any])
    
    inline def setAllowFormatRowsUndefined: Self = StObject.set(x, "allowFormatRows", js.undefined)
    
    inline def setAllowInsertColumns(value: Boolean): Self = StObject.set(x, "allowInsertColumns", value.asInstanceOf[js.Any])
    
    inline def setAllowInsertColumnsUndefined: Self = StObject.set(x, "allowInsertColumns", js.undefined)
    
    inline def setAllowInsertHyperlinks(value: Boolean): Self = StObject.set(x, "allowInsertHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setAllowInsertHyperlinksUndefined: Self = StObject.set(x, "allowInsertHyperlinks", js.undefined)
    
    inline def setAllowInsertRows(value: Boolean): Self = StObject.set(x, "allowInsertRows", value.asInstanceOf[js.Any])
    
    inline def setAllowInsertRowsUndefined: Self = StObject.set(x, "allowInsertRows", js.undefined)
    
    inline def setAllowPivotTables(value: Boolean): Self = StObject.set(x, "allowPivotTables", value.asInstanceOf[js.Any])
    
    inline def setAllowPivotTablesUndefined: Self = StObject.set(x, "allowPivotTables", js.undefined)
    
    inline def setAllowSort(value: Boolean): Self = StObject.set(x, "allowSort", value.asInstanceOf[js.Any])
    
    inline def setAllowSortUndefined: Self = StObject.set(x, "allowSort", js.undefined)
    
    inline def setSelectionMode(value: ProtectionSelectionMode | Normal | Unlocked | None): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
