package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentReplyParamsDeprecatedInReplyTo extends js.Object {
  /**
    * The text of the review comment.
    */
  var body: String
  /**
    * The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`.
    */
  var commit_id: String
  /**
    * The comment ID to reply to. **Note**: This must be the ID of a top-level comment, not a reply to that comment. Replies to replies are not supported.
    * @deprecated "in_reply_to" parameter has been deprecated and will be removed in future
    */
  var in_reply_to: js.UndefOr[Double] = js.undefined
  var owner: String
  /**
    * The relative path to the file that necessitates a comment.
    */
  var path: String
  /**
    * The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note below.
    */
  var position: Double
  var pull_number: Double
  var repo: String
}

object PullsCreateCommentReplyParamsDeprecatedInReplyTo {
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    owner: String,
    path: String,
    position: Double,
    pull_number: Double,
    repo: String,
    in_reply_to: Int | Double = null
  ): PullsCreateCommentReplyParamsDeprecatedInReplyTo = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, owner = owner, path = path, position = position, pull_number = pull_number, repo = repo)
    if (in_reply_to != null) __obj.updateDynamic("in_reply_to")(in_reply_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentReplyParamsDeprecatedInReplyTo]
  }
}

