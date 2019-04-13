package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateResponseLinks extends js.Object {
  var comments: PullsUpdateResponseLinksComments
  var commits: PullsUpdateResponseLinksCommits
  var html: PullsUpdateResponseLinksHtml
  var issue: PullsUpdateResponseLinksIssue
  var review_comment: PullsUpdateResponseLinksReviewComment
  var review_comments: PullsUpdateResponseLinksReviewComments
  var self: PullsUpdateResponseLinksSelf
  var statuses: PullsUpdateResponseLinksStatuses
}

object PullsUpdateResponseLinks {
  @scala.inline
  def apply(
    comments: PullsUpdateResponseLinksComments,
    commits: PullsUpdateResponseLinksCommits,
    html: PullsUpdateResponseLinksHtml,
    issue: PullsUpdateResponseLinksIssue,
    review_comment: PullsUpdateResponseLinksReviewComment,
    review_comments: PullsUpdateResponseLinksReviewComments,
    self: PullsUpdateResponseLinksSelf,
    statuses: PullsUpdateResponseLinksStatuses
  ): PullsUpdateResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments, commits = commits, html = html, issue = issue, review_comment = review_comment, review_comments = review_comments, self = self, statuses = statuses)
  
    __obj.asInstanceOf[PullsUpdateResponseLinks]
  }
}

