package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commits extends js.Object {
  
  var comments: HrefString = js.native
  
  var commits: HrefString = js.native
  
  var html: HrefString = js.native
  
  var issue: HrefString = js.native
  
  var review_comment: HrefString = js.native
  
  var review_comments: HrefString = js.native
  
  var self: HrefString = js.native
  
  var statuses: HrefString = js.native
}
object Commits {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CommitsOps[Self <: Commits] (val x: Self) extends AnyVal {
    
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
    def setComments(value: HrefString): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits(value: HrefString): Self = this.set("commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: HrefString): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue(value: HrefString): Self = this.set("issue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_comment(value: HrefString): Self = this.set("review_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_comments(value: HrefString): Self = this.set("review_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: HrefString): Self = this.set("self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuses(value: HrefString): Self = this.set("statuses", value.asInstanceOf[js.Any])
  }
}
