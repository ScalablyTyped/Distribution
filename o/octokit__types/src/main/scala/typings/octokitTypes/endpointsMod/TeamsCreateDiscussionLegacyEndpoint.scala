package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsCreateDiscussionLegacyEndpoint extends StObject {
  
  /**
    * The discussion post's body text.
    */
  var body: String = js.native
  
  /**
    * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  
  var team_id: Double = js.native
  
  /**
    * The discussion post's title.
    */
  var title: String = js.native
}
object TeamsCreateDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(body: String, team_id: Double, title: String): TeamsCreateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsCreateDiscussionLegacyEndpointMutableBuilder[Self <: TeamsCreateDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
