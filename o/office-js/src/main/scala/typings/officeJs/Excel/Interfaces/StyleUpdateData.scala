package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.HorizontalAlignment
import typings.officeJs.Excel.ReadingOrder
import typings.officeJs.Excel.VerticalAlignment
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.CenterAcrossSelection
import typings.officeJs.officeJsStrings.Context
import typings.officeJs.officeJsStrings.Distributed
import typings.officeJs.officeJsStrings.Fill
import typings.officeJs.officeJsStrings.General
import typings.officeJs.officeJsStrings.Justify
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.LeftToRight
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.RightToLeft
import typings.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Style object, for use in `style.set({ ... })`. */
trait StyleUpdateData extends StObject {
  
  /**
    *
    * Specifies if text is automatically indented when the text alignment in a cell is set to equal distribution.
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
  var borders: js.UndefOr[RangeBorderCollectionUpdateData] = js.undefined
  
  /**
    *
    * The Fill of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var fill: js.UndefOr[RangeFillUpdateData] = js.undefined
  
  /**
    *
    * A Font object that represents the font of the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[RangeFontUpdateData] = js.undefined
  
  /**
    *
    * Specifies if the formula will be hidden when the worksheet is protected.
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
  var horizontalAlignment: js.UndefOr[
    HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
  ] = js.undefined
  
  /**
    *
    * Specifies if the style includes the AutoIndent, HorizontalAlignment, VerticalAlignment, WrapText, IndentLevel, and TextOrientation properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeAlignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the style includes the Color, ColorIndex, LineStyle, and Weight border properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeBorder: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the style includes the Background, Bold, Color, ColorIndex, FontStyle, Italic, Name, Size, Strikethrough, Subscript, Superscript, and Underline font properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeFont: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the style includes the NumberFormat property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includeNumber: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the style includes the Color, ColorIndex, InvertIfNegative, Pattern, PatternColor, and PatternColorIndex interior properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var includePatterns: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the style includes the FormulaHidden and Locked protection properties.
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
  var indentLevel: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies if the object is locked when the worksheet is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * The format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The localized format code of the number format for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var numberFormatLocal: js.UndefOr[String] = js.undefined
  
  /**
    *
    * The reading order for the style.
    *
    * [Api set: ExcelApi 1.7]
    */
  var readingOrder: js.UndefOr[ReadingOrder | Context | LeftToRight | RightToLeft] = js.undefined
  
  /**
    *
    * Specifies if text automatically shrinks to fit in the available column width.
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
  var textOrientation: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the vertical alignment for the style. See Excel.VerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Top | Center | Bottom | Justify | Distributed] = js.undefined
  
  /**
    *
    * Specifies if Excel wraps the text in the object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var wrapText: js.UndefOr[Boolean] = js.undefined
}
object StyleUpdateData {
  
  @scala.inline
  def apply(): StyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleUpdateData]
  }
  
  @scala.inline
  implicit class StyleUpdateDataMutableBuilder[Self <: StyleUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    @scala.inline
    def setBorders(value: RangeBorderCollectionUpdateData): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setFill(value: RangeFillUpdateData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: RangeFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormulaHidden(value: Boolean): Self = StObject.set(x, "formulaHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaHiddenUndefined: Self = StObject.set(x, "formulaHidden", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(
      value: HorizontalAlignment | General | Left | Center | Right | Fill | Justify | CenterAcrossSelection | Distributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
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
    def setIndentLevel(value: Double): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocal(value: String): Self = StObject.set(x, "numberFormatLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatLocalUndefined: Self = StObject.set(x, "numberFormatLocal", js.undefined)
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setReadingOrder(value: ReadingOrder | Context | LeftToRight | RightToLeft): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    @scala.inline
    def setTextOrientation(value: Double): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | Top | Center | Bottom | Justify | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}
