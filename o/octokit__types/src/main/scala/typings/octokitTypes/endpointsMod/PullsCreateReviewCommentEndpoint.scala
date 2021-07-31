package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.LEFT
import typings.octokitTypes.octokitTypesStrings.RIGHT
import typings.octokitTypes.octokitTypesStrings.side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsCreateReviewCommentEndpoint extends StObject {
  
  /**
    * The text of the review comment.
    */
  var body: String
  
  /**
    * The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`.
    */
  var commit_id: String
  
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
    * **Required with `comfort-fade` preview**. In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the comment range is a deletion or addition. For more information, see "[Diff view options](https://docs.github.com/en/articles/about-comparing-branches-in-pull-requests#diff-view-options)".
    */
  var side: js.UndefOr[LEFT | RIGHT] = js.undefined
  
  /**
    * **Required when using multi-line comments**. To create multi-line comments, you must use the `comfort-fade` preview header. The `start_line` is the first line in the pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see "[Commenting on a pull request](https://docs.github.com/en/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)".
    */
  var start_line: js.UndefOr[Double] = js.undefined
  
  /**
    * **Required when using multi-line comments**. To create multi-line comments, you must use the `comfort-fade` preview header. The `start_side` is the starting side of the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see "[Commenting on a pull request](https://docs.github.com/en/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)". See `side` in this table for additional context.
    */
  var start_side: js.UndefOr[LEFT | RIGHT | side] = js.undefined
}
object PullsCreateReviewCommentEndpoint {
  
  @scala.inline
  def apply(body: String, commit_id: String, owner: String, path: String, pull_number: Double, repo: String): PullsCreateReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateReviewCommentEndpoint]
  }
  
  @scala.inline
  implicit class PullsCreateReviewCommentEndpointMutableBuilder[Self <: PullsCreateReviewCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSide(value: LEFT | RIGHT): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    @scala.inline
    def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_lineUndefined: Self = StObject.set(x, "start_line", js.undefined)
    
    @scala.inline
    def setStart_side(value: LEFT | RIGHT | side): Self = StObject.set(x, "start_side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_sideUndefined: Self = StObject.set(x, "start_side", js.undefined)
  }
}
