package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.LEFT
import typings.octokitTypes.octokitTypesStrings.RIGHT
import typings.octokitTypes.octokitTypesStrings.side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateReviewCommentEndpoint extends js.Object {
  /**
    * The text of the review comment.
    */
  var body: String = js.native
  /**
    * The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`.
    */
  var commit_id: String = js.native
  /**
    * **Required with `comfort-fade` preview**. The line of the blob in the pull request diff that the comment applies to. For a multi-line comment, the last line of the range that your comment applies to.
    */
  var line: js.UndefOr[Double] = js.native
  var owner: String = js.native
  /**
    * The relative path to the file that necessitates a comment.
    */
  var path: String = js.native
  /**
    * **Required without `comfort-fade` preview**. The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note above.
    */
  var position: js.UndefOr[Double] = js.native
  var pull_number: Double = js.native
  var repo: String = js.native
  /**
    * **Required with `comfort-fade` preview**. In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the comment range is a deletion or addition. For more information, see "[Diff view options](https://docs.github.com/en/articles/about-comparing-branches-in-pull-requests#diff-view-options)".
    */
  var side: js.UndefOr[LEFT | RIGHT] = js.native
  /**
    * **Required when using multi-line comments**. To create multi-line comments, you must use the `comfort-fade` preview header. The `start_line` is the first line in the pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see "[Commenting on a pull request](https://docs.github.com/en/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)".
    */
  var start_line: js.UndefOr[Double] = js.native
  /**
    * **Required when using multi-line comments**. To create multi-line comments, you must use the `comfort-fade` preview header. The `start_side` is the starting side of the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see "[Commenting on a pull request](https://docs.github.com/en/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)". See `side` in this table for additional context.
    */
  var start_side: js.UndefOr[LEFT | RIGHT | side] = js.native
}

object PullsCreateReviewCommentEndpoint {
  @scala.inline
  def apply(body: String, commit_id: String, owner: String, path: String, pull_number: Double, repo: String): PullsCreateReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewCommentEndpoint]
  }
  @scala.inline
  implicit class PullsCreateReviewCommentEndpointOps[Self <: PullsCreateReviewCommentEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit_id(value: String): Self = this.set("commit_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPull_number(value: Double): Self = this.set("pull_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSide(value: LEFT | RIGHT): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setStart_line(value: Double): Self = this.set("start_line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_line: Self = this.set("start_line", js.undefined)
    @scala.inline
    def setStart_side(value: LEFT | RIGHT | side): Self = this.set("start_side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_side: Self = this.set("start_side", js.undefined)
  }
  
}

