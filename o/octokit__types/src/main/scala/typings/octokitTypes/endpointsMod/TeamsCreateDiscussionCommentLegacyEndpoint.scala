package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCreateDiscussionCommentLegacyEndpoint extends StObject {
  
  /**
    * The discussion comment's body text.
    */
  var body: String
  
  var discussion_number: Double
  
  var team_id: Double
}
object TeamsCreateDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(body: String, discussion_number: Double, team_id: Double): TeamsCreateDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCreateDiscussionCommentLegacyEndpointMutableBuilder[Self <: TeamsCreateDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
