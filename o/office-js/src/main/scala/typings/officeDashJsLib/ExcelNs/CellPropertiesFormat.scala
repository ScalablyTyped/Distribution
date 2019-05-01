package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned format properties of getCellProperties or format input parameter of setCellProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFormat extends js.Object {
  /**
    *
    * Represents the `autoIndent` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `borders` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var borders: js.UndefOr[CellBorderCollection] = js.undefined
  /**
    *
    * Represents the `fill` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[CellPropertiesFill] = js.undefined
  /**
    *
    * Represents the `font` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[CellPropertiesFont] = js.undefined
  /**
    *
    * Represents the `horizontalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    HorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.General | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Fill | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.CenterAcrossSelection | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
    *
    * Represents the `indentLevel` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `protection` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var protection: js.UndefOr[CellPropertiesProtection] = js.undefined
  /**
    *
    * Represents the `readingOrder` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[
    ReadingOrder | officeDashJsLib.officeDashJsLibStrings.Context | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft
  ] = js.undefined
  /**
    *
    * Represents the `shrinkToFit` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `textOrientation` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textOrientation: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the `useStandardHeight` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `useStandardWidth` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `verticalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[
    VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
    *
    * Represents the `wrapText` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

object CellPropertiesFormat {
  @scala.inline
  def apply(
    autoIndent: js.UndefOr[scala.Boolean] = js.undefined,
    borders: CellBorderCollection = null,
    fill: CellPropertiesFill = null,
    font: CellPropertiesFont = null,
    horizontalAlignment: HorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.General | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Fill | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.CenterAcrossSelection | officeDashJsLib.officeDashJsLibStrings.Distributed = null,
    indentLevel: scala.Int | scala.Double = null,
    protection: CellPropertiesProtection = null,
    readingOrder: ReadingOrder | officeDashJsLib.officeDashJsLibStrings.Context | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft = null,
    shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined,
    textOrientation: scala.Int | scala.Double = null,
    useStandardHeight: js.UndefOr[scala.Boolean] = js.undefined,
    useStandardWidth: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlignment: VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed = null,
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

