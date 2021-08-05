package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  /** If true, the item can be discovered (e.g. in the user's "Shared with me" collection) without needing a link to the item. */
  var allowDiscovery: js.UndefOr[Boolean] = js.undefined
  
  /** If set, this permission applies to anyone, even logged out users. */
  var anyone: js.UndefOr[js.Any] = js.undefined
  
  /** The domain to whom this permission applies. */
  var domain: js.UndefOr[Domain] = js.undefined
  
  /** The group to whom this permission applies. */
  var group: js.UndefOr[Group] = js.undefined
  
  /** Indicates the Google Drive permissions role. The role determines a user's ability to read, write, and comment on items. */
  var role: js.UndefOr[String] = js.undefined
  
  /** The user to whom this permission applies. */
  var user: js.UndefOr[User] = js.undefined
}
object Permission {
  
  inline def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setAllowDiscovery(value: Boolean): Self = StObject.set(x, "allowDiscovery", value.asInstanceOf[js.Any])
    
    inline def setAllowDiscoveryUndefined: Self = StObject.set(x, "allowDiscovery", js.undefined)
    
    inline def setAnyone(value: js.Any): Self = StObject.set(x, "anyone", value.asInstanceOf[js.Any])
    
    inline def setAnyoneUndefined: Self = StObject.set(x, "anyone", js.undefined)
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
