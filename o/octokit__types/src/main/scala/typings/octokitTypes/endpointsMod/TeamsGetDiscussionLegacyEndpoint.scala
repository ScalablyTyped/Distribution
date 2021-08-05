package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsGetDiscussionLegacyEndpoint extends StObject {
  
  var discussion_number: Double
  
  var team_id: Double
}
object TeamsGetDiscussionLegacyEndpoint {
  
  inline def apply(discussion_number: Double, team_id: Double): TeamsGetDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetDiscussionLegacyEndpoint]
  }
  
  extension [Self <: TeamsGetDiscussionLegacyEndpoint](x: Self) {
    
    inline def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
