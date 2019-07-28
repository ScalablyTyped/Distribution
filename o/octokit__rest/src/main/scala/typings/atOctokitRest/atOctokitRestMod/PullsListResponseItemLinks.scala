package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(comments = comments, commits = commits, html = html, issue = issue, review_comment = review_comment, review_comments = review_comments, self = self, statuses = statuses)
  
    __obj.asInstanceOf[PullsListResponseItemLinks]
  }
}

