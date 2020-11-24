package typings.npmProfile.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileData extends js.Object {
  
  var cidr_whitelist: Null | js.Array[String] = js.native
  
  var created: Date | String = js.native
  
  var email: String = js.native
  
  var email_verified: Boolean = js.native
  
  var freenode: js.UndefOr[String] = js.native
  
  var fullname: js.UndefOr[String] = js.native
  
  var github: js.UndefOr[String] = js.native
  
  var homepage: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  /**
    * two-factor authentication status
    */
  var tfa: TFAStatus = js.native
  
  var twitter: js.UndefOr[String] = js.native
  
  var updated: Date | String = js.native
}
object ProfileData {
  
  @scala.inline
  def apply(
    created: Date | String,
    email: String,
    email_verified: Boolean,
    name: String,
    updated: Date | String
  ): ProfileData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileData]
  }
  
  @scala.inline
  implicit class ProfileDataOps[Self <: ProfileData] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: Date | String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_verified(value: Boolean): Self = this.set("email_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: Date | String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidr_whitelistVarargs(value: String*): Self = this.set("cidr_whitelist", js.Array(value :_*))
    
    @scala.inline
    def setCidr_whitelist(value: js.Array[String]): Self = this.set("cidr_whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidr_whitelistNull: Self = this.set("cidr_whitelist", null)
    
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
    def setTfa(value: TFAStatus): Self = this.set("tfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfaNull: Self = this.set("tfa", null)
    
    @scala.inline
    def setTwitter(value: String): Self = this.set("twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitter: Self = this.set("twitter", js.undefined)
  }
}
