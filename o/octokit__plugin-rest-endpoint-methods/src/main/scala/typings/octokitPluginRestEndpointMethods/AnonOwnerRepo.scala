package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepo extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonOwnerRepo {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired): AnonOwnerRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRepo]
  }
}

