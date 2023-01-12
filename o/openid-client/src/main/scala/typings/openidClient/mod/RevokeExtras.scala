package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeExtras extends StObject {
  
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
  
  var revokeBody: js.UndefOr[js.Object] = js.undefined
}
object RevokeExtras {
  
  inline def apply(): RevokeExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeExtras]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokeExtras] (val x: Self) extends AnyVal {
    
    inline def setClientAssertionPayload(value: js.Object): Self = StObject.set(x, "clientAssertionPayload", value.asInstanceOf[js.Any])
    
    inline def setClientAssertionPayloadUndefined: Self = StObject.set(x, "clientAssertionPayload", js.undefined)
    
    inline def setRevokeBody(value: js.Object): Self = StObject.set(x, "revokeBody", value.asInstanceOf[js.Any])
    
    inline def setRevokeBodyUndefined: Self = StObject.set(x, "revokeBody", js.undefined)
  }
}
