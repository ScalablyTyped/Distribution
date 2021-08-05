package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPosition extends StObject {
  
  /** Horizontal alignment setting for the piece of text. */
  var horizontalAlignment: js.UndefOr[String] = js.undefined
}
object TextPosition {
  
  inline def apply(): TextPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPosition]
  }
  
  extension [Self <: TextPosition](x: Self) {
    
    inline def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
