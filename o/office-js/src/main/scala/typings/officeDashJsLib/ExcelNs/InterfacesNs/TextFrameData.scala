package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "textFrame.toJSON()". */
trait TextFrameData extends js.Object {
  /**
    *
    * Gets or sets the automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeAutoSize | officeDashJsLib.officeDashJsLibStrings.AutoSizeNone | officeDashJsLib.officeDashJsLibStrings.AutoSizeTextToFitShape | officeDashJsLib.officeDashJsLibStrings.AutoSizeShapeToFitText | officeDashJsLib.officeDashJsLibStrings.AutoSizeMixed
  ] = js.undefined
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Specifies whether the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hasText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.JustifyLow | officeDashJsLib.officeDashJsLibStrings.Distributed | officeDashJsLib.officeDashJsLibStrings.ThaiDistributed
  ] = js.undefined
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeTextHorizontalOverflow | officeDashJsLib.officeDashJsLibStrings.Overflow | officeDashJsLib.officeDashJsLibStrings.Clip
  ] = js.undefined
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the text orientation of the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeTextOrientation | officeDashJsLib.officeDashJsLibStrings.Horizontal | officeDashJsLib.officeDashJsLibStrings.Vertical | officeDashJsLib.officeDashJsLibStrings.Vertical270 | officeDashJsLib.officeDashJsLibStrings.WordArtVertical | officeDashJsLib.officeDashJsLibStrings.EastAsianVertical | officeDashJsLib.officeDashJsLibStrings.MongolianVertical | officeDashJsLib.officeDashJsLibStrings.WordArtVerticalRTL
  ] = js.undefined
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeTextReadingOrder | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft
  ] = js.undefined
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeTextVerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Middle | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Justified | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[
    officeDashJsLib.ExcelNs.ShapeTextVerticalOverflow | officeDashJsLib.officeDashJsLibStrings.Overflow | officeDashJsLib.officeDashJsLibStrings.Ellipsis | officeDashJsLib.officeDashJsLibStrings.Clip
  ] = js.undefined
}

object TextFrameData {
  @scala.inline
  def apply(
    autoSizeSetting: officeDashJsLib.ExcelNs.ShapeAutoSize | officeDashJsLib.officeDashJsLibStrings.AutoSizeNone | officeDashJsLib.officeDashJsLibStrings.AutoSizeTextToFitShape | officeDashJsLib.officeDashJsLibStrings.AutoSizeShapeToFitText | officeDashJsLib.officeDashJsLibStrings.AutoSizeMixed = null,
    bottomMargin: scala.Int | scala.Double = null,
    hasText: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalAlignment: officeDashJsLib.ExcelNs.ShapeTextHorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.JustifyLow | officeDashJsLib.officeDashJsLibStrings.Distributed | officeDashJsLib.officeDashJsLibStrings.ThaiDistributed = null,
    horizontalOverflow: officeDashJsLib.ExcelNs.ShapeTextHorizontalOverflow | officeDashJsLib.officeDashJsLibStrings.Overflow | officeDashJsLib.officeDashJsLibStrings.Clip = null,
    leftMargin: scala.Int | scala.Double = null,
    orientation: officeDashJsLib.ExcelNs.ShapeTextOrientation | officeDashJsLib.officeDashJsLibStrings.Horizontal | officeDashJsLib.officeDashJsLibStrings.Vertical | officeDashJsLib.officeDashJsLibStrings.Vertical270 | officeDashJsLib.officeDashJsLibStrings.WordArtVertical | officeDashJsLib.officeDashJsLibStrings.EastAsianVertical | officeDashJsLib.officeDashJsLibStrings.MongolianVertical | officeDashJsLib.officeDashJsLibStrings.WordArtVerticalRTL = null,
    readingOrder: officeDashJsLib.ExcelNs.ShapeTextReadingOrder | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft = null,
    rightMargin: scala.Int | scala.Double = null,
    topMargin: scala.Int | scala.Double = null,
    verticalAlignment: officeDashJsLib.ExcelNs.ShapeTextVerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Middle | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Justified | officeDashJsLib.officeDashJsLibStrings.Distributed = null,
    verticalOverflow: officeDashJsLib.ExcelNs.ShapeTextVerticalOverflow | officeDashJsLib.officeDashJsLibStrings.Overflow | officeDashJsLib.officeDashJsLibStrings.Ellipsis | officeDashJsLib.officeDashJsLibStrings.Clip = null
  ): TextFrameData = {
    val __obj = js.Dynamic.literal()
    if (autoSizeSetting != null) __obj.updateDynamic("autoSizeSetting")(autoSizeSetting.asInstanceOf[js.Any])
    if (bottomMargin != null) __obj.updateDynamic("bottomMargin")(bottomMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(hasText)) __obj.updateDynamic("hasText")(hasText)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (horizontalOverflow != null) __obj.updateDynamic("horizontalOverflow")(horizontalOverflow.asInstanceOf[js.Any])
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (rightMargin != null) __obj.updateDynamic("rightMargin")(rightMargin.asInstanceOf[js.Any])
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (verticalOverflow != null) __obj.updateDynamic("verticalOverflow")(verticalOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrameData]
  }
}

