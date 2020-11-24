package typings.maximMazurokGapiClientIdentitytoolkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Email extends js.Object {
  
  /** The user's display name at the IDP. */
  var displayName: js.UndefOr[String] = js.native
  
  /** User's email at IDP. */
  var email: js.UndefOr[String] = js.native
  
  /** User's identifier at IDP. */
  var federatedId: js.UndefOr[String] = js.native
  
  /** User's phone number. */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /** The user's photo url at the IDP. */
  var photoUrl: js.UndefOr[String] = js.native
  
  /** The IdP ID. For white listed IdPs it's a short domain name, e.g., google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP identifier. */
  var providerId: js.UndefOr[String] = js.native
  
  /** User's raw identifier directly returned from IDP. */
  var rawId: js.UndefOr[String] = js.native
  
  /** User's screen name at Twitter or login name at Github. */
  var screenName: js.UndefOr[String] = js.native
}
object Email {
  
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFederatedId(value: String): Self = this.set("federatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFederatedId: Self = this.set("federatedId", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderId: Self = this.set("providerId", js.undefined)
    
    @scala.inline
    def setRawId(value: String): Self = this.set("rawId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawId: Self = this.set("rawId", js.undefined)
    
    @scala.inline
    def setScreenName(value: String): Self = this.set("screenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenName: Self = this.set("screenName", js.undefined)
  }
}
