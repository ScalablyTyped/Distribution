package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var limit: AnonEnumRequired
  var org: AnonRequired
}

object AnonLimit {
  @scala.inline
  def apply(limit: AnonEnumRequired, org: AnonRequired): AnonLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLimit]
  }
}

