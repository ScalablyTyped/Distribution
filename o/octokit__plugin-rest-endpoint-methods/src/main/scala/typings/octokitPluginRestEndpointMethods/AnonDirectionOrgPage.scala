package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionOrgPage extends js.Object {
  var direction: AnonEnum
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var team_slug: AnonRequired
}

object AnonDirectionOrgPage {
  @scala.inline
  def apply(
    direction: AnonEnum,
    org: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    team_slug: AnonRequired
  ): AnonDirectionOrgPage = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionOrgPage]
  }
}

