package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookWorksheetProtectionOptions extends StObject {
  
  // Represents the worksheet protection option of allowing using auto filter feature.
  var allowAutoFilter: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing deleting columns.
  var allowDeleteColumns: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing deleting rows.
  var allowDeleteRows: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing formatting cells.
  var allowFormatCells: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing formatting columns.
  var allowFormatColumns: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing formatting rows.
  var allowFormatRows: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing inserting columns.
  var allowInsertColumns: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing inserting hyperlinks.
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing inserting rows.
  var allowInsertRows: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing using pivot table feature.
  var allowPivotTables: js.UndefOr[Boolean] = js.native
  
  // Represents the worksheet protection option of allowing using sort feature.
  var allowSort: js.UndefOr[Boolean] = js.native
}
object WorkbookWorksheetProtectionOptions {
  
  @scala.inline
  def apply(): WorkbookWorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookWorksheetProtectionOptions]
  }
  
  @scala.inline
  implicit class WorkbookWorksheetProtectionOptionsMutableBuilder[Self <: WorkbookWorksheetProtectionOptions] (val x: Self) extends AnyVal {
    
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
  }
}
