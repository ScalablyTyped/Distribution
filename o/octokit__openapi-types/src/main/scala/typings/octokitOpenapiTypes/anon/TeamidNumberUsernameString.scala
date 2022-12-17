package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamidNumberUsernameString extends StObject {
  
  /** The unique identifier of the team. */
  var team_id: Double
  
  /** The handle for the GitHub user account. */
  var username: String
}
object TeamidNumberUsernameString {
  
  inline def apply(team_id: Double, username: String): TeamidNumberUsernameString = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamidNumberUsernameString]
  }
  
  extension [Self <: TeamidNumberUsernameString](x: Self) {
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
