package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "textFrame.toJSON()". */
trait TextFrameData extends js.Object {
  /**
    *
    * Gets or sets the automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var autoSizeSetting: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeNone | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeTextToFitShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeShapeToFitText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeMixed
  ] = js.undefined
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Specifies whether the text frame contains text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var hasText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var horizontalAlignment: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JustifyLow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThaiDistributed
  ] = js.undefined
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var horizontalOverflow: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalOverflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip
  ] = js.undefined
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var leftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the text orientation of the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var orientation: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical270 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EastAsianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MongolianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVerticalRTL
  ] = js.undefined
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readingOrder: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LeftToRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RightToLeft
  ] = js.undefined
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var topMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var verticalAlignment: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Middle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed
  ] = js.undefined
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var verticalOverflow: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalOverflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ellipsis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip
  ] = js.undefined
}

object TextFrameData {
  @scala.inline
  def apply(
    autoSizeSetting: officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeNone | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeTextToFitShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeShapeToFitText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeMixed = null,
    bottomMargin: scala.Int | scala.Double = null,
    hasText: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalAlignment: officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JustifyLow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThaiDistributed = null,
    horizontalOverflow: officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalOverflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip = null,
    leftMargin: scala.Int | scala.Double = null,
    orientation: officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical270 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EastAsianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MongolianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVerticalRTL = null,
    readingOrder: officeDashJsDashPreviewLib.ExcelNs.ShapeTextReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LeftToRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RightToLeft = null,
    rightMargin: scala.Int | scala.Double = null,
    topMargin: scala.Int | scala.Double = null,
    verticalAlignment: officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Middle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed = null,
    verticalOverflow: officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalOverflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ellipsis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip = null
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

