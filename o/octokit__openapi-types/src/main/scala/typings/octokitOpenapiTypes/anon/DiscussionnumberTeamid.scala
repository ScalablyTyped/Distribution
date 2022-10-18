package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscussionnumberTeamid extends StObject {
  
  /** The number that identifies the discussion. */
  var discussion_number: Double
  
  /** The unique identifier of the team. */
  var team_id: Double
}
object DiscussionnumberTeamid {
  
  inline def apply(discussion_number: Double, team_id: Double): DiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscussionnumberTeamid]
  }
  
  extension [Self <: DiscussionnumberTeamid](x: Self) {
    
    inline def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
