package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReauthSettings extends StObject {
  
  /** Reauth session lifetime, how long before a user has to reauthenticate again. */
  var maxAge: js.UndefOr[String] = js.undefined
  
  /** Reauth method requested. */
  var method: js.UndefOr[String] = js.undefined
  
  /** How IAP determines the effective policy in cases of hierarchial policies. Policies are merged from higher in the hierarchy to lower in the hierarchy. */
  var policyType: js.UndefOr[String] = js.undefined
}
object ReauthSettings {
  
  inline def apply(): ReauthSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReauthSettings]
  }
  
  extension [Self <: ReauthSettings](x: Self) {
    
    inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPolicyType(value: String): Self = StObject.set(x, "policyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "policyType", js.undefined)
  }
}
