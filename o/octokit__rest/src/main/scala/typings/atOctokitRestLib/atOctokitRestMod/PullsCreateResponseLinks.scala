package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponseLinks extends js.Object {
  var comments: PullsCreateResponseLinksComments
  var commits: PullsCreateResponseLinksCommits
  var html: PullsCreateResponseLinksHtml
  var issue: PullsCreateResponseLinksIssue
  var review_comment: PullsCreateResponseLinksReviewComment
  var review_comments: PullsCreateResponseLinksReviewComments
  var self: PullsCreateResponseLinksSelf
  var statuses: PullsCreateResponseLinksStatuses
}

object PullsCreateResponseLinks {
  @scala.inline
  def apply(
    comments: PullsCreateResponseLinksComments,
    commits: PullsCreateResponseLinksCommits,
    html: PullsCreateResponseLinksHtml,
    issue: PullsCreateResponseLinksIssue,
    review_comment: PullsCreateResponseLinksReviewComment,
    review_comments: PullsCreateResponseLinksReviewComments,
    self: PullsCreateResponseLinksSelf,
    statuses: PullsCreateResponseLinksStatuses
  ): PullsCreateResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments, commits = commits, html = html, issue = issue, review_comment = review_comment, review_comments = review_comments, self = self, statuses = statuses)
  
    __obj.asInstanceOf[PullsCreateResponseLinks]
  }
}

