package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepoTag extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var tag: AnonRequired
}

object AnonOwnerRepoTag {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, tag: AnonRequired): AnonOwnerRepoTag = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRepoTag]
  }
}

