package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Committer extends js.Object {
  var author: EmailName
  var committer: EmailName
  var id: String
  var message: String
  var timestamp: String
  var tree_id: String
}

object Committer {
  @scala.inline
  def apply(
    author: EmailName,
    committer: EmailName,
    id: String,
    message: String,
    timestamp: String,
    tree_id: String
  ): Committer = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Committer]
  }
}

