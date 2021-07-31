package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.`squirrel-girl`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionsDeleteForTeamDiscussionEndpoint
  extends StObject
     with RequiredPreview[`squirrel-girl`] {
  
  var discussion_number: Double
  
  @JSName("org")
  var org_ : String
  
  var reaction_id: Double
  
  var team_slug: String
}
object ReactionsDeleteForTeamDiscussionEndpoint {
  
  @scala.inline
  def apply(
    discussion_number: Double,
    mediaType: `0`[`squirrel-girl`],
    org_ : String,
    reaction_id: Double,
    team_slug: String
  ): ReactionsDeleteForTeamDiscussionEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteForTeamDiscussionEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsDeleteForTeamDiscussionEndpointMutableBuilder[Self <: ReactionsDeleteForTeamDiscussionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaction_id(value: Double): Self = StObject.set(x, "reaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
