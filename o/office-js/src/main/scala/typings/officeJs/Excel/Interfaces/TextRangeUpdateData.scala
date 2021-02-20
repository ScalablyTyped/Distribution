package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TextRange object, for use in `textRange.set({ ... })`. */
@js.native
trait TextRangeUpdateData extends StObject {
  
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var font: js.UndefOr[ShapeFontUpdateData] = js.native
  
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var text: js.UndefOr[String] = js.native
}
object TextRangeUpdateData {
  
  @scala.inline
  def apply(): TextRangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeUpdateData]
  }
  
  @scala.inline
  implicit class TextRangeUpdateDataMutableBuilder[Self <: TextRangeUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: ShapeFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
