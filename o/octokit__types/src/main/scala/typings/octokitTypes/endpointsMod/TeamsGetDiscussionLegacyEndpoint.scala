package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionLegacyEndpoint extends js.Object {
  var discussion_number: Double
  var team_id: Double
}

object TeamsGetDiscussionLegacyEndpoint {
  @scala.inline
  def apply(discussion_number: Double, team_id: Double): TeamsGetDiscussionLegacyEndpoint = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsGetDiscussionLegacyEndpoint]
  }
}

