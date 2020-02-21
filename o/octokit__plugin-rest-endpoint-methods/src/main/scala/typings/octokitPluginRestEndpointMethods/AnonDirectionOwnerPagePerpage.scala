package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionOwnerPagePerpage extends js.Object {
  var direction: AnonEnum
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var since: AnonType
  var sort: AnonEnum
}

object AnonDirectionOwnerPagePerpage {
  @scala.inline
  def apply(
    direction: AnonEnum,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired,
    since: AnonType,
    sort: AnonEnum
  ): AnonDirectionOwnerPagePerpage = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionOwnerPagePerpage]
  }
}

