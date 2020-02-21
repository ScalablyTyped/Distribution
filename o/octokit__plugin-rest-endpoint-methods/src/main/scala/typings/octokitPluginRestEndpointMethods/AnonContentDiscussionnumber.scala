package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentDiscussionnumber extends js.Object {
  var content: AnonEnumRequired
  var discussion_number: AnonRequired
  var team_id: AnonRequired
}

object AnonContentDiscussionnumber {
  @scala.inline
  def apply(content: AnonEnumRequired, discussion_number: AnonRequired, team_id: AnonRequired): AnonContentDiscussionnumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentDiscussionnumber]
  }
}

