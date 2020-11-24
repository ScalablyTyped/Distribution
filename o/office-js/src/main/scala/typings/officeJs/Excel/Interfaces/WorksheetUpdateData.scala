package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.SheetVisibility
import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.VeryHidden
import typings.officeJs.officeJsStrings.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Worksheet object, for use in `worksheet.set({ ... })`. */
@js.native
trait WorksheetUpdateData extends js.Object {
  
  /**
    *
    * Determines if Excel should recalculate the worksheet when necessary.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutUpdateData] = js.native
  
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies if gridlines are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if headings are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Double] = js.native
  
  /**
    *
    * The tab color of the worksheet.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[String] = js.native
  
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[SheetVisibility | Visible | Hidden | VeryHidden] = js.native
}
object WorksheetUpdateData {
  
  @scala.inline
  def apply(): WorksheetUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetUpdateData]
  }
  
  @scala.inline
  implicit class WorksheetUpdateDataOps[Self <: WorksheetUpdateData] (val x: Self) extends AnyVal {
    
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
    def setEnableCalculation(value: Boolean): Self = this.set("enableCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCalculation: Self = this.set("enableCalculation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPageLayout(value: PageLayoutUpdateData): Self = this.set("pageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLayout: Self = this.set("pageLayout", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowGridlines(value: Boolean): Self = this.set("showGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridlines: Self = this.set("showGridlines", js.undefined)
    
    @scala.inline
    def setShowHeadings(value: Boolean): Self = this.set("showHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeadings: Self = this.set("showHeadings", js.undefined)
    
    @scala.inline
    def setStandardWidth(value: Double): Self = this.set("standardWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardWidth: Self = this.set("standardWidth", js.undefined)
    
    @scala.inline
    def setTabColor(value: String): Self = this.set("tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabColor: Self = this.set("tabColor", js.undefined)
    
    @scala.inline
    def setVisibility(value: SheetVisibility | Visible | Hidden | VeryHidden): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
