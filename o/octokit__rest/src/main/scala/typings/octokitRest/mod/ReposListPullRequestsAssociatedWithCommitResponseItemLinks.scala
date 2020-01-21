package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListPullRequestsAssociatedWithCommitResponseItemLinks extends js.Object {
  var comments: ReposListPullRequestsAssociatedWithCommitResponseItemLinksComments
  var commits: ReposListPullRequestsAssociatedWithCommitResponseItemLinksCommits
  var html: ReposListPullRequestsAssociatedWithCommitResponseItemLinksHtml
  var issue: ReposListPullRequestsAssociatedWithCommitResponseItemLinksIssue
  var review_comment: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComment
  var review_comments: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComments
  var self: ReposListPullRequestsAssociatedWithCommitResponseItemLinksSelf
  var statuses: ReposListPullRequestsAssociatedWithCommitResponseItemLinksStatuses
}

object ReposListPullRequestsAssociatedWithCommitResponseItemLinks {
  @scala.inline
  def apply(
    comments: ReposListPullRequestsAssociatedWithCommitResponseItemLinksComments,
    commits: ReposListPullRequestsAssociatedWithCommitResponseItemLinksCommits,
    html: ReposListPullRequestsAssociatedWithCommitResponseItemLinksHtml,
    issue: ReposListPullRequestsAssociatedWithCommitResponseItemLinksIssue,
    review_comment: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComment,
    review_comments: ReposListPullRequestsAssociatedWithCommitResponseItemLinksReviewComments,
    self: ReposListPullRequestsAssociatedWithCommitResponseItemLinksSelf,
    statuses: ReposListPullRequestsAssociatedWithCommitResponseItemLinksStatuses
  ): ReposListPullRequestsAssociatedWithCommitResponseItemLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemLinks]
  }
}

