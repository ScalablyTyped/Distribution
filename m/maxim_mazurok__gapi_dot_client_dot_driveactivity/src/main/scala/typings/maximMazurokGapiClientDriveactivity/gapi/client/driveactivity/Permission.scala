package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permission extends StObject {
  
  /** If true, the item can be discovered (e.g. in the user's "Shared with me" collection) without needing a link to the item. */
  var allowDiscovery: js.UndefOr[Boolean] = js.native
  
  /** If set, this permission applies to anyone, even logged out users. */
  var anyone: js.UndefOr[js.Any] = js.native
  
  /** The domain to whom this permission applies. */
  var domain: js.UndefOr[Domain] = js.native
  
  /** The group to whom this permission applies. */
  var group: js.UndefOr[Group] = js.native
  
  /** Indicates the Google Drive permissions role. The role determines a user's ability to read, write, and comment on items. */
  var role: js.UndefOr[String] = js.native
  
  /** The user to whom this permission applies. */
  var user: js.UndefOr[User] = js.native
}
object Permission {
  
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit class PermissionMutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDiscovery(value: Boolean): Self = StObject.set(x, "allowDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDiscoveryUndefined: Self = StObject.set(x, "allowDiscovery", js.undefined)
    
    @scala.inline
    def setAnyone(value: js.Any): Self = StObject.set(x, "anyone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyoneUndefined: Self = StObject.set(x, "anyone", js.undefined)
    
    @scala.inline
    def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
