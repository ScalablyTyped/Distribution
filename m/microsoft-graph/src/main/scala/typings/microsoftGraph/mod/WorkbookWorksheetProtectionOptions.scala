package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookWorksheetProtectionOptions extends js.Object {
  
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
  implicit class WorkbookWorksheetProtectionOptionsOps[Self <: WorkbookWorksheetProtectionOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowAutoFilter(value: Boolean): Self = this.set("allowAutoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoFilter: Self = this.set("allowAutoFilter", js.undefined)
    
    @scala.inline
    def setAllowDeleteColumns(value: Boolean): Self = this.set("allowDeleteColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteColumns: Self = this.set("allowDeleteColumns", js.undefined)
    
    @scala.inline
    def setAllowDeleteRows(value: Boolean): Self = this.set("allowDeleteRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteRows: Self = this.set("allowDeleteRows", js.undefined)
    
    @scala.inline
    def setAllowFormatCells(value: Boolean): Self = this.set("allowFormatCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFormatCells: Self = this.set("allowFormatCells", js.undefined)
    
    @scala.inline
    def setAllowFormatColumns(value: Boolean): Self = this.set("allowFormatColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFormatColumns: Self = this.set("allowFormatColumns", js.undefined)
    
    @scala.inline
    def setAllowFormatRows(value: Boolean): Self = this.set("allowFormatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFormatRows: Self = this.set("allowFormatRows", js.undefined)
    
    @scala.inline
    def setAllowInsertColumns(value: Boolean): Self = this.set("allowInsertColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsertColumns: Self = this.set("allowInsertColumns", js.undefined)
    
    @scala.inline
    def setAllowInsertHyperlinks(value: Boolean): Self = this.set("allowInsertHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsertHyperlinks: Self = this.set("allowInsertHyperlinks", js.undefined)
    
    @scala.inline
    def setAllowInsertRows(value: Boolean): Self = this.set("allowInsertRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsertRows: Self = this.set("allowInsertRows", js.undefined)
    
    @scala.inline
    def setAllowPivotTables(value: Boolean): Self = this.set("allowPivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPivotTables: Self = this.set("allowPivotTables", js.undefined)
    
    @scala.inline
    def setAllowSort(value: Boolean): Self = this.set("allowSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSort: Self = this.set("allowSort", js.undefined)
  }
}
