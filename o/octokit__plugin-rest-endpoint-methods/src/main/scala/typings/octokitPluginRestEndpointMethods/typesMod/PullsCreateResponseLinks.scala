package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateResponseLinks]
  }
}

