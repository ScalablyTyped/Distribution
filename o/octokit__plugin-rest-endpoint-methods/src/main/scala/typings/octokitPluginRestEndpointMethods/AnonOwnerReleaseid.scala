package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerReleaseid extends js.Object {
  var owner: AnonRequired
  var release_id: AnonRequired
  var repo: AnonRequired
}

object AnonOwnerReleaseid {
  @scala.inline
  def apply(owner: AnonRequired, release_id: AnonRequired, repo: AnonRequired): AnonOwnerReleaseid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerReleaseid]
  }
}

