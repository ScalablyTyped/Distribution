package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedStyle extends StObject {
  
  /** The type of this named style. */
  var namedStyleType: js.UndefOr[String] = js.undefined
  
  /** The paragraph style of this named style. */
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  
  /** The text style of this named style. */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}
object NamedStyle {
  
  inline def apply(): NamedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStyle]
  }
  
  extension [Self <: NamedStyle](x: Self) {
    
    inline def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
    
    inline def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
    
    inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
