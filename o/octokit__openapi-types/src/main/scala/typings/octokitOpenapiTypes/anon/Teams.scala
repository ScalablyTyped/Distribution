package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Teams extends StObject {
  
  /** @description The list of app `slug`s with push access */
  var apps: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description The list of team `slug`s with push access */
  var teams: js.Array[String]
  
  /** @description The list of user `login`s with push access */
  var users: js.Array[String]
}
object Teams {
  
  inline def apply(teams: js.Array[String], users: js.Array[String]): Teams = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Teams] (val x: Self) extends AnyVal {
    
    inline def setApps(value: js.Array[String]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: String*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
