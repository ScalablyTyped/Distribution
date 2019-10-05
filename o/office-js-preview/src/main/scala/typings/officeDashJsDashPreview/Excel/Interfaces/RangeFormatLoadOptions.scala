package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A format object encapsulating the range's font, fill, borders, alignment, and other properties.
  *
  * [Api set: ExcelApi 1.1]
  */
trait RangeFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if text is automatically indented when text alignment is set to equal distribution.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Collection of border objects that apply to the overall range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var borders: js.UndefOr[RangeBorderCollectionLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.2]
    */
  var columnWidth: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the fill object defined on the overall range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var fill: js.UndefOr[RangeFillLoadOptions] = js.undefined
  /**
    *
    * Returns the font object defined on the overall range.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[RangeFontLoadOptions] = js.undefined
  /**
    *
    * Represents the horizontal alignment for the specified object. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * An integer from 0 to 250 that indicates the indent level.
    *
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the format protection object for a range.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[FormatProtectionLoadOptions] = js.undefined
  /**
    *
    * The reading order for the range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the height of all rows in the range. If the row heights are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.2]
    */
  var rowHeight: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the text orientation of all the cells within the range.
    The text orientation should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    If the orientation within a range are not uniform, then null will be returned.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Determines if the row height of the Range object equals the standard height of the sheet.
    Returns True if the row height of the Range object equals the standard height of the sheet.
    Returns Null if the range contains more than one row and the rows aren't all the same height.
    Returns False otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var useStandardHeight: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates whether the column width of the Range object equals the standard width of the sheet.
    Returns True if the column width of the Range object equals the standard width of the sheet.
    Returns Null if the range contains more than one column and the columns aren't all the same height.
    Returns False otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var useStandardWidth: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the vertical alignment for the specified object. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
    *
    * [Api set: ExcelApi 1.1]
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object RangeFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    autoIndent: js.UndefOr[Boolean] = js.undefined,
    borders: RangeBorderCollectionLoadOptions = null,
    columnWidth: js.UndefOr[Boolean] = js.undefined,
    fill: RangeFillLoadOptions = null,
    font: RangeFontLoadOptions = null,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    indentLevel: js.UndefOr[Boolean] = js.undefined,
    protection: FormatProtectionLoadOptions = null,
    readingOrder: js.UndefOr[Boolean] = js.undefined,
    rowHeight: js.UndefOr[Boolean] = js.undefined,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.UndefOr[Boolean] = js.undefined,
    useStandardHeight: js.UndefOr[Boolean] = js.undefined,
    useStandardWidth: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): RangeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(indentLevel)) __obj.updateDynamic("indentLevel")(indentLevel)
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(readingOrder)) __obj.updateDynamic("readingOrder")(readingOrder)
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight)
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit)
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation)
    if (!js.isUndefined(useStandardHeight)) __obj.updateDynamic("useStandardHeight")(useStandardHeight)
    if (!js.isUndefined(useStandardWidth)) __obj.updateDynamic("useStandardWidth")(useStandardWidth)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[RangeFormatLoadOptions]
  }
}

