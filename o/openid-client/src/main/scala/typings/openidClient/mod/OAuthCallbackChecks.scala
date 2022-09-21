package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthCallbackChecks extends StObject {
  
  var code_verifier: js.UndefOr[String] = js.undefined
  
  var jarm: js.UndefOr[Boolean] = js.undefined
  
  var response_type: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object OAuthCallbackChecks {
  
  inline def apply(): OAuthCallbackChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthCallbackChecks]
  }
  
  extension [Self <: OAuthCallbackChecks](x: Self) {
    
    inline def setCode_verifier(value: String): Self = StObject.set(x, "code_verifier", value.asInstanceOf[js.Any])
    
    inline def setCode_verifierUndefined: Self = StObject.set(x, "code_verifier", js.undefined)
    
    inline def setJarm(value: Boolean): Self = StObject.set(x, "jarm", value.asInstanceOf[js.Any])
    
    inline def setJarmUndefined: Self = StObject.set(x, "jarm", js.undefined)
    
    inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
