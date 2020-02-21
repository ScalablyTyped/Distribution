package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgPagePerpageTeamslug extends js.Object {
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var team_slug: AnonRequired
}

object AnonOrgPagePerpageTeamslug {
  @scala.inline
  def apply(org: AnonRequired, page: AnonType, per_page: AnonType, team_slug: AnonRequired): AnonOrgPagePerpageTeamslug = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgPagePerpageTeamslug]
  }
}

