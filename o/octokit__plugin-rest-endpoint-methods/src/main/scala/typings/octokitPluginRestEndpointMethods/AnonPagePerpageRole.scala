package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPagePerpageRole extends js.Object {
  var page: AnonType
  var per_page: AnonType
  var role: AnonEnum
  var team_id: AnonRequired
}

object AnonPagePerpageRole {
  @scala.inline
  def apply(page: AnonType, per_page: AnonType, role: AnonEnum, team_id: AnonRequired): AnonPagePerpageRole = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPagePerpageRole]
  }
}

