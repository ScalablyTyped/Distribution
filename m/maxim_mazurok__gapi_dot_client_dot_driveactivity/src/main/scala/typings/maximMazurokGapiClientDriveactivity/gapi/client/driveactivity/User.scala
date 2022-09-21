package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /** A user whose account has since been deleted. */
  var deletedUser: js.UndefOr[Any] = js.undefined
  
  /** A known user. */
  var knownUser: js.UndefOr[KnownUser] = js.undefined
  
  /** A user about whom nothing is currently known. */
  var unknownUser: js.UndefOr[Any] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setDeletedUser(value: Any): Self = StObject.set(x, "deletedUser", value.asInstanceOf[js.Any])
    
    inline def setDeletedUserUndefined: Self = StObject.set(x, "deletedUser", js.undefined)
    
    inline def setKnownUser(value: KnownUser): Self = StObject.set(x, "knownUser", value.asInstanceOf[js.Any])
    
    inline def setKnownUserUndefined: Self = StObject.set(x, "knownUser", js.undefined)
    
    inline def setUnknownUser(value: Any): Self = StObject.set(x, "unknownUser", value.asInstanceOf[js.Any])
    
    inline def setUnknownUserUndefined: Self = StObject.set(x, "unknownUser", js.undefined)
  }
}
