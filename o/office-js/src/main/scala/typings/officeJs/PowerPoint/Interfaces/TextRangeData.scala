package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `textRange.toJSON()`. */
trait TextRangeData extends StObject {
  
  /**
    * Represents the plain text content of the text range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextRangeData {
  
  inline def apply(): TextRangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRangeData]
  }
  
  extension [Self <: TextRangeData](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
