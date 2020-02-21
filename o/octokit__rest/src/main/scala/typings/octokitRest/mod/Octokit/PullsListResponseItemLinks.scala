package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListResponseItemLinks extends js.Object {
  var comments: PullsListResponseItemLinksComments
  var commits: PullsListResponseItemLinksCommits
  var html: PullsListResponseItemLinksHtml
  var issue: PullsListResponseItemLinksIssue
  var review_comment: PullsListResponseItemLinksReviewComment
  var review_comments: PullsListResponseItemLinksReviewComments
  var self: PullsListResponseItemLinksSelf
  var statuses: PullsListResponseItemLinksStatuses
}

object PullsListResponseItemLinks {
  @scala.inline
  def apply(
    comments: PullsListResponseItemLinksComments,
    commits: PullsListResponseItemLinksCommits,
    html: PullsListResponseItemLinksHtml,
    issue: PullsListResponseItemLinksIssue,
    review_comment: PullsListResponseItemLinksReviewComment,
    review_comments: PullsListResponseItemLinksReviewComments,
    self: PullsListResponseItemLinksSelf,
    statuses: PullsListResponseItemLinksStatuses
  ): PullsListResponseItemLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsListResponseItemLinks]
  }
}

