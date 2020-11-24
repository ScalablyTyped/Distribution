package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Normal
import typings.officeJsPreview.officeJsPreviewStrings.Unlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the options in sheet protection.
  *
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait WorksheetProtectionOptions extends js.Object {
  
  /**
    *
    * Represents the worksheet protection option of allowing using auto filter feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowAutoFilter: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing deleting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteColumns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing deleting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteRows: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing editing objects.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditObjects: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing editing scenarios.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditScenarios: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing formatting cells.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatCells: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing formatting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatColumns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing formatting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatRows: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing inserting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertColumns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing inserting hyperlinks.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing inserting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertRows: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing using PivotTable feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowPivotTables: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of allowing using sort feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowSort: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the worksheet protection option of selection mode.
    *
    * [Api set: ExcelApi 1.7]
    */
  var selectionMode: js.UndefOr[ProtectionSelectionMode | Normal | Unlocked | None] = js.native
}
object WorksheetProtectionOptions {
  
  @scala.inline
  def apply(): WorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetProtectionOptions]
  }
  
  @scala.inline
  implicit class WorksheetProtectionOptionsOps[Self <: WorksheetProtectionOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowEditObjects(value: Boolean): Self = this.set("allowEditObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEditObjects: Self = this.set("allowEditObjects", js.undefined)
    
    @scala.inline
    def setAllowEditScenarios(value: Boolean): Self = this.set("allowEditScenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEditScenarios: Self = this.set("allowEditScenarios", js.undefined)
    
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
    
    @scala.inline
    def setSelectionMode(value: ProtectionSelectionMode | Normal | Unlocked | None): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
}
