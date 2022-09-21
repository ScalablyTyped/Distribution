package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TextRange object, for use in `textRange.set({ ... })`. */
trait TextRangeUpdateData extends StObject {
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextRangeUpdateData {
  
  inline def apply(): TextRangeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeUpdateData]
  }
  
  extension [Self <: TextRangeUpdateData](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
