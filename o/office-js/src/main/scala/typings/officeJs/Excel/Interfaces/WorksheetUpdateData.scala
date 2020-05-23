package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.SheetVisibility
import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.VeryHidden
import typings.officeJs.officeJsStrings.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Worksheet object, for use in `worksheet.set({ ... })`. */
trait WorksheetUpdateData extends js.Object {
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
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the PageLayout object of the worksheet.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pageLayout: js.UndefOr[PageLayoutUpdateData] = js.undefined
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Double] = js.undefined
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
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[SheetVisibility | Visible | Hidden | VeryHidden] = js.undefined
}

object WorksheetUpdateData {
  @scala.inline
  def apply(
    enableCalculation: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pageLayout: PageLayoutUpdateData = null,
    position: js.UndefOr[Double] = js.undefined,
    showGridlines: js.UndefOr[Boolean] = js.undefined,
    showHeadings: js.UndefOr[Boolean] = js.undefined,
    standardWidth: js.UndefOr[Double] = js.undefined,
    tabColor: String = null,
    visibility: SheetVisibility | Visible | Hidden | VeryHidden = null
  ): WorksheetUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableCalculation)) __obj.updateDynamic("enableCalculation")(enableCalculation.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pageLayout != null) __obj.updateDynamic("pageLayout")(pageLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridlines)) __obj.updateDynamic("showGridlines")(showGridlines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeadings)) __obj.updateDynamic("showHeadings")(showHeadings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(standardWidth)) __obj.updateDynamic("standardWidth")(standardWidth.get.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetUpdateData]
  }
}

