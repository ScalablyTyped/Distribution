package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commentcount extends js.Object {
  var author: DateEmail
  var comment_count: Double
  var committer: DateEmail
  var message: String
  var tree: ShaUrl
  var url: String
  var verification: Payload
}

object Commentcount {
  @scala.inline
  def apply(
    author: DateEmail,
    comment_count: Double,
    committer: DateEmail,
    message: String,
    tree: ShaUrl,
    url: String,
    verification: Payload
  ): Commentcount = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentcount]
  }
}

