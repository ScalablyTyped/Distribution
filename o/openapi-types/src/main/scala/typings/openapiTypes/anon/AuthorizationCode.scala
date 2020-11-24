package typings.openapiTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationCode extends js.Object {
  
  var authorizationCode: js.UndefOr[Scopes] = js.native
  
  var clientCredentials: js.UndefOr[RefreshUrl] = js.native
  
  var `implicit`: js.UndefOr[AuthorizationUrl] = js.native
  
  var password: js.UndefOr[RefreshUrl] = js.native
}
object AuthorizationCode {
  
  @scala.inline
  def apply(): AuthorizationCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationCode]
  }
  
  @scala.inline
  implicit class AuthorizationCodeOps[Self <: AuthorizationCode] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationCode(value: Scopes): Self = this.set("authorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationCode: Self = this.set("authorizationCode", js.undefined)
    
    @scala.inline
    def setClientCredentials(value: RefreshUrl): Self = this.set("clientCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCredentials: Self = this.set("clientCredentials", js.undefined)
    
    @scala.inline
    def setImplicit(value: AuthorizationUrl): Self = this.set("implicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicit: Self = this.set("implicit", js.undefined)
    
    @scala.inline
    def setPassword(value: RefreshUrl): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
}
