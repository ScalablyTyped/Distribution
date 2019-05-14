package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForTeamDiscussionComment_Options extends js.Object {
  var comment_number: scala.Double
  var content: java.lang.String
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object ReactionsCreateForTeamDiscussionComment_Options {
  @scala.inline
  def apply(
    comment_number: scala.Double,
    content: java.lang.String,
    discussion_number: scala.Double,
    team_id: scala.Double
  ): ReactionsCreateForTeamDiscussionComment_Options = {
    val __obj = js.Dynamic.literal(comment_number = comment_number, content = content, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionComment_Options]
  }
}

