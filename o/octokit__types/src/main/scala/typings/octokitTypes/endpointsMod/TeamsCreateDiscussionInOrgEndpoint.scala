package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCreateDiscussionInOrgEndpoint extends StObject {
  
  /**
    * The discussion post's body text.
    */
  var body: String
  
  @JSName("org")
  var org_ : String
  
  /**
    * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var team_slug: String
  
  /**
    * The discussion post's title.
    */
  var title: String
}
object TeamsCreateDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(body: String, org_ : String, team_slug: String, title: String): TeamsCreateDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCreateDiscussionInOrgEndpointMutableBuilder[Self <: TeamsCreateDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
