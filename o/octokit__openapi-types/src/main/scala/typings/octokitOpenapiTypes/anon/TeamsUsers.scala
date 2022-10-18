package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsUsers extends StObject {
  
  var teams: js.Array[Parent]
  
  var users: js.Array[Avatarurl]
}
object TeamsUsers {
  
  inline def apply(teams: js.Array[Parent], users: js.Array[Avatarurl]): TeamsUsers = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUsers]
  }
  
  extension [Self <: TeamsUsers](x: Self) {
    
    inline def setTeams(value: js.Array[Parent]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: Parent*): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setUsers(value: js.Array[Avatarurl]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: Avatarurl*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
