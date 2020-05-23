package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionLegacyEndpoint extends js.Object {
  var discussion_number: Double
  var team_id: Double
}

object TeamsDeleteDiscussionLegacyEndpoint {
  @scala.inline
  def apply(discussion_number: Double, team_id: Double): TeamsDeleteDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsDeleteDiscussionLegacyEndpoint]
  }
}

