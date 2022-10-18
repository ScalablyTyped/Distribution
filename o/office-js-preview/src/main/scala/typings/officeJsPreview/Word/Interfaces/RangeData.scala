package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `range.toJSON()`. */
trait RangeData extends StObject {
  
  /**
    * Gets the collection of field objects in the range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var fields: js.UndefOr[js.Array[FieldData]] = js.undefined
  
  /**
    * Gets the text format of the range. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the collection of inline picture objects in the range.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  
  /**
    * Checks whether the range length is zero.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var isEmpty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJsPreview.Word.Style, typings.officeJsPreview.officeJsPreviewStrings.Other, typings.officeJsPreview.officeJsPreviewStrings.Normal */ Any
  ] = js.undefined
  
  /**
    * Gets the text of the range.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
}
object RangeData {
  
  inline def apply(): RangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeData]
  }
  
  extension [Self <: RangeData](x: Self) {
    
    inline def setFields(value: js.Array[FieldData]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldData*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setInlinePictures(value: js.Array[InlinePictureData]): Self = StObject.set(x, "inlinePictures", value.asInstanceOf[js.Any])
    
    inline def setInlinePicturesUndefined: Self = StObject.set(x, "inlinePictures", js.undefined)
    
    inline def setInlinePicturesVarargs(value: InlinePictureData*): Self = StObject.set(x, "inlinePictures", js.Array(value*))
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltIn(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJsPreview.Word.Style, typings.officeJsPreview.officeJsPreviewStrings.Other, typings.officeJsPreview.officeJsPreviewStrings.Normal */ Any
    ): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
