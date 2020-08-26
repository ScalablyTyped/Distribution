package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * An object encapsulating a style's format and other properties.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait StyleLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if text is automatically indented when the text alignment in a cell is set to equal distribution.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoIndent: js.UndefOr[Boolean] = js.native
  /**
    *
    * A Border collection of four Border objects that represent the style of the four borders.
    *
    * [Api set: ExcelApi 1.7]
    */
  var borders: js.UndefOr[RangeBorderCollectionLoadOptions] = js.native
  /**
    *
    * Specifies if the style is a built-in style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var builtIn: js.UndefOr[Boolean] = js.native
  /**
    *
    * The Fill of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var fill: js.UndefOr[RangeFillLoadOptions] = js.native
  /**
    *
    * A Font object that represents the font of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[RangeFontLoadOptions] = js.native
  /**
    *
    * Specifies if the formula will be hidden when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the style includes the FormulaHidden and Locked protection properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeProtection: js.UndefOr[Boolean] = js.native
  /**
    *
    * An integer from 0 to 250 that indicates the indent level for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var indentLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the object is locked when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var locked: js.UndefOr[Boolean] = js.native
  /**
    *
    * The name of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * The format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * The localized format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[Boolean] = js.native
  /**
    *
    * The reading order for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var readingOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.7]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  /**
    *
    * The text orientation for the style.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if Excel wraps the text in the object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}

object StyleLoadOptions {
  @scala.inline
  def apply(): StyleLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleLoadOptions]
  }
  @scala.inline
  implicit class StyleLoadOptionsOps[Self <: StyleLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setAutoIndent(value: Boolean): Self = this.set("autoIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoIndent: Self = this.set("autoIndent", js.undefined)
    @scala.inline
    def setBorders(value: RangeBorderCollectionLoadOptions): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setBuiltIn(value: Boolean): Self = this.set("builtIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltIn: Self = this.set("builtIn", js.undefined)
    @scala.inline
    def setFill(value: RangeFillLoadOptions): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: RangeFontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFormulaHidden(value: Boolean): Self = this.set("formulaHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulaHidden: Self = this.set("formulaHidden", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setIncludeAlignment(value: Boolean): Self = this.set("includeAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAlignment: Self = this.set("includeAlignment", js.undefined)
    @scala.inline
    def setIncludeBorder(value: Boolean): Self = this.set("includeBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeBorder: Self = this.set("includeBorder", js.undefined)
    @scala.inline
    def setIncludeFont(value: Boolean): Self = this.set("includeFont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeFont: Self = this.set("includeFont", js.undefined)
    @scala.inline
    def setIncludeNumber(value: Boolean): Self = this.set("includeNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeNumber: Self = this.set("includeNumber", js.undefined)
    @scala.inline
    def setIncludePatterns(value: Boolean): Self = this.set("includePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePatterns: Self = this.set("includePatterns", js.undefined)
    @scala.inline
    def setIncludeProtection(value: Boolean): Self = this.set("includeProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeProtection: Self = this.set("includeProtection", js.undefined)
    @scala.inline
    def setIndentLevel(value: Boolean): Self = this.set("indentLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentLevel: Self = this.set("indentLevel", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumberFormat(value: Boolean): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setNumberFormatLocal(value: Boolean): Self = this.set("numberFormatLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormatLocal: Self = this.set("numberFormatLocal", js.undefined)
    @scala.inline
    def setReadingOrder(value: Boolean): Self = this.set("readingOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadingOrder: Self = this.set("readingOrder", js.undefined)
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = this.set("shrinkToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrinkToFit: Self = this.set("shrinkToFit", js.undefined)
    @scala.inline
    def setTextOrientation(value: Boolean): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setWrapText(value: Boolean): Self = this.set("wrapText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapText: Self = this.set("wrapText", js.undefined)
  }
  
}

