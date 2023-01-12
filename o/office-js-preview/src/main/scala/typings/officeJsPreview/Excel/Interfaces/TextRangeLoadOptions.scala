package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the text that is attached to a shape, in addition to properties and methods for manipulating the text.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait TextRangeLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns a `ShapeFont` object that represents the font attributes for the text range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontLoadOptions] = js.undefined
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[Boolean] = js.undefined
}
object TextRangeLoadOptions {
  
  inline def apply(): TextRangeLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextRangeLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFont(value: ShapeFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
