package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePrincipalIdentity
  extends StObject
     with Identity {
  
  // The application identifier of the service principal.
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ServicePrincipalIdentity {
  
  inline def apply(): ServicePrincipalIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServicePrincipalIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServicePrincipalIdentity] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}
