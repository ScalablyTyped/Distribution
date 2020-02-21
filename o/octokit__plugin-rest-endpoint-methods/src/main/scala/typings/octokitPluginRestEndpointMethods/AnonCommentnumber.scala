package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentnumber extends js.Object {
  var comment_number: AnonRequired
  var content: AnonEnumRequired
  var discussion_number: AnonRequired
  var team_id: AnonRequired
}

object AnonCommentnumber {
  @scala.inline
  def apply(
    comment_number: AnonRequired,
    content: AnonEnumRequired,
    discussion_number: AnonRequired,
    team_id: AnonRequired
  ): AnonCommentnumber = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommentnumber]
  }
}

