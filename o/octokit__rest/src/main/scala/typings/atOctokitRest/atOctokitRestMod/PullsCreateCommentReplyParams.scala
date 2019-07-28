package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentReplyParams extends js.Object {
  /**
    * The text of the comment.
    */
  var body: String
  /**
    * The comment ID to reply to. **Note**: This must be the ID of a _top-level comment_, not a reply to that comment. Replies to replies are not supported.
    */
  var in_reply_to: Double
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsCreateCommentReplyParams {
  @scala.inline
  def apply(body: String, in_reply_to: Double, owner: String, pull_number: Double, repo: String): PullsCreateCommentReplyParams = {
    val __obj = js.Dynamic.literal(body = body, in_reply_to = in_reply_to, owner = owner, pull_number = pull_number, repo = repo)
  
    __obj.asInstanceOf[PullsCreateCommentReplyParams]
  }
}

