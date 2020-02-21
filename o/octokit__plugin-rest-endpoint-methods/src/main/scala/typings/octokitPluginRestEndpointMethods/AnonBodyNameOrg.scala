package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyNameOrg extends js.Object {
  var body: AnonType
  var name: AnonRequired
  var org: AnonRequired
}

object AnonBodyNameOrg {
  @scala.inline
  def apply(body: AnonType, name: AnonRequired, org: AnonRequired): AnonBodyNameOrg = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyNameOrg]
  }
}

