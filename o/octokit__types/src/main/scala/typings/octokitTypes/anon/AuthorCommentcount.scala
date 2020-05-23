package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorCommentcount extends js.Object {
  var author: DateEmailName
  var comment_count: Double
  var committer: DateEmailName
  var message: String
  var tree: ShaUrl
  var url: String
}

object AuthorCommentcount {
  @scala.inline
  def apply(
    author: DateEmailName,
    comment_count: Double,
    committer: DateEmailName,
    message: String,
    tree: ShaUrl,
    url: String
  ): AuthorCommentcount = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorCommentcount]
  }
}

