package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsUpdateResponseLinks]
  }
}

