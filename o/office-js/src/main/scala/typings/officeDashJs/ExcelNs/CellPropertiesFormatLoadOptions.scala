package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which properties to load on the format object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFormatLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `autoIndent` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `borders` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var borders: js.UndefOr[CellPropertiesBorderLoadOptions] = js.undefined
  /**
    *
    * Specifies whether to load on the `fill` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[CellPropertiesFillLoadOptions] = js.undefined
  /**
    *
    * Specifies whether to load on the `font` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[CellPropertiesFontLoadOptions] = js.undefined
  /**
    *
    * Specifies whether to load on the `horizontalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `indentLevel` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var indentLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `protection` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var protection: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `readingOrder` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `shrinkToFit` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `textOrientation` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `useStandardHeight` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardHeight: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `useStandardWidth` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var useStandardWidth: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `verticalAlignment` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `wrapText` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object CellPropertiesFormatLoadOptions {
  @scala.inline
  def apply(
    autoIndent: js.UndefOr[Boolean] = js.undefined,
    borders: CellPropertiesBorderLoadOptions = null,
    fill: CellPropertiesFillLoadOptions = null,
    font: CellPropertiesFontLoadOptions = null,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    indentLevel: js.UndefOr[Boolean] = js.undefined,
    protection: js.UndefOr[Boolean] = js.undefined,
    readingOrder: js.UndefOr[Boolean] = js.undefined,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.UndefOr[Boolean] = js.undefined,
    useStandardHeight: js.UndefOr[Boolean] = js.undefined,
    useStandardWidth: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): CellPropertiesFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(indentLevel)) __obj.updateDynamic("indentLevel")(indentLevel)
    if (!js.isUndefined(protection)) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(readingOrder)) __obj.updateDynamic("readingOrder")(readingOrder)
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit)
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation)
    if (!js.isUndefined(useStandardHeight)) __obj.updateDynamic("useStandardHeight")(useStandardHeight)
    if (!js.isUndefined(useStandardWidth)) __obj.updateDynamic("useStandardWidth")(useStandardWidth)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[CellPropertiesFormatLoadOptions]
  }
}

