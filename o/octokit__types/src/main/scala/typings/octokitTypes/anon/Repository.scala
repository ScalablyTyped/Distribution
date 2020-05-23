package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repository extends js.Object {
  var author: Eventsurl
  var comments_url: String
  var commit: AuthorCommentcount
  var committer: Eventsurl
  var html_url: String
  var parents: js.Array[HtmlurlSha]
  var repository: Branchesurl
  var score: Double
  var sha: String
  var url: String
}

object Repository {
  @scala.inline
  def apply(
    author: Eventsurl,
    comments_url: String,
    commit: AuthorCommentcount,
    committer: Eventsurl,
    html_url: String,
    parents: js.Array[HtmlurlSha],
    repository: Branchesurl,
    score: Double,
    sha: String,
    url: String
  ): Repository = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repository]
  }
}

