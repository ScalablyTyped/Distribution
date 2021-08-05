package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsGetPermissionForUserResponseData extends StObject {
  
  var permission: String
  
  var user: Avatarurl
}
object ProjectsGetPermissionForUserResponseData {
  
  inline def apply(permission: String, user: Avatarurl): ProjectsGetPermissionForUserResponseData = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetPermissionForUserResponseData]
  }
  
  extension [Self <: ProjectsGetPermissionForUserResponseData](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
