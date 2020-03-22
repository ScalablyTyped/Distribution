package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsDeleteForTeamDiscussionParams extends js.Object {
  var discussion_number: Double
  var org: String
  var reaction_id: Double
  var team_slug: String
}

object ReactionsDeleteForTeamDiscussionParams {
  @scala.inline
  def apply(discussion_number: Double, org: String, reaction_id: Double, team_slug: String): ReactionsDeleteForTeamDiscussionParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsDeleteForTeamDiscussionParams]
  }
}

