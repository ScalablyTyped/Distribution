package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.LEFT
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.RIGHT
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inreplyto extends StObject {
  
  /** @description The text of the review comment. */
  var body: String
  
  /** @description The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`. */
  var commit_id: String
  
  /**
    * @description The ID of the review comment to reply to. To find the ID of a review comment with ["List review comments on a pull request"](#list-review-comments-on-a-pull-request). When specified, all parameters other than `body` in the request body are ignored.
    * @example 2
    */
  var in_reply_to: js.UndefOr[Double] = js.undefined
  
  /** @description The line of the blob in the pull request diff that the comment applies to. For a multi-line comment, the last line of the range that your comment applies to. */
  var line: Double
  
  /** @description The relative path to the file that necessitates a comment. */
  var path: String
  
  /**
    * @deprecated
    * @description **This parameter is deprecated. Use `line` instead**. The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note above.
    */
  var position: js.UndefOr[Double] = js.undefined
  
  /**
    * @description In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the comment range is a deletion or addition. For more information, see "[Diff view options](https://docs.github.com/en/articles/about-comparing-branches-in-pull-requests#diff-view-options)" in the GitHub Help documentation.
    * @enum {string}
    */
  var side: js.UndefOr[LEFT | RIGHT] = js.undefined
  
  /** @description **Required when using multi-line comments unless using `in_reply_to`**. The `start_line` is the first line in the pull request diff that your multi-line comment applies to. To learn more about multi-line comments, see "[Commenting on a pull request](https://docs.github.com/en/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)" in the GitHub Help documentation. */
  var start_line: js.UndefOr[Double] = js.undefined
  
  /**
    * @description **Required when using multi-line comments unless using `in_reply_to`**. The `start_side` is the starting side of the diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see "[Commenting on a pull request](https://docs.github.com/en/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)" in the GitHub Help documentation. See `side` in this table for additional context.
    * @enum {string}
    */
  var start_side: js.UndefOr[LEFT | RIGHT | side] = js.undefined
}
object Inreplyto {
  
  inline def apply(body: String, commit_id: String, line: Double, path: String): Inreplyto = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inreplyto]
  }
  
  extension [Self <: Inreplyto](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to(value: Double): Self = StObject.set(x, "in_reply_to", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_toUndefined: Self = StObject.set(x, "in_reply_to", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSide(value: LEFT | RIGHT): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    inline def setStart_lineUndefined: Self = StObject.set(x, "start_line", js.undefined)
    
    inline def setStart_side(value: LEFT | RIGHT | side): Self = StObject.set(x, "start_side", value.asInstanceOf[js.Any])
    
    inline def setStart_sideUndefined: Self = StObject.set(x, "start_side", js.undefined)
  }
}
