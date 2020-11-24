package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MtlsEndpointAliases extends js.Object {
  
  var device_authorization_endpoint: js.UndefOr[String] = js.native
  
  var introspection_endpoint: js.UndefOr[String] = js.native
  
  var revocation_endpoint: js.UndefOr[String] = js.native
  
  var token_endpoint: js.UndefOr[String] = js.native
  
  var userinfo_endpoint: js.UndefOr[String] = js.native
}
object MtlsEndpointAliases {
  
  @scala.inline
  def apply(): MtlsEndpointAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MtlsEndpointAliases]
  }
  
  @scala.inline
  implicit class MtlsEndpointAliasesOps[Self <: MtlsEndpointAliases] (val x: Self) extends AnyVal {
    
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
    def setDevice_authorization_endpoint(value: String): Self = this.set("device_authorization_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice_authorization_endpoint: Self = this.set("device_authorization_endpoint", js.undefined)
    
    @scala.inline
    def setIntrospection_endpoint(value: String): Self = this.set("introspection_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntrospection_endpoint: Self = this.set("introspection_endpoint", js.undefined)
    
    @scala.inline
    def setRevocation_endpoint(value: String): Self = this.set("revocation_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocation_endpoint: Self = this.set("revocation_endpoint", js.undefined)
    
    @scala.inline
    def setToken_endpoint(value: String): Self = this.set("token_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_endpoint: Self = this.set("token_endpoint", js.undefined)
    
    @scala.inline
    def setUserinfo_endpoint(value: String): Self = this.set("userinfo_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserinfo_endpoint: Self = this.set("userinfo_endpoint", js.undefined)
  }
}
