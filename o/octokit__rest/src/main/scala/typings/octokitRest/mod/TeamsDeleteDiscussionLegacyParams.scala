package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionLegacyParams extends js.Object {
  var discussion_number: Double
  var team_id: Double
}

object TeamsDeleteDiscussionLegacyParams {
  @scala.inline
  def apply(discussion_number: Double, team_id: Double): TeamsDeleteDiscussionLegacyParams = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsDeleteDiscussionLegacyParams]
  }
}

