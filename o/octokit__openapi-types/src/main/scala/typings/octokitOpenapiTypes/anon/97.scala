package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  /** @description The slug values for teams */
  var teams: js.Array[String]
}
object `97` {
  
  inline def apply(teams: js.Array[String]): `97` = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
  }
}
