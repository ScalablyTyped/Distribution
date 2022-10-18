package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appsurl extends StObject {
  
  var apps: js.Array[Events]
  
  /** Format: uri */
  var apps_url: String
  
  var teams: js.Array[Privacy]
  
  /** Format: uri */
  var teams_url: String
  
  /** Format: uri */
  var url: String
  
  var users: js.Array[Eventsurl]
  
  /** Format: uri */
  var users_url: String
}
object Appsurl {
  
  inline def apply(
    apps: js.Array[Events],
    apps_url: String,
    teams: js.Array[Privacy],
    teams_url: String,
    url: String,
    users: js.Array[Eventsurl],
    users_url: String
  ): Appsurl = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], apps_url = apps_url.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appsurl]
  }
  
  extension [Self <: Appsurl](x: Self) {
    
    inline def setApps(value: js.Array[Events]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsVarargs(value: Events*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setApps_url(value: String): Self = StObject.set(x, "apps_url", value.asInstanceOf[js.Any])
    
    inline def setTeams(value: js.Array[Privacy]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: Privacy*): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[Eventsurl]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: Eventsurl*): Self = StObject.set(x, "users", js.Array(value*))
    
    inline def setUsers_url(value: String): Self = StObject.set(x, "users_url", value.asInstanceOf[js.Any])
  }
}
