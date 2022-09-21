package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSpan extends StObject {
  
  /** The unicode codepoint index of the beginning of this span. */
  var beginOffset: js.UndefOr[Double] = js.undefined
  
  /** The original text contained in this span. */
  var content: js.UndefOr[String] = js.undefined
}
object TextSpan {
  
  inline def apply(): TextSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSpan]
  }
  
  extension [Self <: TextSpan](x: Self) {
    
    inline def setBeginOffset(value: Double): Self = StObject.set(x, "beginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "beginOffset", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
