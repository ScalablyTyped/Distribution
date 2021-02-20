package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsUpdateDiscussionLegacyEndpoint extends StObject {
  
  /**
    * The discussion post's body text.
    */
  var body: js.UndefOr[String] = js.native
  
  var discussion_number: Double = js.native
  
  var team_id: Double = js.native
  
  /**
    * The discussion post's title.
    */
  var title: js.UndefOr[String] = js.native
}
object TeamsUpdateDiscussionLegacyEndpoint {
  
  @scala.inline
  def apply(discussion_number: Double, team_id: Double): TeamsUpdateDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionLegacyEndpoint]
  }
  
  @scala.inline
  implicit class TeamsUpdateDiscussionLegacyEndpointMutableBuilder[Self <: TeamsUpdateDiscussionLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_id(value: Double): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
