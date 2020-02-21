package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPagePerpageTeamid extends js.Object {
  var page: AnonType
  var per_page: AnonType
  var team_id: AnonRequired
}

object AnonPagePerpageTeamid {
  @scala.inline
  def apply(page: AnonType, per_page: AnonType, team_id: AnonRequired): AnonPagePerpageTeamid = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPagePerpageTeamid]
  }
}

