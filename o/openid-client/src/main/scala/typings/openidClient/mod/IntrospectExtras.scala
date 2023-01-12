package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectExtras extends StObject {
  
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
  
  var introspectBody: js.UndefOr[js.Object] = js.undefined
}
object IntrospectExtras {
  
  inline def apply(): IntrospectExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrospectExtras]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntrospectExtras] (val x: Self) extends AnyVal {
    
    inline def setClientAssertionPayload(value: js.Object): Self = StObject.set(x, "clientAssertionPayload", value.asInstanceOf[js.Any])
    
    inline def setClientAssertionPayloadUndefined: Self = StObject.set(x, "clientAssertionPayload", js.undefined)
    
    inline def setIntrospectBody(value: js.Object): Self = StObject.set(x, "introspectBody", value.asInstanceOf[js.Any])
    
    inline def setIntrospectBodyUndefined: Self = StObject.set(x, "introspectBody", js.undefined)
  }
}
