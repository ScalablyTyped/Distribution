package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsDeleteDiscussionCommentLegacyEndpoint extends StObject {
  
  var comment_number: Double
  
  var discussion_number: Double
  
  var team_id: Double
}
object TeamsDeleteDiscussionCommentLegacyEndpoint {
  
  @scala.inline
  def apply(comment_number: Double, discussion_number: Double, team_id: Double): TeamsDeleteDiscussionCommentLegacyEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteDiscussionCommentLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsDeleteDiscussionCommentLegacyEndpointMutableBuilder[Self <: TeamsDeleteDiscussionCommentLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_number(value: Double): Self = StObject.set(x, "comment_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
