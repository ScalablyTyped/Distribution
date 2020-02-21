package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentidContent extends js.Object {
  var comment_id: AnonRequired
  var content: AnonEnumRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonCommentidContent {
  @scala.inline
  def apply(comment_id: AnonRequired, content: AnonEnumRequired, owner: AnonRequired, repo: AnonRequired): AnonCommentidContent = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommentidContent]
  }
}

