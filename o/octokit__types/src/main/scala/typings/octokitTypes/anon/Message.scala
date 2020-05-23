package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var author: Date
  var committer: Date
  var message: String
  var tree: Sha
  var url: String
  var verification: Payload
}

object Message {
  @scala.inline
  def apply(author: Date, committer: Date, message: String, tree: Sha, url: String, verification: Payload): Message = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

