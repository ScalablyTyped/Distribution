package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRangeFormat extends Entity {
  // Collection of border objects that apply to the overall range selected Read-only.
  var borders: js.UndefOr[js.Array[WorkbookRangeBorder]] = js.undefined
  // Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
  var columnWidth: js.UndefOr[Double] = js.undefined
  // Returns the fill object defined on the overall range. Read-only.
  var fill: js.UndefOr[WorkbookRangeFill] = js.undefined
  // Returns the font object defined on the overall range selected Read-only.
  var font: js.UndefOr[WorkbookRangeFont] = js.undefined
  /**
    * Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right,
    * Fill, Justify, CenterAcrossSelection, Distributed.
    */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
  // Returns the format protection object for a range. Read-only.
  var protection: js.UndefOr[WorkbookFormatProtection] = js.undefined
  // Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned.
  var rowHeight: js.UndefOr[Double] = js.undefined
  /**
    * Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify,
    * Distributed.
    */
  var verticalAlignment: js.UndefOr[String] = js.undefined
  /**
    * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap
    * setting
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object WorkbookRangeFormat {
  @scala.inline
  def apply(
    borders: js.Array[WorkbookRangeBorder] = null,
    columnWidth: Int | Double = null,
    fill: WorkbookRangeFill = null,
    font: WorkbookRangeFont = null,
    horizontalAlignment: String = null,
    id: String = null,
    protection: WorkbookFormatProtection = null,
    rowHeight: Int | Double = null,
    verticalAlignment: String = null,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): WorkbookRangeFormat = {
    val __obj = js.Dynamic.literal()
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookRangeFormat]
  }
}

