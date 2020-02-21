package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPagePerpageSinceUsername extends js.Object {
  var page: AnonType
  var per_page: AnonType
  var since: AnonType
  var username: AnonRequired
}

object AnonPagePerpageSinceUsername {
  @scala.inline
  def apply(page: AnonType, per_page: AnonType, since: AnonType, username: AnonRequired): AnonPagePerpageSinceUsername = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPagePerpageSinceUsername]
  }
}

