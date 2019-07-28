package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetResponseLinks extends js.Object {
  var comments: PullsGetResponseLinksComments
  var commits: PullsGetResponseLinksCommits
  var html: PullsGetResponseLinksHtml
  var issue: PullsGetResponseLinksIssue
  var review_comment: PullsGetResponseLinksReviewComment
  var review_comments: PullsGetResponseLinksReviewComments
  var self: PullsGetResponseLinksSelf
  var statuses: PullsGetResponseLinksStatuses
}

object PullsGetResponseLinks {
  @scala.inline
  def apply(
    comments: PullsGetResponseLinksComments,
    commits: PullsGetResponseLinksCommits,
    html: PullsGetResponseLinksHtml,
    issue: PullsGetResponseLinksIssue,
    review_comment: PullsGetResponseLinksReviewComment,
    review_comments: PullsGetResponseLinksReviewComments,
    self: PullsGetResponseLinksSelf,
    statuses: PullsGetResponseLinksStatuses
  ): PullsGetResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments, commits = commits, html = html, issue = issue, review_comment = review_comment, review_comments = review_comments, self = self, statuses = statuses)
  
    __obj.asInstanceOf[PullsGetResponseLinks]
  }
}

