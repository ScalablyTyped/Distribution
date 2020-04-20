package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetResponseLinks]
  }
}

