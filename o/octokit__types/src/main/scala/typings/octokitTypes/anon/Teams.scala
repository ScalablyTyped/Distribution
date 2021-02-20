package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Teams extends StObject {
  
  var teams: js.Array[Membersurl] = js.native
  
  var teams_url: String = js.native
  
  var url: String = js.native
  
  var users: js.Array[Avatarurl] = js.native
  
  var users_url: String = js.native
}
object Teams {
  
  @scala.inline
  def apply(
    teams: js.Array[Membersurl],
    teams_url: String,
    url: String,
    users: js.Array[Avatarurl],
    users_url: String
  ): Teams = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teams]
  }
  
  @scala.inline
  implicit class TeamsMutableBuilder[Self <: Teams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTeams(value: js.Array[Membersurl]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: Membersurl*): Self = StObject.set(x, "teams", js.Array(value :_*))
    
    @scala.inline
    def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: js.Array[Avatarurl]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Avatarurl*): Self = StObject.set(x, "users", js.Array(value :_*))
    
    @scala.inline
    def setUsers_url(value: String): Self = StObject.set(x, "users_url", value.asInstanceOf[js.Any])
  }
}
