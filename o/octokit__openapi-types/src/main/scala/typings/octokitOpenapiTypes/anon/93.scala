package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  /** @description The list of app `slug`s allowed to bypass pull request requirements. */
  var apps: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description The list of team `slug`s allowed to bypass pull request requirements. */
  var teams: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description The list of user `login`s allowed to bypass pull request requirements. */
  var users: js.UndefOr[js.Array[String]] = js.undefined
}
object `93` {
  
  inline def apply(): `93` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`93`]
  }
  
  extension [Self <: `93`](x: Self) {
    
    inline def setApps(value: js.Array[String]): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(value: String*): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setUsers(value: js.Array[String]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: String*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
