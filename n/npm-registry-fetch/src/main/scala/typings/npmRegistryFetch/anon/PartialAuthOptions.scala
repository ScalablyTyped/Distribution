package typings.npmRegistryFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<npm-registry-fetch.npm-registry-fetch.AuthOptions> */
@js.native
trait PartialAuthOptions extends js.Object {
  
  var _auth: js.UndefOr[String] = js.native
  
  var _authToken: js.UndefOr[String] = js.native
  
  var _password: js.UndefOr[String] = js.native
  
  var `always-auth`: js.UndefOr[Boolean] = js.native
  
  var alwaysAuth: js.UndefOr[Boolean] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var otp: js.UndefOr[Double | String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object PartialAuthOptions {
  
  @scala.inline
  def apply(): PartialAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAuthOptions]
  }
  
  @scala.inline
  implicit class PartialAuthOptionsOps[Self <: PartialAuthOptions] (val x: Self) extends AnyVal {
    
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
    def set_auth(value: String): Self = this.set("_auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_auth: Self = this.set("_auth", js.undefined)
    
    @scala.inline
    def set_authToken(value: String): Self = this.set("_authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_authToken: Self = this.set("_authToken", js.undefined)
    
    @scala.inline
    def set_password(value: String): Self = this.set("_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_password: Self = this.set("_password", js.undefined)
    
    @scala.inline
    def `setAlways-auth`(value: Boolean): Self = this.set("always-auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAlways-auth`: Self = this.set("always-auth", js.undefined)
    
    @scala.inline
    def setAlwaysAuth(value: Boolean): Self = this.set("alwaysAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysAuth: Self = this.set("alwaysAuth", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setOtp(value: Double | String): Self = this.set("otp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtp: Self = this.set("otp", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
