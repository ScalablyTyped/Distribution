package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepoTagsha extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var tag_sha: AnonRequired
}

object AnonOwnerRepoTagsha {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, tag_sha: AnonRequired): AnonOwnerRepoTagsha = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_sha = tag_sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRepoTagsha]
  }
}

