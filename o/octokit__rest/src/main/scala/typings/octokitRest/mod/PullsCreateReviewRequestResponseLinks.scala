package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewRequestResponseLinks extends js.Object {
  var comments: PullsCreateReviewRequestResponseLinksComments
  var commits: PullsCreateReviewRequestResponseLinksCommits
  var html: PullsCreateReviewRequestResponseLinksHtml
  var issue: PullsCreateReviewRequestResponseLinksIssue
  var review_comment: PullsCreateReviewRequestResponseLinksReviewComment
  var review_comments: PullsCreateReviewRequestResponseLinksReviewComments
  var self: PullsCreateReviewRequestResponseLinksSelf
  var statuses: PullsCreateReviewRequestResponseLinksStatuses
}

object PullsCreateReviewRequestResponseLinks {
  @scala.inline
  def apply(
    comments: PullsCreateReviewRequestResponseLinksComments,
    commits: PullsCreateReviewRequestResponseLinksCommits,
    html: PullsCreateReviewRequestResponseLinksHtml,
    issue: PullsCreateReviewRequestResponseLinksIssue,
    review_comment: PullsCreateReviewRequestResponseLinksReviewComment,
    review_comments: PullsCreateReviewRequestResponseLinksReviewComments,
    self: PullsCreateReviewRequestResponseLinksSelf,
    statuses: PullsCreateReviewRequestResponseLinksStatuses
  ): PullsCreateReviewRequestResponseLinks = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateReviewRequestResponseLinks]
  }
}

