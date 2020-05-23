package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.SheetVisibility
import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.VeryHidden
import typings.officeJs.officeJsStrings.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `worksheet.toJSON()`. */
trait WorksheetData extends js.Object {
  /**
    *
    * Represents the AutoFilter object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterData] = js.undefined
  /**
    *
    * Returns a collection of charts that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[js.Array[ChartData]] = js.undefined
  /**
    *
    * Returns a collection of all the Comments objects on the worksheet.
    *
    * [Api set: ExcelApi 1.10]
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.undefined
  /**
    *
    * Determines if Excel should recalculate the worksheet when necessary.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the horizontal page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalPageBreaks: js.UndefOr[js.Array[PageBreakData]] = js.undefined
  /**
    *
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Collection of names scoped to the current worksheet.
    *
    * [Api set: ExcelApi 1.4]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.undefined
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutData] = js.undefined
  /**
    *
    * Collection of PivotTables that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.undefined
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns sheet protection object for a worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionData] = js.undefined
  /**
    *
    * Returns the collection of all the Shape objects on the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
  /**
    *
    * Specifies if gridlines are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if headings are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a collection of slicers that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.10]
    */
  var slicers: js.UndefOr[js.Array[SlicerData]] = js.undefined
  /**
    *
    * Returns the standard (default) height of all the rows in the worksheet, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Double] = js.undefined
  /**
    *
    * The tab color of the worksheet.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Collection of tables that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
    *
    * Gets the vertical page break collection for the worksheet. This collection only contains manual page breaks.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalPageBreaks: js.UndefOr[js.Array[PageBreakData]] = js.undefined
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[SheetVisibility | Visible | Hidden | VeryHidden] = js.undefined
}

object WorksheetData {
  @scala.inline
  def apply(
    autoFilter: AutoFilterData = null,
    charts: js.Array[ChartData] = null,
    comments: js.Array[CommentData] = null,
    enableCalculation: js.UndefOr[Boolean] = js.undefined,
    horizontalPageBreaks: js.Array[PageBreakData] = null,
    id: String = null,
    name: String = null,
    names: js.Array[NamedItemData] = null,
    pageLayout: PageLayoutData = null,
    pivotTables: js.Array[PivotTableData] = null,
    position: js.UndefOr[Double] = js.undefined,
    protection: WorksheetProtectionData = null,
    shapes: js.Array[ShapeData] = null,
    showGridlines: js.UndefOr[Boolean] = js.undefined,
    showHeadings: js.UndefOr[Boolean] = js.undefined,
    slicers: js.Array[SlicerData] = null,
    standardHeight: js.UndefOr[Double] = js.undefined,
    standardWidth: js.UndefOr[Double] = js.undefined,
    tabColor: String = null,
    tables: js.Array[TableData] = null,
    verticalPageBreaks: js.Array[PageBreakData] = null,
    visibility: SheetVisibility | Visible | Hidden | VeryHidden = null
  ): WorksheetData = {
    val __obj = js.Dynamic.literal()
    if (autoFilter != null) __obj.updateDynamic("autoFilter")(autoFilter.asInstanceOf[js.Any])
    if (charts != null) __obj.updateDynamic("charts")(charts.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCalculation)) __obj.updateDynamic("enableCalculation")(enableCalculation.get.asInstanceOf[js.Any])
    if (horizontalPageBreaks != null) __obj.updateDynamic("horizontalPageBreaks")(horizontalPageBreaks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (pageLayout != null) __obj.updateDynamic("pageLayout")(pageLayout.asInstanceOf[js.Any])
    if (pivotTables != null) __obj.updateDynamic("pivotTables")(pivotTables.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridlines)) __obj.updateDynamic("showGridlines")(showGridlines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeadings)) __obj.updateDynamic("showHeadings")(showHeadings.get.asInstanceOf[js.Any])
    if (slicers != null) __obj.updateDynamic("slicers")(slicers.asInstanceOf[js.Any])
    if (!js.isUndefined(standardHeight)) __obj.updateDynamic("standardHeight")(standardHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(standardWidth)) __obj.updateDynamic("standardWidth")(standardWidth.get.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (verticalPageBreaks != null) __obj.updateDynamic("verticalPageBreaks")(verticalPageBreaks.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetData]
  }
}

