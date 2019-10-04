package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An object encapsulating a style's format and other properties.
  *
  * [Api set: ExcelApi 1.7]
  */
trait StyleLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if text is automatically indented when the text alignment in a cell is set to equal distribution.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * A Border collection of four Border objects that represent the style of the four borders.
    *
    * [Api set: ExcelApi 1.7]
    */
  var borders: js.UndefOr[RangeBorderCollectionLoadOptions] = js.undefined
  /**
    *
    * Indicates if the style is a built-in style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var builtIn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The Fill of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var fill: js.UndefOr[RangeFillLoadOptions] = js.undefined
  /**
    *
    * A Font object that represents the font of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[RangeFontLoadOptions] = js.undefined
  /**
    *
    * Indicates if the formula will be hidden when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if the style includes the FormulaHidden and Locked protection properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeProtection: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * An integer from 0 to 250 that indicates the indent level for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var indentLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if the object is locked when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The name of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The localized format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The reading order for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var readingOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.7]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The text orientation for the style.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if Microsoft Excel wraps the text in the object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}

object StyleLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    autoIndent: js.UndefOr[Boolean] = js.undefined,
    borders: RangeBorderCollectionLoadOptions = null,
    builtIn: js.UndefOr[Boolean] = js.undefined,
    fill: RangeFillLoadOptions = null,
    font: RangeFontLoadOptions = null,
    formulaHidden: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    includeAlignment: js.UndefOr[Boolean] = js.undefined,
    includeBorder: js.UndefOr[Boolean] = js.undefined,
    includeFont: js.UndefOr[Boolean] = js.undefined,
    includeNumber: js.UndefOr[Boolean] = js.undefined,
    includePatterns: js.UndefOr[Boolean] = js.undefined,
    includeProtection: js.UndefOr[Boolean] = js.undefined,
    indentLevel: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    numberFormatLocal: js.UndefOr[Boolean] = js.undefined,
    readingOrder: js.UndefOr[Boolean] = js.undefined,
    shrinkToFit: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): StyleLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (!js.isUndefined(builtIn)) __obj.updateDynamic("builtIn")(builtIn)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(includeAlignment)) __obj.updateDynamic("includeAlignment")(includeAlignment)
    if (!js.isUndefined(includeBorder)) __obj.updateDynamic("includeBorder")(includeBorder)
    if (!js.isUndefined(includeFont)) __obj.updateDynamic("includeFont")(includeFont)
    if (!js.isUndefined(includeNumber)) __obj.updateDynamic("includeNumber")(includeNumber)
    if (!js.isUndefined(includePatterns)) __obj.updateDynamic("includePatterns")(includePatterns)
    if (!js.isUndefined(includeProtection)) __obj.updateDynamic("includeProtection")(includeProtection)
    if (!js.isUndefined(indentLevel)) __obj.updateDynamic("indentLevel")(indentLevel)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat)
    if (!js.isUndefined(numberFormatLocal)) __obj.updateDynamic("numberFormatLocal")(numberFormatLocal)
    if (!js.isUndefined(readingOrder)) __obj.updateDynamic("readingOrder")(readingOrder)
    if (!js.isUndefined(shrinkToFit)) __obj.updateDynamic("shrinkToFit")(shrinkToFit)
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText)
    __obj.asInstanceOf[StyleLoadOptions]
  }
}

