package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TextFrame object, for use in "textFrame.set({ ... })". */
trait TextFrameUpdateData extends js.Object {
  /**
    *
    * Gets or sets the auto sizing settings for the text frame. A text frame can be set to auto size the text to fit the text frame, or auto size the text frame to fit the text, or without auto sizing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var autoSize: js.UndefOr[
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
    * Represents the horizontal alignment of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var horizontalAlignment: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JustifyLow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThaiDistributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextHorizontalAlignType_MaxEnumIDs
  ] = js.undefined
  /**
    *
    * Represents the horizontal overflow type of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var horizontalOverflow: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorzOverflowType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextHorzOverflowType_MaxEnumIDs
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
    * Represents the text orientation of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var orientation: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical270 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EastAsianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MongolianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVerticalRTL | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextOrientationType_MaxEnumIDs
  ] = js.undefined
  /**
    *
    * Represents the reading order of the text frame, RTL or LTR.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readingOrder: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LTR | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RTL
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
    * Represents the vertical alignment of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var verticalAlignment: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Middle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextVerticalAlignType_MaxEnumIDs
  ] = js.undefined
  /**
    *
    * Represents the vertical overflow type of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var verticalOverflow: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ShapeTextVertOverflowType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ellipsis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextVertOverflowType_MaxEnumIDs
  ] = js.undefined
}

object TextFrameUpdateData {
  @scala.inline
  def apply(
    autoSize: officeDashJsDashPreviewLib.ExcelNs.ShapeAutoSize | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeNone | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeTextToFitShape | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeShapeToFitText | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutoSizeMixed = null,
    bottomMargin: scala.Int | scala.Double = null,
    horizontalAlignment: officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorizontalAlignType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JustifyLow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThaiDistributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextHorizontalAlignType_MaxEnumIDs = null,
    horizontalOverflow: officeDashJsDashPreviewLib.ExcelNs.ShapeTextHorzOverflowType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextHorzOverflowType_MaxEnumIDs = null,
    leftMargin: scala.Int | scala.Double = null,
    orientation: officeDashJsDashPreviewLib.ExcelNs.ShapeTextOrientationType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical270 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EastAsianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MongolianVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WordArtVerticalRTL | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextOrientationType_MaxEnumIDs = null,
    readingOrder: officeDashJsDashPreviewLib.ExcelNs.ShapeTextReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LTR | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RTL = null,
    rightMargin: scala.Int | scala.Double = null,
    topMargin: scala.Int | scala.Double = null,
    verticalAlignment: officeDashJsDashPreviewLib.ExcelNs.ShapeTextVerticalAlignType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Middle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextVerticalAlignType_MaxEnumIDs = null,
    verticalOverflow: officeDashJsDashPreviewLib.ExcelNs.ShapeTextVertOverflowType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Overflow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ellipsis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Clip | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShapeTextVertOverflowType_MaxEnumIDs = null
  ): TextFrameUpdateData = {
    val __obj = js.Dynamic.literal()
    if (autoSize != null) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (bottomMargin != null) __obj.updateDynamic("bottomMargin")(bottomMargin.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (horizontalOverflow != null) __obj.updateDynamic("horizontalOverflow")(horizontalOverflow.asInstanceOf[js.Any])
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (rightMargin != null) __obj.updateDynamic("rightMargin")(rightMargin.asInstanceOf[js.Any])
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (verticalOverflow != null) __obj.updateDynamic("verticalOverflow")(verticalOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrameUpdateData]
  }
}

