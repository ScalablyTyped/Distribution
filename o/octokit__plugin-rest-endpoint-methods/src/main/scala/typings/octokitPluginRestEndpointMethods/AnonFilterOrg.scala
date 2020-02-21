package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterOrg extends js.Object {
  var filter: AnonEnum
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
}

object AnonFilterOrg {
  @scala.inline
  def apply(filter: AnonEnum, org: AnonRequired, page: AnonType, per_page: AnonType): AnonFilterOrg = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilterOrg]
  }
}

