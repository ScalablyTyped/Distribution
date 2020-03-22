package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsDeleteForTeamDiscussionCommentParams extends js.Object {
  var comment_number: Double
  var discussion_number: Double
  var org: String
  var reaction_id: Double
  var team_slug: String
}

object ReactionsDeleteForTeamDiscussionCommentParams {
  @scala.inline
  def apply(
    comment_number: Double,
    discussion_number: Double,
    org: String,
    reaction_id: Double,
    team_slug: String
  ): ReactionsDeleteForTeamDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsDeleteForTeamDiscussionCommentParams]
  }
}

