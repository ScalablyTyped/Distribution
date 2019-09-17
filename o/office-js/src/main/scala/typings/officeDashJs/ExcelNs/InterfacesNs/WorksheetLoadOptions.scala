package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An Excel worksheet is a grid of cells. It can contain data, tables, charts, etc.
  To learn more about the worksheet object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-worksheets | Work with worksheets using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.1]
  */
trait WorksheetLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the AutoFilter object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFilter: js.UndefOr[AutoFilterLoadOptions] = js.undefined
  /**
    *
    * Returns collection of charts that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[ChartCollectionLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the enableCalculation property of the worksheet.
    True if Excel recalculates the worksheet when necessary. False if Excel doesn't recalculate the sheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enableCalculation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutLoadOptions] = js.undefined
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns sheet protection object for a worksheet.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the worksheet's gridlines flag.
    This flag determines whether gridlines are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's headings flag.
    This flag determines whether headings are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the standard (default) height of all the rows in the worksheet, in points. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet tab color.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Collection of tables that are part of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.undefined
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[Boolean] = js.undefined
}

object WorksheetLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    autoFilter: AutoFilterLoadOptions = null,
    charts: ChartCollectionLoadOptions = null,
    enableCalculation: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    pageLayout: PageLayoutLoadOptions = null,
    position: js.UndefOr[Boolean] = js.undefined,
    protection: WorksheetProtectionLoadOptions = null,
    showGridlines: js.UndefOr[Boolean] = js.undefined,
    showHeadings: js.UndefOr[Boolean] = js.undefined,
    standardHeight: js.UndefOr[Boolean] = js.undefined,
    standardWidth: js.UndefOr[Boolean] = js.undefined,
    tabColor: js.UndefOr[Boolean] = js.undefined,
    tables: TableCollectionLoadOptions = null,
    visibility: js.UndefOr[Boolean] = js.undefined
  ): WorksheetLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (autoFilter != null) __obj.updateDynamic("autoFilter")(autoFilter)
    if (charts != null) __obj.updateDynamic("charts")(charts)
    if (!js.isUndefined(enableCalculation)) __obj.updateDynamic("enableCalculation")(enableCalculation)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (pageLayout != null) __obj.updateDynamic("pageLayout")(pageLayout)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(showGridlines)) __obj.updateDynamic("showGridlines")(showGridlines)
    if (!js.isUndefined(showHeadings)) __obj.updateDynamic("showHeadings")(showHeadings)
    if (!js.isUndefined(standardHeight)) __obj.updateDynamic("standardHeight")(standardHeight)
    if (!js.isUndefined(standardWidth)) __obj.updateDynamic("standardWidth")(standardWidth)
    if (!js.isUndefined(tabColor)) __obj.updateDynamic("tabColor")(tabColor)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[WorksheetLoadOptions]
  }
}

