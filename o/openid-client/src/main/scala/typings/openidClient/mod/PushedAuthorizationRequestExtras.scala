package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushedAuthorizationRequestExtras extends StObject {
  
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
}
object PushedAuthorizationRequestExtras {
  
  inline def apply(): PushedAuthorizationRequestExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushedAuthorizationRequestExtras]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushedAuthorizationRequestExtras] (val x: Self) extends AnyVal {
    
    inline def setClientAssertionPayload(value: js.Object): Self = StObject.set(x, "clientAssertionPayload", value.asInstanceOf[js.Any])
    
    inline def setClientAssertionPayloadUndefined: Self = StObject.set(x, "clientAssertionPayload", js.undefined)
  }
}
