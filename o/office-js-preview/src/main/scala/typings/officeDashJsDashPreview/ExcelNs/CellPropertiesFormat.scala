package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Center
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.CenterAcrossSelection
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Context
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Distributed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Fill
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.General
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Justify
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Left
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LeftToRight
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Right
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.RightToLeft
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Top
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
  var autoIndent: js.UndefOr[Boolean] = js.undefined
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
    HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
  ] = js.undefined
  /**
    *
    * Represents the `indentLevel` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[Double] = js.undefined
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
  var readingOrder: js.UndefOr[ReadingOrder | Context | LeftToRight | RightToLeft] = js.undefined
  /**
    *
    * Represents the `shrinkToFit` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `textOrientation` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the `useStandardHeight` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardHeight: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `useStandardWidth` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardWidth: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `verticalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Top | Center | Bottom | Justify | Distributed] = js.undefined
  /**
    *
    * Represents the `wrapText` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object CellPropertiesFormat {
  @scala.inline
  def apply(
    autoIndent: js.UndefOr[Boolean] = js.undefined,
    borders: CellBorderCollection = null,
    fill: CellPropertiesFill = null,
    font: CellPropertiesFont = null,
    horizontalAlignment: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed = null,
    indentLevel: Int | Double = null,
    protection: CellPropertiesProtection = null,
    readingOrder: ReadingOrder | Context | LeftToRight | RightToLeft = null,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined,
    textOrientation: Int | Double = null,
    useStandardHeight: js.UndefOr[Boolean] = js.undefined,
    useStandardWidth: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: VerticalAlignment | Top | Center | Bottom | Justify | Distributed = null,
    wrapText: js.UndefOr[Boolean] = js.undefined
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

