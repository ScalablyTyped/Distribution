package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgPagePerpageRole extends js.Object {
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var role: AnonEnum
  var team_slug: AnonRequired
}

object AnonOrgPagePerpageRole {
  @scala.inline
  def apply(org: AnonRequired, page: AnonType, per_page: AnonType, role: AnonEnum, team_slug: AnonRequired): AnonOrgPagePerpageRole = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgPagePerpageRole]
  }
}

