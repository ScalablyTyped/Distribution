package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
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
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedUser(value: js.Any): Self = StObject.set(x, "deletedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUserUndefined: Self = StObject.set(x, "deletedUser", js.undefined)
    
    @scala.inline
    def setKnownUser(value: KnownUser): Self = StObject.set(x, "knownUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownUserUndefined: Self = StObject.set(x, "knownUser", js.undefined)
    
    @scala.inline
    def setUnknownUser(value: js.Any): Self = StObject.set(x, "unknownUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownUserUndefined: Self = StObject.set(x, "unknownUser", js.undefined)
  }
}
