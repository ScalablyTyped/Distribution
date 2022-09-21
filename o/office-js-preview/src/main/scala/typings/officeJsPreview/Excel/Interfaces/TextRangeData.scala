package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `textRange.toJSON()`. */
trait TextRangeData extends StObject {
  
  /**
    * Returns a `ShapeFont` object that represents the font attributes for the text range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontData] = js.undefined
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextRangeData {
  
  inline def apply(): TextRangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeData]
  }
  
  extension [Self <: TextRangeData](x: Self) {
    
    inline def setFont(value: ShapeFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
