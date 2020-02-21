package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionDiscussionnumber extends js.Object {
  var direction: AnonEnum
  var discussion_number: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var team_id: AnonRequired
}

object AnonDirectionDiscussionnumber {
  @scala.inline
  def apply(
    direction: AnonEnum,
    discussion_number: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    team_id: AnonRequired
  ): AnonDirectionDiscussionnumber = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionDiscussionnumber]
  }
}

