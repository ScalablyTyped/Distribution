package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadsha extends js.Object {
  var head_sha: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonHeadsha {
  @scala.inline
  def apply(head_sha: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonHeadsha = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeadsha]
  }
}

