package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAccount extends StObject {
  
  /** Email address of the service account. If not specified, the default Compute Engine service account for the project will be used. */
  var email: js.UndefOr[String] = js.undefined
  
  /** List of scopes to be enabled for this service account on the VM, in addition to the cloud-platform API scope that will be added by default. */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}
object ServiceAccount {
  
  inline def apply(): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccount]
  }
  
  extension [Self <: ServiceAccount](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
