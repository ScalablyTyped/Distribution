package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsDeleteForIssueCommentParams extends js.Object {
  var comment_id: Double
  var owner: String
  var reaction_id: Double
  var repo: String
}

object ReactionsDeleteForIssueCommentParams {
  @scala.inline
  def apply(comment_id: Double, owner: String, reaction_id: Double, repo: String): ReactionsDeleteForIssueCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsDeleteForIssueCommentParams]
  }
}

