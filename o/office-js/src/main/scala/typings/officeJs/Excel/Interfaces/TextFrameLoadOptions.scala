package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the text frame of a shape object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait TextFrameLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hasText: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the angle to which the text is oriented for the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the text that is attached to a shape in the text frame, and properties and methods for manipulating the text. See Excel.TextRange for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textRange: js.UndefOr[TextRangeLoadOptions] = js.undefined
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[Boolean] = js.undefined
}

object TextFrameLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    autoSizeSetting: js.UndefOr[Boolean] = js.undefined,
    bottomMargin: js.UndefOr[Boolean] = js.undefined,
    hasText: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    horizontalOverflow: js.UndefOr[Boolean] = js.undefined,
    leftMargin: js.UndefOr[Boolean] = js.undefined,
    orientation: js.UndefOr[Boolean] = js.undefined,
    readingOrder: js.UndefOr[Boolean] = js.undefined,
    rightMargin: js.UndefOr[Boolean] = js.undefined,
    textRange: TextRangeLoadOptions = null,
    topMargin: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined,
    verticalOverflow: js.UndefOr[Boolean] = js.undefined
  ): TextFrameLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSizeSetting)) __obj.updateDynamic("autoSizeSetting")(autoSizeSetting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomMargin)) __obj.updateDynamic("bottomMargin")(bottomMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasText)) __obj.updateDynamic("hasText")(hasText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOverflow)) __obj.updateDynamic("horizontalOverflow")(horizontalOverflow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftMargin)) __obj.updateDynamic("leftMargin")(leftMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readingOrder)) __obj.updateDynamic("readingOrder")(readingOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightMargin)) __obj.updateDynamic("rightMargin")(rightMargin.get.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    if (!js.isUndefined(topMargin)) __obj.updateDynamic("topMargin")(topMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalOverflow)) __obj.updateDynamic("verticalOverflow")(verticalOverflow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrameLoadOptions]
  }
}

