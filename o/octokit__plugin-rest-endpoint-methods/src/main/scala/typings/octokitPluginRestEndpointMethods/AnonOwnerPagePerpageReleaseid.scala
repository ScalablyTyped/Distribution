package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPagePerpageReleaseid extends js.Object {
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var release_id: AnonRequired
  var repo: AnonRequired
}

object AnonOwnerPagePerpageReleaseid {
  @scala.inline
  def apply(
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    release_id: AnonRequired,
    repo: AnonRequired
  ): AnonOwnerPagePerpageReleaseid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerPagePerpageReleaseid]
  }
}

