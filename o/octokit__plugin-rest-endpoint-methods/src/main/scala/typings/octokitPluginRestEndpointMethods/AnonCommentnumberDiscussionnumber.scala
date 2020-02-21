package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentnumberDiscussionnumber extends js.Object {
  var comment_number: AnonRequired
  var discussion_number: AnonRequired
  var team_id: AnonRequired
}

object AnonCommentnumberDiscussionnumber {
  @scala.inline
  def apply(comment_number: AnonRequired, discussion_number: AnonRequired, team_id: AnonRequired): AnonCommentnumberDiscussionnumber = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommentnumberDiscussionnumber]
  }
}

