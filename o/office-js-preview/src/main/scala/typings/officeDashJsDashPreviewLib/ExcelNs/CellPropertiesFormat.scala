package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the returned format properties of getCellProperties or format input parameter of setCellProperties. */
trait CellPropertiesFormat extends js.Object {
  var autoIndent: js.UndefOr[scala.Boolean] = js.undefined
  var borders: js.UndefOr[CellBorderCollection] = js.undefined
  var fill: js.UndefOr[CellPropertiesFill] = js.undefined
  var font: js.UndefOr[CellPropertiesFont] = js.undefined
  var horizontalAlignment: js.UndefOr[
    HorizontalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.General | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Fill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CenterAcrossSelection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed
  ] = js.undefined
  var indentLevel: js.UndefOr[scala.Double] = js.undefined
  var protection: js.UndefOr[CellPropertiesProtection] = js.undefined
  var readingOrder: js.UndefOr[
    ReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Context | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LeftToRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RightToLeft
  ] = js.undefined
  var shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined
  var textOrientation: js.UndefOr[scala.Double] = js.undefined
  var useStandardHeight: js.UndefOr[scala.Boolean] = js.undefined
  var useStandardWidth: js.UndefOr[scala.Boolean] = js.undefined
  var verticalAlignment: js.UndefOr[
    VerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed
  ] = js.undefined
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

object CellPropertiesFormat {
  @scala.inline
  def apply(
    autoIndent: js.UndefOr[scala.Boolean] = js.undefined,
    borders: CellBorderCollection = null,
    fill: CellPropertiesFill = null,
    font: CellPropertiesFont = null,
    horizontalAlignment: HorizontalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.General | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Fill | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CenterAcrossSelection | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed = null,
    indentLevel: scala.Int | scala.Double = null,
    protection: CellPropertiesProtection = null,
    readingOrder: ReadingOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Context | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LeftToRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RightToLeft = null,
    shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined,
    textOrientation: scala.Int | scala.Double = null,
    useStandardHeight: js.UndefOr[scala.Boolean] = js.undefined,
    useStandardWidth: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlignment: VerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed = null,
    wrapText: js.UndefOr[scala.Boolean] = js.undefined
  ): CellPropertiesFormat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (indentLevel != null) __obj.updateDynamic("indentLevel")(indentLevel.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit)
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(useStandardHeight)) __obj.updateDynamic("useStandardHeight")(useStandardHeight)
    if (!js.isUndefined(useStandardWidth)) __obj.updateDynamic("useStandardWidth")(useStandardWidth)
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[CellPropertiesFormat]
  }
}

