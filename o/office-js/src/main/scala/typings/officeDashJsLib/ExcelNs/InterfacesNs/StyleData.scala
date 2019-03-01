package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "style.toJSON()". */
trait StyleData extends js.Object {
  /**
    *
    * Indicates if text is automatically indented when the text alignment in a cell is set to equal distribution.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoIndent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * A Border collection of four Border objects that represent the style of the four borders.
    *
    * [Api set: ExcelApi 1.7]
    */
  var borders: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
  /**
    *
    * Indicates if the style is a built-in style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var builtIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The Fill of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var fill: js.UndefOr[RangeFillData] = js.undefined
  /**
    *
    * A Font object that represents the font of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[RangeFontData] = js.undefined
  /**
    *
    * Indicates if the formula will be hidden when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formulaHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.HorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.General | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Fill | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.CenterAcrossSelection | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
    *
    * Indicates if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the FormulaHidden and Locked protection properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeProtection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * An integer from 0 to 250 that indicates the indent level for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var indentLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Indicates if the object is locked when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The name of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The localized format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The reading order for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var readingOrder: js.UndefOr[
    officeDashJsLib.ExcelNs.ReadingOrder | officeDashJsLib.officeDashJsLibStrings.Context | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft
  ] = js.undefined
  /**
    *
    * Indicates if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.7]
    */
  var shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The text orientation for the style.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
    *
    * Indicates if Microsoft Excel wraps the text in the object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

object StyleData {
  @scala.inline
  def apply(
    autoIndent: js.UndefOr[scala.Boolean] = js.undefined,
    borders: js.Array[RangeBorderData] = null,
    builtIn: js.UndefOr[scala.Boolean] = js.undefined,
    fill: RangeFillData = null,
    font: RangeFontData = null,
    formulaHidden: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalAlignment: officeDashJsLib.ExcelNs.HorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.General | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Fill | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.CenterAcrossSelection | officeDashJsLib.officeDashJsLibStrings.Distributed = null,
    includeAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    includeBorder: js.UndefOr[scala.Boolean] = js.undefined,
    includeFont: js.UndefOr[scala.Boolean] = js.undefined,
    includeNumber: js.UndefOr[scala.Boolean] = js.undefined,
    includePatterns: js.UndefOr[scala.Boolean] = js.undefined,
    includeProtection: js.UndefOr[scala.Boolean] = js.undefined,
    indentLevel: scala.Int | scala.Double = null,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    numberFormat: java.lang.String = null,
    numberFormatLocal: java.lang.String = null,
    readingOrder: officeDashJsLib.ExcelNs.ReadingOrder | officeDashJsLib.officeDashJsLibStrings.Context | officeDashJsLib.officeDashJsLibStrings.LeftToRight | officeDashJsLib.officeDashJsLibStrings.RightToLeft = null,
    shrinkToFit: js.UndefOr[scala.Boolean] = js.undefined,
    textOrientation: scala.Int | scala.Double = null,
    verticalAlignment: officeDashJsLib.ExcelNs.VerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed = null,
    wrapText: js.UndefOr[scala.Boolean] = js.undefined
  ): StyleData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (!js.isUndefined(builtIn)) __obj.updateDynamic("builtIn")(builtIn)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAlignment)) __obj.updateDynamic("includeAlignment")(includeAlignment)
    if (!js.isUndefined(includeBorder)) __obj.updateDynamic("includeBorder")(includeBorder)
    if (!js.isUndefined(includeFont)) __obj.updateDynamic("includeFont")(includeFont)
    if (!js.isUndefined(includeNumber)) __obj.updateDynamic("includeNumber")(includeNumber)
    if (!js.isUndefined(includePatterns)) __obj.updateDynamic("includePatterns")(includePatterns)
    if (!js.isUndefined(includeProtection)) __obj.updateDynamic("includeProtection")(includeProtection)
    if (indentLevel != null) __obj.updateDynamic("indentLevel")(indentLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (name != null) __obj.updateDynamic("name")(name)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (numberFormatLocal != null) __obj.updateDynamic("numberFormatLocal")(numberFormatLocal)
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit)
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[StyleData]
  }
}

