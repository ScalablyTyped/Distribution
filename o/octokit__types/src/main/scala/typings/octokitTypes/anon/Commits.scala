package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commits extends js.Object {
  var comments: HrefString
  var commits: HrefString
  var html: HrefString
  var issue: HrefString
  var review_comment: HrefString
  var review_comments: HrefString
  var self: HrefString
  var statuses: HrefString
}

object Commits {
  @scala.inline
  def apply(
    comments: HrefString,
    commits: HrefString,
    html: HrefString,
    issue: HrefString,
    review_comment: HrefString,
    review_comments: HrefString,
    self: HrefString,
    statuses: HrefString
  ): Commits = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], review_comment = review_comment.asInstanceOf[js.Any], review_comments = review_comments.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commits]
  }
}

