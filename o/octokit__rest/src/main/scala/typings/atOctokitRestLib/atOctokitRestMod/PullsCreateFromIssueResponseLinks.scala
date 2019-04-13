package typings
package atOctokitRestLib.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(comments = comments, commits = commits, html = html, issue = issue, review_comment = review_comment, review_comments = review_comments, self = self, statuses = statuses)
  
    __obj.asInstanceOf[PullsCreateFromIssueResponseLinks]
  }
}

