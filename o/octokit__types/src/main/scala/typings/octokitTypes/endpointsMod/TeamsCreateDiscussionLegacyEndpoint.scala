package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCreateDiscussionLegacyEndpoint extends StObject {
  
  /**
    * The discussion post's body text.
    */
  var body: String
  
  /**
    * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var team_id: Double
  
  /**
    * The discussion post's title.
    */
  var title: String
}
object TeamsCreateDiscussionLegacyEndpoint {
  
  inline def apply(body: String, team_id: Double, title: String): TeamsCreateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionLegacyEndpoint]
  }
  
  extension [Self <: TeamsCreateDiscussionLegacyEndpoint](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
