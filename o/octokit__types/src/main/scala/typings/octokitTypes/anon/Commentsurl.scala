package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commentsurl extends js.Object {
  var author: Eventsurl
  var comments_url: String
  var commit: Commentcount
  var committer: Eventsurl
  var html_url: String
  var node_id: String
  var parents: js.Array[ShaUrl]
  var sha: String
  var url: String
}

object Commentsurl {
  @scala.inline
  def apply(
    author: Eventsurl,
    comments_url: String,
    commit: Commentcount,
    committer: Eventsurl,
    html_url: String,
    node_id: String,
    parents: js.Array[ShaUrl],
    sha: String,
    url: String
  ): Commentsurl = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentsurl]
  }
}

