package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Events
import typings.octokitTypes.anon.Membersurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetAccessRestrictionsResponseData extends StObject {
  
  var apps: js.Array[Events] = js.native
  
  var apps_url: String = js.native
  
  var teams: js.Array[Membersurl] = js.native
  
  var teams_url: String = js.native
  
  var url: String = js.native
  
  var users: js.Array[Avatarurl] = js.native
  
  var users_url: String = js.native
}
object ReposGetAccessRestrictionsResponseData {
  
  @scala.inline
  def apply(
    apps: js.Array[Events],
    apps_url: String,
    teams: js.Array[Membersurl],
    teams_url: String,
    url: String,
    users: js.Array[Avatarurl],
    users_url: String
  ): ReposGetAccessRestrictionsResponseData = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], apps_url = apps_url.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAccessRestrictionsResponseData]
  }
  
  @scala.inline
  implicit class ReposGetAccessRestrictionsResponseDataMutableBuilder[Self <: ReposGetAccessRestrictionsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: js.Array[Events]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsVarargs(value: Events*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    @scala.inline
    def setApps_url(value: String): Self = StObject.set(x, "apps_url", value.asInstanceOf[js.Any])
    
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
