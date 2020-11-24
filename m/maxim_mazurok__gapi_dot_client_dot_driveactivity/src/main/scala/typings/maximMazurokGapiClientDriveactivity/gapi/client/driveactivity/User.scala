package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends js.Object {
  
  /** A user whose account has since been deleted. */
  var deletedUser: js.UndefOr[js.Any] = js.native
  
  /** A known user. */
  var knownUser: js.UndefOr[KnownUser] = js.native
  
  /** A user about whom nothing is currently known. */
  var unknownUser: js.UndefOr[js.Any] = js.native
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    
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
    def setDeletedUser(value: js.Any): Self = this.set("deletedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedUser: Self = this.set("deletedUser", js.undefined)
    
    @scala.inline
    def setKnownUser(value: KnownUser): Self = this.set("knownUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnownUser: Self = this.set("knownUser", js.undefined)
    
    @scala.inline
    def setUnknownUser(value: js.Any): Self = this.set("unknownUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownUser: Self = this.set("unknownUser", js.undefined)
  }
}
