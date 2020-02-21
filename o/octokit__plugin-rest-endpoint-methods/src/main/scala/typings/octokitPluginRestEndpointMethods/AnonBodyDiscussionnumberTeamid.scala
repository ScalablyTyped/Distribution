package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDiscussionnumberTeamid extends js.Object {
  var body: AnonType
  var discussion_number: AnonRequired
  var team_id: AnonRequired
  var title: AnonType
}

object AnonBodyDiscussionnumberTeamid {
  @scala.inline
  def apply(body: AnonType, discussion_number: AnonRequired, team_id: AnonRequired, title: AnonType): AnonBodyDiscussionnumberTeamid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyDiscussionnumberTeamid]
  }
}

