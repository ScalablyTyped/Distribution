package typings.maximMazurokGapiClientOauth2.gapi.client.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokeninfo extends js.Object {
  
  /** Who is the intended audience for this token. In general the same as issued_to. */
  var audience: js.UndefOr[String] = js.native
  
  /** The email address of the user. Present only if the email scope is present in the request. */
  var email: js.UndefOr[String] = js.native
  
  /** The expiry time of the token, as number of seconds left until expiry. */
  var expires_in: js.UndefOr[Double] = js.native
  
  /** To whom was the token issued to. In general the same as audience. */
  var issued_to: js.UndefOr[String] = js.native
  
  /** The space separated list of scopes granted to this token. */
  var scope: js.UndefOr[String] = js.native
  
  /** The obfuscated user id. */
  var user_id: js.UndefOr[String] = js.native
  
  /** Boolean flag which is true if the email address is verified. Present only if the email scope is present in the request. */
  var verified_email: js.UndefOr[Boolean] = js.native
}
object Tokeninfo {
  
  @scala.inline
  def apply(): Tokeninfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tokeninfo]
  }
  
  @scala.inline
  implicit class TokeninfoOps[Self <: Tokeninfo] (val x: Self) extends AnyVal {
    
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
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setExpires_in(value: Double): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires_in: Self = this.set("expires_in", js.undefined)
    
    @scala.inline
    def setIssued_to(value: String): Self = this.set("issued_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssued_to: Self = this.set("issued_to", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
    
    @scala.inline
    def setVerified_email(value: Boolean): Self = this.set("verified_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified_email: Self = this.set("verified_email", js.undefined)
  }
}
