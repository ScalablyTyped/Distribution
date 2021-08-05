package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookWorksheetProtectionOptions extends StObject {
  
  // Represents the worksheet protection option of allowing using auto filter feature.
  var allowAutoFilter: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing deleting columns.
  var allowDeleteColumns: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing deleting rows.
  var allowDeleteRows: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing formatting cells.
  var allowFormatCells: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing formatting columns.
  var allowFormatColumns: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing formatting rows.
  var allowFormatRows: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing inserting columns.
  var allowInsertColumns: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing inserting hyperlinks.
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing inserting rows.
  var allowInsertRows: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing using pivot table feature.
  var allowPivotTables: js.UndefOr[Boolean] = js.undefined
  
  // Represents the worksheet protection option of allowing using sort feature.
  var allowSort: js.UndefOr[Boolean] = js.undefined
}
object WorkbookWorksheetProtectionOptions {
  
  inline def apply(): WorkbookWorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheetProtectionOptions]
  }
  
  extension [Self <: WorkbookWorksheetProtectionOptions](x: Self) {
    
    inline def setAllowAutoFilter(value: Boolean): Self = StObject.set(x, "allowAutoFilter", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoFilterUndefined: Self = StObject.set(x, "allowAutoFilter", js.undefined)
    
    inline def setAllowDeleteColumns(value: Boolean): Self = StObject.set(x, "allowDeleteColumns", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteColumnsUndefined: Self = StObject.set(x, "allowDeleteColumns", js.undefined)
    
    inline def setAllowDeleteRows(value: Boolean): Self = StObject.set(x, "allowDeleteRows", value.asInstanceOf[js.Any])
    
    inline def setAllowDeleteRowsUndefined: Self = StObject.set(x, "allowDeleteRows", js.undefined)
    
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
  }
}
