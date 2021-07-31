package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCreateDiscussionCommentInOrgEndpoint extends StObject {
  
  /**
    * The discussion comment's body text.
    */
  var body: String
  
  var discussion_number: Double
  
  @JSName("org")
  var org_ : String
  
  var team_slug: String
}
object TeamsCreateDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(body: String, discussion_number: Double, org_ : String, team_slug: String): TeamsCreateDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCreateDiscussionCommentInOrgEndpointMutableBuilder[Self <: TeamsCreateDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
