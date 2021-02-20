package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies which properties to load on the `format.font` object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait CellPropertiesFontLoadOptions extends StObject {
  
  /**
    *
    * Specifies whether to load on the `bold` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `color` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `italic` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `name` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `size` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `strikethrough` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `subscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var subscript: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `superscript` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var superscript: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `tintAndShade` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to load on the `underline` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[Boolean] = js.native
}
object CellPropertiesFontLoadOptions {
  
  @scala.inline
  def apply(): CellPropertiesFontLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesFontLoadOptions]
  }
  
  @scala.inline
  implicit class CellPropertiesFontLoadOptionsMutableBuilder[Self <: CellPropertiesFontLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    @scala.inline
    def setSubscript(value: Boolean): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptUndefined: Self = StObject.set(x, "subscript", js.undefined)
    
    @scala.inline
    def setSuperscript(value: Boolean): Self = StObject.set(x, "superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscriptUndefined: Self = StObject.set(x, "superscript", js.undefined)
    
    @scala.inline
    def setTintAndShade(value: Boolean): Self = StObject.set(x, "tintAndShade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintAndShadeUndefined: Self = StObject.set(x, "tintAndShade", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
