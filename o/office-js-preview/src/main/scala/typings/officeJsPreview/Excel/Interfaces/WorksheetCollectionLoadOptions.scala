package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of worksheet objects that are part of the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
trait WorksheetCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents the AutoFilter object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns a collection of charts that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[ChartCollectionLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Determines if Excel should recalculate the worksheet when necessary.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns sheet protection object for a worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if gridlines are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if headings are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Returns the standard (default) height of all the rows in the worksheet, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The tab color of the worksheet.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Collection of tables that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object WorksheetCollectionLoadOptions {
  
  @scala.inline
  def apply(): WorksheetCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class WorksheetCollectionLoadOptionsMutableBuilder[Self <: WorksheetCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAutoFilter(value: AutoFilterLoadOptions): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
    
    @scala.inline
    def setCharts(value: ChartCollectionLoadOptions): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
    
    @scala.inline
    def setEnableCalculation(value: Boolean): Self = StObject.set(x, "enableCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCalculationUndefined: Self = StObject.set(x, "enableCalculation", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageLayout(value: PageLayoutLoadOptions): Self = StObject.set(x, "pageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLayoutUndefined: Self = StObject.set(x, "pageLayout", js.undefined)
    
    @scala.inline
    def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setProtection(value: WorksheetProtectionLoadOptions): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    @scala.inline
    def setShowGridlines(value: Boolean): Self = StObject.set(x, "showGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridlinesUndefined: Self = StObject.set(x, "showGridlines", js.undefined)
    
    @scala.inline
    def setShowHeadings(value: Boolean): Self = StObject.set(x, "showHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeadingsUndefined: Self = StObject.set(x, "showHeadings", js.undefined)
    
    @scala.inline
    def setStandardHeight(value: Boolean): Self = StObject.set(x, "standardHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardHeightUndefined: Self = StObject.set(x, "standardHeight", js.undefined)
    
    @scala.inline
    def setStandardWidth(value: Boolean): Self = StObject.set(x, "standardWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardWidthUndefined: Self = StObject.set(x, "standardWidth", js.undefined)
    
    @scala.inline
    def setTabColor(value: Boolean): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
    
    @scala.inline
    def setTables(value: TableCollectionLoadOptions): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
