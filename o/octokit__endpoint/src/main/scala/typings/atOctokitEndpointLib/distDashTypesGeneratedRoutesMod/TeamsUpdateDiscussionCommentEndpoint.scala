package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsUpdateDiscussionCommentEndpoint extends js.Object {
  var body: java.lang.String
  var comment_number: scala.Double
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object TeamsUpdateDiscussionCommentEndpoint {
  @scala.inline
  def apply(
    body: java.lang.String,
    comment_number: scala.Double,
    discussion_number: scala.Double,
    team_id: scala.Double
  ): TeamsUpdateDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, comment_number = comment_number, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsUpdateDiscussionCommentEndpoint]
  }
}

