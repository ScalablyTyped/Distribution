package typings.officeJsPreview.Excel

import typings.officeJsPreview.officeJsPreviewStrings.DoubleAccountant
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.SingleAccountant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the `format.font` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties`, or the `format.font` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesFont extends StObject {
  
  /**
    * Represents the `format.font.bold` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the `format.font.color` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the `format.font.italic` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the `format.font.name` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the `format.font.size` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the `format.font.strikethrough` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the `format.font.subscript` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the `format.font.superscript` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the `format.font.tintAndShade` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the `format.font.underline` property.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    RangeUnderlineStyle | None | Single | typings.officeJsPreview.officeJsPreviewStrings.Double | SingleAccountant | DoubleAccountant
  ] = js.undefined
}
object CellPropertiesFont {
  
  inline def apply(): CellPropertiesFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFont]
  }
  
  extension [Self <: CellPropertiesFont](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setSubscript(value: Boolean): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
    
    inline def setSubscriptUndefined: Self = StObject.set(x, "subscript", js.undefined)
    
    inline def setSuperscript(value: Boolean): Self = StObject.set(x, "superscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscriptUndefined: Self = StObject.set(x, "superscript", js.undefined)
    
    inline def setTintAndShade(value: Double): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    inline def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
    
    inline def setUnderline(
      value: RangeUnderlineStyle | None | Single | typings.officeJsPreview.officeJsPreviewStrings.Double | SingleAccountant | DoubleAccountant
    ): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
