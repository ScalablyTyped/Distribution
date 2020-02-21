package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCommentnumber extends js.Object {
  var body: AnonRequired
  var comment_number: AnonRequired
  var discussion_number: AnonRequired
  var team_id: AnonRequired
}

object AnonBodyCommentnumber {
  @scala.inline
  def apply(
    body: AnonRequired,
    comment_number: AnonRequired,
    discussion_number: AnonRequired,
    team_id: AnonRequired
  ): AnonBodyCommentnumber = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyCommentnumber]
  }
}

