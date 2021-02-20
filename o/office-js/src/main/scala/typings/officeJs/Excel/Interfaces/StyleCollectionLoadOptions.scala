package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the styles.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait StyleCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if text is automatically indented when the text alignment in a cell is set to equal distribution.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoIndent: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: A Border collection of four Border objects that represent the style of the four borders.
    *
    * [Api set: ExcelApi 1.7]
    */
  var borders: js.UndefOr[RangeBorderCollectionLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the style is a built-in style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var builtIn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The Fill of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var fill: js.UndefOr[RangeFillLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: A Font object that represents the font of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[RangeFontLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the formula will be hidden when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Represents the horizontal alignment for the style. See Excel.HorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the style includes the FormulaHidden and Locked protection properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeProtection: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: An integer from 0 to 250 that indicates the indent level for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var indentLevel: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the object is locked when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var locked: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The name of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The localized format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The reading order for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var readingOrder: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if text automatically shrinks to fit in the available column width.
    *
    * [Api set: ExcelApi 1.7]
    */
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: The text orientation for the style.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if Excel wraps the text in the object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var wrapText: js.UndefOr[Boolean] = js.native
}
object StyleCollectionLoadOptions {
  
  @scala.inline
  def apply(): StyleCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class StyleCollectionLoadOptionsMutableBuilder[Self <: StyleCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    @scala.inline
    def setBorders(value: RangeBorderCollectionLoadOptions): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setBuiltIn(value: Boolean): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInUndefined: Self = StObject.set(x, "builtIn", js.undefined)
    
    @scala.inline
    def setFill(value: RangeFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: RangeFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormulaHidden(value: Boolean): Self = StObject.set(x, "formulaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaHiddenUndefined: Self = StObject.set(x, "formulaHidden", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setIncludeAlignment(value: Boolean): Self = StObject.set(x, "includeAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAlignmentUndefined: Self = StObject.set(x, "includeAlignment", js.undefined)
    
    @scala.inline
    def setIncludeBorder(value: Boolean): Self = StObject.set(x, "includeBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBorderUndefined: Self = StObject.set(x, "includeBorder", js.undefined)
    
    @scala.inline
    def setIncludeFont(value: Boolean): Self = StObject.set(x, "includeFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFontUndefined: Self = StObject.set(x, "includeFont", js.undefined)
    
    @scala.inline
    def setIncludeNumber(value: Boolean): Self = StObject.set(x, "includeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNumberUndefined: Self = StObject.set(x, "includeNumber", js.undefined)
    
    @scala.inline
    def setIncludePatterns(value: Boolean): Self = StObject.set(x, "includePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePatternsUndefined: Self = StObject.set(x, "includePatterns", js.undefined)
    
    @scala.inline
    def setIncludeProtection(value: Boolean): Self = StObject.set(x, "includeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeProtectionUndefined: Self = StObject.set(x, "includeProtection", js.undefined)
    
    @scala.inline
    def setIndentLevel(value: Boolean): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocal(value: Boolean): Self = StObject.set(x, "numberFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocalUndefined: Self = StObject.set(x, "numberFormatLocal", js.undefined)
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setReadingOrder(value: Boolean): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    @scala.inline
    def setTextOrientation(value: Boolean): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}
