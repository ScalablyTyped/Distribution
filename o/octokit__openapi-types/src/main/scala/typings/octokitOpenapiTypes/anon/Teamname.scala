package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Teamname extends StObject {
  
  /**
    * @description The id for a team
    * @example 1
    */
  var team_id: Double
  
  /**
    * @description The name of the team
    * @example team-test
    */
  var team_name: String
}
object Teamname {
  
  inline def apply(team_id: Double, team_name: String): Teamname = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any], team_name = team_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teamname]
  }
  
  extension [Self <: Teamname](x: Self) {
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_name(value: String): Self = StObject.set(x, "team_name", value.asInstanceOf[js.Any])
  }
}
