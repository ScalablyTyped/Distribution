package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientId extends StObject {
  
  var accountId: js.UndefOr[String] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
}
object ClientId {
  
  inline def apply(): ClientId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientId] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
  }
}
