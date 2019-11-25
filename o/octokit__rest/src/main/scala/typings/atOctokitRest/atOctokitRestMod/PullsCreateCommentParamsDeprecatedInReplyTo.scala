package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.LEFT
import typings.atOctokitRest.atOctokitRestStrings.RIGHT
import typings.atOctokitRest.atOctokitRestStrings.side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentParamsDeprecatedInReplyTo extends js.Object {
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
  /**
    * **Required with `comfort-fade` preview**. The line of the blob in the pull request diff that the comment applies to. For a multi-line comment, the last line of the range that your comment applies to.
    */
  var line: js.UndefOr[Double] = js.undefined
  var owner: String
  /**
    * The relative path to the file that necessitates a comment.
    */
  var path: String
  /**
    * **Required without `comfort-fade` preview**. The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note above.
    */
  var position: js.UndefOr[Double] = js.undefined
  var pull_number: Double
  var repo: String
  /**
    * **Required with `comfort-fade` preview**. In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the comment range is a deletion or addition. For more information, see "[Diff view options](https://help.github.com/en/articles/about-comparing-branches-in-pull-requests#diff-view-options)" in the GitHub Help documentation.
    */
  var side: js.UndefOr[LEFT | RIGHT] = js.undefined
  /**
    * **Required when using multi-line comments**. To create multi-line comments, you must use the `comfort-fade` preview header. The `start_line` is the first line in the pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see "[Commenting on a pull request](https://help.github.com/en/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)" in the GitHub Help documentation.
    */
  var start_line: js.UndefOr[Double] = js.undefined
  /**
    * **Required when using multi-line comments**. To create multi-line comments, you must use the `comfort-fade` preview header. The `start_side` is the starting side of the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see "[Commenting on a pull request](https://help.github.com/en/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)" in the GitHub Help documentation. See `side` in this table for additional context.
    */
  var start_side: js.UndefOr[LEFT | RIGHT | side] = js.undefined
}

object PullsCreateCommentParamsDeprecatedInReplyTo {
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    owner: String,
    path: String,
    pull_number: Double,
    repo: String,
    in_reply_to: Int | Double = null,
    line: Int | Double = null,
    position: Int | Double = null,
    side: LEFT | RIGHT = null,
    start_line: Int | Double = null,
    start_side: LEFT | RIGHT | side = null
  ): PullsCreateCommentParamsDeprecatedInReplyTo = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (in_reply_to != null) __obj.updateDynamic("in_reply_to")(in_reply_to.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (start_line != null) __obj.updateDynamic("start_line")(start_line.asInstanceOf[js.Any])
    if (start_side != null) __obj.updateDynamic("start_side")(start_side.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentParamsDeprecatedInReplyTo]
  }
}

