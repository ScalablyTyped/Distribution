package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents which properties to load on the format object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFormatLoadOptions extends StObject {
  
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
  def apply(): CellPropertiesFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFormatLoadOptions]
  }
  
  @scala.inline
  implicit class CellPropertiesFormatLoadOptionsMutableBuilder[Self <: CellPropertiesFormatLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    @scala.inline
    def setBorders(value: CellPropertiesBorderLoadOptions): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setFill(value: CellPropertiesFillLoadOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: CellPropertiesFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setIndentLevel(value: Boolean): Self = StObject.set(x, "indentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentLevelUndefined: Self = StObject.set(x, "indentLevel", js.undefined)
    
    @scala.inline
    def setProtection(value: Boolean): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
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
    def setUseStandardHeight(value: Boolean): Self = StObject.set(x, "useStandardHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStandardHeightUndefined: Self = StObject.set(x, "useStandardHeight", js.undefined)
    
    @scala.inline
    def setUseStandardWidth(value: Boolean): Self = StObject.set(x, "useStandardWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStandardWidthUndefined: Self = StObject.set(x, "useStandardWidth", js.undefined)
    
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
