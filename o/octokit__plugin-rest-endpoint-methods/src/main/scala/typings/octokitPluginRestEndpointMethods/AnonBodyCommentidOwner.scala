package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCommentidOwner extends js.Object {
  var body: AnonRequired
  var comment_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonBodyCommentidOwner {
  @scala.inline
  def apply(body: AnonRequired, comment_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonBodyCommentidOwner = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyCommentidOwner]
  }
}

