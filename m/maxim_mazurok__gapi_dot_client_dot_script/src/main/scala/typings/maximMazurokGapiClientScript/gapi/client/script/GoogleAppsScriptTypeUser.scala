package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeUser extends js.Object {
  
  /** The user's domain. */
  var domain: js.UndefOr[String] = js.native
  
  /** The user's identifying email address. */
  var email: js.UndefOr[String] = js.native
  
  /** The user's display name. */
  var name: js.UndefOr[String] = js.native
  
  /** The user's photo. */
  var photoUrl: js.UndefOr[String] = js.native
}
object GoogleAppsScriptTypeUser {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeUser]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeUserOps[Self <: GoogleAppsScriptTypeUser] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
  }
}
