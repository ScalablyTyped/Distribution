package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantExtras extends StObject {
  
  var DPoP: js.UndefOr[DPoPInput] = js.undefined
  
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
}
object GrantExtras {
  
  inline def apply(): GrantExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantExtras]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrantExtras] (val x: Self) extends AnyVal {
    
    inline def setClientAssertionPayload(value: js.Object): Self = StObject.set(x, "clientAssertionPayload", value.asInstanceOf[js.Any])
    
    inline def setClientAssertionPayloadUndefined: Self = StObject.set(x, "clientAssertionPayload", js.undefined)
    
    inline def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
    
    inline def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
  }
}
