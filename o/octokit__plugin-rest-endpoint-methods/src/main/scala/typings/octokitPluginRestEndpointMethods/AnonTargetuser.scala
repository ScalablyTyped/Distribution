package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetuser extends js.Object {
  var target_user: AnonRequired
  var username: AnonRequired
}

object AnonTargetuser {
  @scala.inline
  def apply(target_user: AnonRequired, username: AnonRequired): AnonTargetuser = {
    val __obj = js.Dynamic.literal(target_user = target_user.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTargetuser]
  }
}

