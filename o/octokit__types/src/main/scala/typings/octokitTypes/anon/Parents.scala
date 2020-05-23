package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parents extends js.Object {
  var author: Gravatarid
  var commit: Message
  var committer: Gravatarid
  var node_id: String
  var parents: js.Array[Sha]
  var sha: String
  var url: String
}

object Parents {
  @scala.inline
  def apply(
    author: Gravatarid,
    commit: Message,
    committer: Gravatarid,
    node_id: String,
    parents: js.Array[Sha],
    sha: String,
    url: String
  ): Parents = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parents]
  }
}

