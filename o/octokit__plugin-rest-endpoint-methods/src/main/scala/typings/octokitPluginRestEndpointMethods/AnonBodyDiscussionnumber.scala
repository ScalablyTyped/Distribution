package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDiscussionnumber extends js.Object {
  var body: AnonRequired
  var discussion_number: AnonRequired
  var team_id: AnonRequired
}

object AnonBodyDiscussionnumber {
  @scala.inline
  def apply(body: AnonRequired, discussion_number: AnonRequired, team_id: AnonRequired): AnonBodyDiscussionnumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyDiscussionnumber]
  }
}

