package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPagePerpageProtected extends js.Object {
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var `protected`: AnonType
  var repo: AnonRequired
}

object AnonOwnerPagePerpageProtected {
  @scala.inline
  def apply(owner: AnonRequired, page: AnonType, per_page: AnonType, `protected`: AnonType, repo: AnonRequired): AnonOwnerPagePerpageProtected = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOwnerPagePerpageProtected]
  }
}

