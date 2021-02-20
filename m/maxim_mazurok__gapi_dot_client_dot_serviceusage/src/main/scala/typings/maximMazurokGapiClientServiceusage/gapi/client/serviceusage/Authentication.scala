package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authentication extends StObject {
  
  /** Defines a set of authentication providers that a service supports. */
  var providers: js.UndefOr[js.Array[AuthProvider]] = js.native
  
  /** A list of authentication rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order. */
  var rules: js.UndefOr[js.Array[AuthenticationRule]] = js.native
}
object Authentication {
  
  @scala.inline
  def apply(): Authentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  implicit class AuthenticationMutableBuilder[Self <: Authentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviders(value: js.Array[AuthProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: AuthProvider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[AuthenticationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: AuthenticationRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
