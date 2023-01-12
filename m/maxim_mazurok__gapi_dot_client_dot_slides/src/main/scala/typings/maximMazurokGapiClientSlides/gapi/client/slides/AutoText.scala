package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoText extends StObject {
  
  /** The rendered content of this auto text, if available. */
  var content: js.UndefOr[String] = js.undefined
  
  /** The styling applied to this auto text. */
  var style: js.UndefOr[TextStyle] = js.undefined
  
  /** The type of this auto text. */
  var `type`: js.UndefOr[String] = js.undefined
}
object AutoText {
  
  inline def apply(): AutoText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoText] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
