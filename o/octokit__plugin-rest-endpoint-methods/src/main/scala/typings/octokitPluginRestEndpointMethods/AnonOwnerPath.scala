package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPath extends js.Object {
  var owner: AnonRequired
  var path: AnonRequired
  var ref: AnonType
  var repo: AnonRequired
}

object AnonOwnerPath {
  @scala.inline
  def apply(owner: AnonRequired, path: AnonRequired, ref: AnonType, repo: AnonRequired): AnonOwnerPath = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerPath]
  }
}

