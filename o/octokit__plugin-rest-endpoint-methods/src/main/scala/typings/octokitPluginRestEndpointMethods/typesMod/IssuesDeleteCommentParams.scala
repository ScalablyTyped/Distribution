package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteCommentParams extends js.Object {
  var comment_id: Double
  var owner: String
  var repo: String
}

object IssuesDeleteCommentParams {
  @scala.inline
  def apply(comment_id: Double, owner: String, repo: String): IssuesDeleteCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesDeleteCommentParams]
  }
}

