package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsDeleteDiscussionInOrgEndpoint extends StObject {
  
  var discussion_number: Double
  
  @JSName("org")
  var org_ : String
  
  var team_slug: String
}
object TeamsDeleteDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(discussion_number: Double, org_ : String, team_slug: String): TeamsDeleteDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsDeleteDiscussionInOrgEndpointMutableBuilder[Self <: TeamsDeleteDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
