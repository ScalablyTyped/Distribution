package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueResponseLinks extends js.Object {
  var comments: PullsCreateFromIssueResponseLinksComments
  var commits: PullsCreateFromIssueResponseLinksCommits
  var html: PullsCreateFromIssueResponseLinksHtml
  var issue: PullsCreateFromIssueResponseLinksIssue
  var review_comment: PullsCreateFromIssueResponseLinksReviewComment
  var review_comments: PullsCreateFromIssueResponseLinksReviewComments
  var self: PullsCreateFromIssueResponseLinksSelf
  var statuses: PullsCreateFromIssueResponseLinksStatuses
}

object PullsCreateFromIssueResponseLinks {
  @scala.inline
  def apply(
    comments: PullsCreateFromIssueResponseLinksComments,
    commits: PullsCreateFromIssueResponseLinksCommits,
    html: PullsCreateFromIssueResponseLinksHtml,
    issue: PullsCreateFromIssueResponseLinksIssue,
    review_comment: PullsCreateFromIssueResponseLinksReviewComment,
    review_comments: PullsCreateFromIssueResponseLinksReviewComments,
    self: PullsCreateFromIssueResponseLinksSelf,
    statuses: PullsCreateFromIssueResponseLinksStatuses
  ): PullsCreateFromIssueResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateFromIssueResponseLinks]
  }
}

