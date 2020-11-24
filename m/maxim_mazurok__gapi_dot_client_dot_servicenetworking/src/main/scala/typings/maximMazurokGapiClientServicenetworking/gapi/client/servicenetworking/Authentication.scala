package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authentication extends js.Object {
  
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
  implicit class AuthenticationOps[Self <: Authentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvidersVarargs(value: AuthProvider*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[AuthProvider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: AuthenticationRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[AuthenticationRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
