package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRef extends js.Object {
  var owner: AnonRequired
  var ref: AnonRequired
  var repo: AnonRequired
  var sha: AnonRequired
}

object AnonOwnerRef {
  @scala.inline
  def apply(owner: AnonRequired, ref: AnonRequired, repo: AnonRequired, sha: AnonRequired): AnonOwnerRef = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRef]
  }
}

