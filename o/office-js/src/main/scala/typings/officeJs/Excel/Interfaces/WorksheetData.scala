package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.SheetVisibility
import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.VeryHidden
import typings.officeJs.officeJsStrings.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheet.toJSON()`. */
@js.native
trait WorksheetData extends js.Object {
  
  /**
    *
    * Represents the AutoFilter object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterData] = js.native
  
  /**
    *
    * Returns a collection of charts that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[js.Array[ChartData]] = js.native
  
  /**
    *
    * Returns a collection of all the Comments objects on the worksheet.
    *
    * [Api set: ExcelApi 1.10]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.native
  
  /**
    *
    * Gets a collection of worksheet-level custom properties.
    *
    * [Api set: ExcelApi 1.12]
    */
  var customProperties: js.UndefOr[js.Array[WorksheetCustomPropertyData]] = js.native
  
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
    * Gets the horizontal page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalPageBreaks: js.UndefOr[js.Array[PageBreakData]] = js.native
  
  /**
    *
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Collection of names scoped to the current worksheet.
    *
    * [Api set: ExcelApi 1.4]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.native
  
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutData] = js.native
  
  /**
    *
    * Collection of PivotTables that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.native
  
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    *
    * Returns sheet protection object for a worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionData] = js.native
  
  /**
    *
    * Returns the collection of all the Shape objects on the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.native
  
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
    * Returns a collection of slicers that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicers: js.UndefOr[js.Array[SlicerData]] = js.native
  
  /**
    *
    * Returns the standard (default) height of all the rows in the worksheet, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[Double] = js.native
  
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
    * Collection of tables that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.native
  
  /**
    *
    * Gets the vertical page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalPageBreaks: js.UndefOr[js.Array[PageBreakData]] = js.native
  
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[SheetVisibility | Visible | Hidden | VeryHidden] = js.native
}
object WorksheetData {
  
  @scala.inline
  def apply(): WorksheetData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetData]
  }
  
  @scala.inline
  implicit class WorksheetDataOps[Self <: WorksheetData] (val x: Self) extends AnyVal {
    
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
    def setAutoFilter(value: AutoFilterData): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFilter: Self = this.set("autoFilter", js.undefined)
    
    @scala.inline
    def setChartsVarargs(value: ChartData*): Self = this.set("charts", js.Array(value :_*))
    
    @scala.inline
    def setCharts(value: js.Array[ChartData]): Self = this.set("charts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharts: Self = this.set("charts", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentData*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentData]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCustomPropertiesVarargs(value: WorksheetCustomPropertyData*): Self = this.set("customProperties", js.Array(value :_*))
    
    @scala.inline
    def setCustomProperties(value: js.Array[WorksheetCustomPropertyData]): Self = this.set("customProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomProperties: Self = this.set("customProperties", js.undefined)
    
    @scala.inline
    def setEnableCalculation(value: Boolean): Self = this.set("enableCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCalculation: Self = this.set("enableCalculation", js.undefined)
    
    @scala.inline
    def setHorizontalPageBreaksVarargs(value: PageBreakData*): Self = this.set("horizontalPageBreaks", js.Array(value :_*))
    
    @scala.inline
    def setHorizontalPageBreaks(value: js.Array[PageBreakData]): Self = this.set("horizontalPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalPageBreaks: Self = this.set("horizontalPageBreaks", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: NamedItemData*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[NamedItemData]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    
    @scala.inline
    def setPageLayout(value: PageLayoutData): Self = this.set("pageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLayout: Self = this.set("pageLayout", js.undefined)
    
    @scala.inline
    def setPivotTablesVarargs(value: PivotTableData*): Self = this.set("pivotTables", js.Array(value :_*))
    
    @scala.inline
    def setPivotTables(value: js.Array[PivotTableData]): Self = this.set("pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotTables: Self = this.set("pivotTables", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setProtection(value: WorksheetProtectionData): Self = this.set("protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: ShapeData*): Self = this.set("shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[ShapeData]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    
    @scala.inline
    def setShowGridlines(value: Boolean): Self = this.set("showGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridlines: Self = this.set("showGridlines", js.undefined)
    
    @scala.inline
    def setShowHeadings(value: Boolean): Self = this.set("showHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeadings: Self = this.set("showHeadings", js.undefined)
    
    @scala.inline
    def setSlicersVarargs(value: SlicerData*): Self = this.set("slicers", js.Array(value :_*))
    
    @scala.inline
    def setSlicers(value: js.Array[SlicerData]): Self = this.set("slicers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlicers: Self = this.set("slicers", js.undefined)
    
    @scala.inline
    def setStandardHeight(value: Double): Self = this.set("standardHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardHeight: Self = this.set("standardHeight", js.undefined)
    
    @scala.inline
    def setStandardWidth(value: Double): Self = this.set("standardWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardWidth: Self = this.set("standardWidth", js.undefined)
    
    @scala.inline
    def setTabColor(value: String): Self = this.set("tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabColor: Self = this.set("tabColor", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: TableData*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[TableData]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    
    @scala.inline
    def setVerticalPageBreaksVarargs(value: PageBreakData*): Self = this.set("verticalPageBreaks", js.Array(value :_*))
    
    @scala.inline
    def setVerticalPageBreaks(value: js.Array[PageBreakData]): Self = this.set("verticalPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalPageBreaks: Self = this.set("verticalPageBreaks", js.undefined)
    
    @scala.inline
    def setVisibility(value: SheetVisibility | Visible | Hidden | VeryHidden): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
