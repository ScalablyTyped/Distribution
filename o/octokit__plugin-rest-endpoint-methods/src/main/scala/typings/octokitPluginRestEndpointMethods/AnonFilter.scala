package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: AnonEnum
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var role: AnonEnum
}

object AnonFilter {
  @scala.inline
  def apply(filter: AnonEnum, org: AnonRequired, page: AnonType, per_page: AnonType, role: AnonEnum): AnonFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilter]
  }
}

