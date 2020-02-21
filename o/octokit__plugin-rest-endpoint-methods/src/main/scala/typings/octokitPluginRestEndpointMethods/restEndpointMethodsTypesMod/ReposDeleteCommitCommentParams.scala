package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteCommitCommentParams extends js.Object {
  var comment_id: Double
  var owner: String
  var repo: String
}

object ReposDeleteCommitCommentParams {
  @scala.inline
  def apply(comment_id: Double, owner: String, repo: String): ReposDeleteCommitCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposDeleteCommitCommentParams]
  }
}

