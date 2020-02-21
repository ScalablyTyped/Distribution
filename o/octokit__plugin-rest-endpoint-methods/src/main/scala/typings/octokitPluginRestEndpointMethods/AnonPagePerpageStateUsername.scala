package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPagePerpageStateUsername extends js.Object {
  var page: AnonType
  var per_page: AnonType
  var state: AnonEnum
  var username: AnonRequired
}

object AnonPagePerpageStateUsername {
  @scala.inline
  def apply(page: AnonType, per_page: AnonType, state: AnonEnum, username: AnonRequired): AnonPagePerpageStateUsername = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPagePerpageStateUsername]
  }
}

