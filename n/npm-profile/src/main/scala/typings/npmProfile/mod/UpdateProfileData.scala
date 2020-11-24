package typings.npmProfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<npm-profile.npm-profile.ProfileData, 'tfa' | 'created' | 'updated' | 'email_verified'>> & npm-profile.npm-profile.UpdateOptions */
@js.native
trait UpdateProfileData extends js.Object {
  
  var cidr_whitelist: js.UndefOr[Null | js.Array[String]] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var freenode: js.UndefOr[String] = js.native
  
  var fullname: js.UndefOr[String] = js.native
  
  var github: js.UndefOr[String] = js.native
  
  var homepage: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * This is used to change your password and is not visible (for obvious reasons) through the get() API.
    * The value should be an object with old and new properties, where the former has the user's current password and the latter has the desired new password.
    */
  var password: js.UndefOr[PasswordUpdate] = js.native
  
  var tfa: js.UndefOr[TFAStatusUpdate] = js.native
  
  var twitter: js.UndefOr[String] = js.native
}
object UpdateProfileData {
  
  @scala.inline
  def apply(): UpdateProfileData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProfileData]
  }
  
  @scala.inline
  implicit class UpdateProfileDataOps[Self <: UpdateProfileData] (val x: Self) extends AnyVal {
    
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
    def setCidr_whitelistVarargs(value: String*): Self = this.set("cidr_whitelist", js.Array(value :_*))
    
    @scala.inline
    def setCidr_whitelist(value: js.Array[String]): Self = this.set("cidr_whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidr_whitelist: Self = this.set("cidr_whitelist", js.undefined)
    
    @scala.inline
    def setCidr_whitelistNull: Self = this.set("cidr_whitelist", null)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFreenode(value: String): Self = this.set("freenode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreenode: Self = this.set("freenode", js.undefined)
    
    @scala.inline
    def setFullname(value: String): Self = this.set("fullname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullname: Self = this.set("fullname", js.undefined)
    
    @scala.inline
    def setGithub(value: String): Self = this.set("github", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGithub: Self = this.set("github", js.undefined)
    
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPassword(value: PasswordUpdate): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setTfa(value: TFAStatusUpdate): Self = this.set("tfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTfa: Self = this.set("tfa", js.undefined)
    
    @scala.inline
    def setTwitter(value: String): Self = this.set("twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitter: Self = this.set("twitter", js.undefined)
  }
}
