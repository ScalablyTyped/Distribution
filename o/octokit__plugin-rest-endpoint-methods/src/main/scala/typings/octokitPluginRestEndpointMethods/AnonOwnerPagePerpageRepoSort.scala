package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPagePerpageRepoSort extends js.Object {
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var sort: AnonEnum
}

object AnonOwnerPagePerpageRepoSort {
  @scala.inline
  def apply(owner: AnonRequired, page: AnonType, per_page: AnonType, repo: AnonRequired, sort: AnonEnum): AnonOwnerPagePerpageRepoSort = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerPagePerpageRepoSort]
  }
}

