package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjectidUsername extends js.Object {
  var project_id: AnonRequired
  var username: AnonRequired
}

object AnonProjectidUsername {
  @scala.inline
  def apply(project_id: AnonRequired, username: AnonRequired): AnonProjectidUsername = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProjectidUsername]
  }
}

