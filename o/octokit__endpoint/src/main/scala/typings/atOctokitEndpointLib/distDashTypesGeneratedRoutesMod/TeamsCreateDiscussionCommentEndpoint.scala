package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionCommentEndpoint extends js.Object {
  var body: java.lang.String
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object TeamsCreateDiscussionCommentEndpoint {
  @scala.inline
  def apply(body: java.lang.String, discussion_number: scala.Double, team_id: scala.Double): TeamsCreateDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsCreateDiscussionCommentEndpoint]
  }
}

