package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPagePerpageRef extends js.Object {
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var ref: AnonRequired
  var repo: AnonRequired
}

object AnonOwnerPagePerpageRef {
  @scala.inline
  def apply(owner: AnonRequired, page: AnonType, per_page: AnonType, ref: AnonRequired, repo: AnonRequired): AnonOwnerPagePerpageRef = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerPagePerpageRef]
  }
}

