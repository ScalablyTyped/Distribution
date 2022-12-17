package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsArray extends StObject {
  
  /** @description The slug values for teams */
  var teams: js.Array[String]
}
object TeamsArray {
  
  inline def apply(teams: js.Array[String]): TeamsArray = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsArray]
  }
  
  extension [Self <: TeamsArray](x: Self) {
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
  }
}
