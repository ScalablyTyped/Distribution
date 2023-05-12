package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reviewcomments extends StObject {
  
  /** Link */
  var comments: HrefString
  
  /** Link */
  var commits: HrefString
  
  /** Link */
  var html: HrefString
  
  /** Link */
  var issue: HrefString
  
  /** Link */
  var review_comment: HrefString
  
  /** Link */
  var review_comments: HrefString
  
  /** Link */
  var self: HrefString
  
  /** Link */
  var statuses: HrefString
}
object Reviewcomments {
  
  inline def apply(
    comments: HrefString,
    commits: HrefString,
    html: HrefString,
    issue: HrefString,
    review_comment: HrefString,
    review_comments: HrefString,
    self: HrefString,
    statuses: HrefString
  ): Reviewcomments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reviewcomments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reviewcomments] (val x: Self) extends AnyVal {
    
    inline def setComments(value: HrefString): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: HrefString): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: HrefString): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setIssue(value: HrefString): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setReview_comment(value: HrefString): Self = StObject.set(x, "review_comment", value.asInstanceOf[js.Any])
    
    inline def setReview_comments(value: HrefString): Self = StObject.set(x, "review_comments", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: HrefString): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setStatuses(value: HrefString): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
  }
}
