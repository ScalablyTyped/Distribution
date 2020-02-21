package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectionOwner extends js.Object {
  var direction: AnonEnum
  var owner: AnonRequired
  var repo: AnonRequired
  var since: AnonType
  var sort: AnonEnum
}

object AnonDirectionOwner {
  @scala.inline
  def apply(direction: AnonEnum, owner: AnonRequired, repo: AnonRequired, since: AnonType, sort: AnonEnum): AnonDirectionOwner = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirectionOwner]
  }
}

