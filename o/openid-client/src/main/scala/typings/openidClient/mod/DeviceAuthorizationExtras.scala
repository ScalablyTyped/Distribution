package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAuthorizationExtras extends StObject {
  
  var DPoP: js.UndefOr[DPoPInput] = js.undefined
  
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
  
  var exchangeBody: js.UndefOr[js.Object] = js.undefined
}
object DeviceAuthorizationExtras {
  
  inline def apply(): DeviceAuthorizationExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAuthorizationExtras]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceAuthorizationExtras] (val x: Self) extends AnyVal {
    
    inline def setClientAssertionPayload(value: js.Object): Self = StObject.set(x, "clientAssertionPayload", value.asInstanceOf[js.Any])
    
    inline def setClientAssertionPayloadUndefined: Self = StObject.set(x, "clientAssertionPayload", js.undefined)
    
    inline def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
    
    inline def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
    
    inline def setExchangeBody(value: js.Object): Self = StObject.set(x, "exchangeBody", value.asInstanceOf[js.Any])
    
    inline def setExchangeBodyUndefined: Self = StObject.set(x, "exchangeBody", js.undefined)
  }
}
