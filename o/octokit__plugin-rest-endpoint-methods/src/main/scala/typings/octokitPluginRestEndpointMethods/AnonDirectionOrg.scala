package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionOrg extends js.Object {
  var direction: AnonEnum
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var sort: AnonEnum
  var `type`: AnonEnum
}

object AnonDirectionOrg {
  @scala.inline
  def apply(
    direction: AnonEnum,
    org: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    sort: AnonEnum,
    `type`: AnonEnum
  ): AnonDirectionOrg = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirectionOrg]
  }
}

