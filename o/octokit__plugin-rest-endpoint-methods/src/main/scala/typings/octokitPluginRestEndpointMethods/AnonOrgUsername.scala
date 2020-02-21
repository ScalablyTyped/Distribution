package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrgUsername extends js.Object {
  var org: AnonRequired
  var username: AnonRequired
}

object AnonOrgUsername {
  @scala.inline
  def apply(org: AnonRequired, username: AnonRequired): AnonOrgUsername = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrgUsername]
  }
}

