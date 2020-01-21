package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsGetDiscussionLegacyParams extends js.Object {
  var discussion_number: Double
  var team_id: Double
}

object TeamsGetDiscussionLegacyParams {
  @scala.inline
  def apply(discussion_number: Double, team_id: Double): TeamsGetDiscussionLegacyParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsGetDiscussionLegacyParams]
  }
}

