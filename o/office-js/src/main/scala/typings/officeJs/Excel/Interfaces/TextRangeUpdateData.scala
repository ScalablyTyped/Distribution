package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TextRange object, for use in `textRange.set({ ... })`. */
trait TextRangeUpdateData extends StObject {
  
  /**
    * Returns a `ShapeFont` object that represents the font attributes for the text range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontUpdateData] = js.undefined
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextRangeUpdateData {
  
  inline def apply(): TextRangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextRangeUpdateData] (val x: Self) extends AnyVal {
    
    inline def setFont(value: ShapeFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
