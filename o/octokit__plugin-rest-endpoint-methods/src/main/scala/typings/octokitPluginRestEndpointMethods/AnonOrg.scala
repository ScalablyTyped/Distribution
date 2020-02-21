package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrg extends js.Object {
  var org: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var username: AnonRequired
}

object AnonOrg {
  @scala.inline
  def apply(org: AnonRequired, page: AnonType, per_page: AnonType, username: AnonRequired): AnonOrg = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrg]
  }
}

