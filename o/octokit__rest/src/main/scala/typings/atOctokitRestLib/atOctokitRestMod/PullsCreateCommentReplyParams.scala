package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentReplyParams extends js.Object {
  /**
    * The text of the comment.
    */
  var body: java.lang.String
  /**
    * The comment ID to reply to. **Note**: This must be the ID of a _top-level comment_, not a reply to that comment. Replies to replies are not supported.
    */
  var in_reply_to: scala.Double
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object PullsCreateCommentReplyParams {
  @scala.inline
  def apply(
    body: java.lang.String,
    in_reply_to: scala.Double,
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String
  ): PullsCreateCommentReplyParams = {
    val __obj = js.Dynamic.literal(body = body, in_reply_to = in_reply_to, number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[PullsCreateCommentReplyParams]
  }
}

