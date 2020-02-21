package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentidOwner extends js.Object {
  var comment_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonCommentidOwner {
  @scala.inline
  def apply(comment_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonCommentidOwner = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommentidOwner]
  }
}

