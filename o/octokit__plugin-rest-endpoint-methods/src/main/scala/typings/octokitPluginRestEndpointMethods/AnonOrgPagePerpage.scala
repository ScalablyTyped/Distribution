package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgPagePerpage extends js.Object {
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var state: AnonEnum
}

object AnonOrgPagePerpage {
  @scala.inline
  def apply(org: AnonRequired, page: AnonType, per_page: AnonType, state: AnonEnum): AnonOrgPagePerpage = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgPagePerpage]
  }
}

