package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsTeamsUsers extends StObject {
  
  var apps: js.UndefOr[js.Array[Externalurl]] = js.undefined
  
  var teams: js.Array[Parent]
  
  var users: js.Array[Avatarurl]
}
object AppsTeamsUsers {
  
  inline def apply(teams: js.Array[Parent], users: js.Array[Avatarurl]): AppsTeamsUsers = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsTeamsUsers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsTeamsUsers] (val x: Self) extends AnyVal {
    
    inline def setApps(value: js.Array[Externalurl]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: Externalurl*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setTeams(value: js.Array[Parent]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: Parent*): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setUsers(value: js.Array[Avatarurl]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: Avatarurl*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
