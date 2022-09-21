package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commits extends StObject {
  
  var comments: HrefString
  
  var commits: HrefString
  
  var html: HrefString
  
  var issue: HrefString
  
  var review_comment: HrefString
  
  var review_comments: HrefString
  
  var self: HrefString
  
  var statuses: HrefString
}
object Commits {
  
  inline def apply(
    comments: HrefString,
    commits: HrefString,
    html: HrefString,
    issue: HrefString,
    review_comment: HrefString,
    review_comments: HrefString,
    self: HrefString,
    statuses: HrefString
  ): Commits = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
  
  extension [Self <: Commits](x: Self) {
    
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
