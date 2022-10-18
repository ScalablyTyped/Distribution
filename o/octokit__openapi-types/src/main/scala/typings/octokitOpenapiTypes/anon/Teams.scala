package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Teams extends StObject {
  
  /** @description The list of apps allowed to bypass pull request requirements. */
  var apps: js.UndefOr[js.Array[Clientsecret]] = js.undefined
  
  /** @description The list of teams allowed to bypass pull request requirements. */
  var teams: js.UndefOr[js.Array[Parent]] = js.undefined
  
  /** @description The list of users allowed to bypass pull request requirements. */
  var users: js.UndefOr[js.Array[Avatarurl]] = js.undefined
}
object Teams {
  
  inline def apply(): Teams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Teams]
  }
  
  extension [Self <: Teams](x: Self) {
    
    inline def setApps(value: js.Array[Clientsecret]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: Clientsecret*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setTeams(value: js.Array[Parent]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    
    inline def setTeamsVarargs(value: Parent*): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setUsers(value: js.Array[Avatarurl]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: Avatarurl*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
