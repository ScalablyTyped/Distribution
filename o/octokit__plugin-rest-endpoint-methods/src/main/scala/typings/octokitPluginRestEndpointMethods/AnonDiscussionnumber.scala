package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiscussionnumber extends js.Object {
  var discussion_number: AnonRequired
  var team_id: AnonRequired
}

object AnonDiscussionnumber {
  @scala.inline
  def apply(discussion_number: AnonRequired, team_id: AnonRequired): AnonDiscussionnumber = {
    val __obj = js.Dynamic.literal(discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDiscussionnumber]
  }
}

