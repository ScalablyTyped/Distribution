package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectidNumberTeamidNumber extends StObject {
  
  /** The unique identifier of the project. */
  var project_id: Double
  
  /** The unique identifier of the team. */
  var team_id: Double
}
object ProjectidNumberTeamidNumber {
  
  inline def apply(project_id: Double, team_id: Double): ProjectidNumberTeamidNumber = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidNumberTeamidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectidNumberTeamidNumber] (val x: Self) extends AnyVal {
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
