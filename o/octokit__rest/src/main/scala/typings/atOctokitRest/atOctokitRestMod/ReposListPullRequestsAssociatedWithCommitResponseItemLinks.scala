package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(comments = comments, commits = commits, html = html, issue = issue, review_comment = review_comment, review_comments = review_comments, self = self, statuses = statuses)
  
    __obj.asInstanceOf[ReposListPullRequestsAssociatedWithCommitResponseItemLinks]
  }
}

