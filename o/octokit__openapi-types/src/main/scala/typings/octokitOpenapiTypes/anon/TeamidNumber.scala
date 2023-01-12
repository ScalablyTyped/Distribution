package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamidNumber extends StObject {
  
  /** The unique identifier of the team. */
  var team_id: Double
}
object TeamidNumber {
  
  inline def apply(team_id: Double): TeamidNumber = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamidNumber] (val x: Self) extends AnyVal {
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
