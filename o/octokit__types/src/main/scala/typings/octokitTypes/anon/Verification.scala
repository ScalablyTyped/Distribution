package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verification extends js.Object {
  var author: Date
  var comment_count: Double
  var committer: Date
  var message: String
  var tree: Sha
  var url: String
  var verification: Payload
}

object Verification {
  @scala.inline
  def apply(
    author: Date,
    comment_count: Double,
    committer: Date,
    message: String,
    tree: Sha,
    url: String,
    verification: Payload
  ): Verification = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verification]
  }
}

