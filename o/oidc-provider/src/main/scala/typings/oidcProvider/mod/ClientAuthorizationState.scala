package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAuthorizationState extends StObject {
  
  var grantId: js.UndefOr[String] = js.undefined
  
  var persistsLogout: js.UndefOr[Boolean] = js.undefined
  
  var sid: js.UndefOr[String] = js.undefined
}
object ClientAuthorizationState {
  
  inline def apply(): ClientAuthorizationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientAuthorizationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientAuthorizationState] (val x: Self) extends AnyVal {
    
    inline def setGrantId(value: String): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "grantId", js.undefined)
    
    inline def setPersistsLogout(value: Boolean): Self = StObject.set(x, "persistsLogout", value.asInstanceOf[js.Any])
    
    inline def setPersistsLogoutUndefined: Self = StObject.set(x, "persistsLogout", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
  }
}
