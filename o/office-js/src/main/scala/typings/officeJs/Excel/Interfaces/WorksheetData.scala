package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.SheetVisibility
import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.VeryHidden
import typings.officeJs.officeJsStrings.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheet.toJSON()`. */
@js.native
trait WorksheetData extends StObject {
  
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
  implicit class WorksheetDataMutableBuilder[Self <: WorksheetData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFilter(value: AutoFilterData): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
    
    @scala.inline
    def setCharts(value: js.Array[ChartData]): Self = StObject.set(x, "charts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartsUndefined: Self = StObject.set(x, "charts", js.undefined)
    
    @scala.inline
    def setChartsVarargs(value: ChartData*): Self = StObject.set(x, "charts", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentData]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentData*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setCustomProperties(value: js.Array[WorksheetCustomPropertyData]): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
    
    @scala.inline
    def setCustomPropertiesVarargs(value: WorksheetCustomPropertyData*): Self = StObject.set(x, "customProperties", js.Array(value :_*))
    
    @scala.inline
    def setEnableCalculation(value: Boolean): Self = StObject.set(x, "enableCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCalculationUndefined: Self = StObject.set(x, "enableCalculation", js.undefined)
    
    @scala.inline
    def setHorizontalPageBreaks(value: js.Array[PageBreakData]): Self = StObject.set(x, "horizontalPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalPageBreaksUndefined: Self = StObject.set(x, "horizontalPageBreaks", js.undefined)
    
    @scala.inline
    def setHorizontalPageBreaksVarargs(value: PageBreakData*): Self = StObject.set(x, "horizontalPageBreaks", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNames(value: js.Array[NamedItemData]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: NamedItemData*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setPageLayout(value: PageLayoutData): Self = StObject.set(x, "pageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLayoutUndefined: Self = StObject.set(x, "pageLayout", js.undefined)
    
    @scala.inline
    def setPivotTables(value: js.Array[PivotTableData]): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotTablesUndefined: Self = StObject.set(x, "pivotTables", js.undefined)
    
    @scala.inline
    def setPivotTablesVarargs(value: PivotTableData*): Self = StObject.set(x, "pivotTables", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setProtection(value: WorksheetProtectionData): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    @scala.inline
    def setShapes(value: js.Array[ShapeData]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: ShapeData*): Self = StObject.set(x, "shapes", js.Array(value :_*))
    
    @scala.inline
    def setShowGridlines(value: Boolean): Self = StObject.set(x, "showGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridlinesUndefined: Self = StObject.set(x, "showGridlines", js.undefined)
    
    @scala.inline
    def setShowHeadings(value: Boolean): Self = StObject.set(x, "showHeadings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeadingsUndefined: Self = StObject.set(x, "showHeadings", js.undefined)
    
    @scala.inline
    def setSlicers(value: js.Array[SlicerData]): Self = StObject.set(x, "slicers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicersUndefined: Self = StObject.set(x, "slicers", js.undefined)
    
    @scala.inline
    def setSlicersVarargs(value: SlicerData*): Self = StObject.set(x, "slicers", js.Array(value :_*))
    
    @scala.inline
    def setStandardHeight(value: Double): Self = StObject.set(x, "standardHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardHeightUndefined: Self = StObject.set(x, "standardHeight", js.undefined)
    
    @scala.inline
    def setStandardWidth(value: Double): Self = StObject.set(x, "standardWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardWidthUndefined: Self = StObject.set(x, "standardWidth", js.undefined)
    
    @scala.inline
    def setTabColor(value: String): Self = StObject.set(x, "tabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabColorUndefined: Self = StObject.set(x, "tabColor", js.undefined)
    
    @scala.inline
    def setTables(value: js.Array[TableData]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: TableData*): Self = StObject.set(x, "tables", js.Array(value :_*))
    
    @scala.inline
    def setVerticalPageBreaks(value: js.Array[PageBreakData]): Self = StObject.set(x, "verticalPageBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalPageBreaksUndefined: Self = StObject.set(x, "verticalPageBreaks", js.undefined)
    
    @scala.inline
    def setVerticalPageBreaksVarargs(value: PageBreakData*): Self = StObject.set(x, "verticalPageBreaks", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: SheetVisibility | Visible | Hidden | VeryHidden): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
