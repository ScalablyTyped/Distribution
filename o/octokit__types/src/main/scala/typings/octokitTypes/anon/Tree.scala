package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tree extends js.Object {
  var author: DateEmailName
  var committer: DateEmailName
  var html_url: String
  var message: String
  var node_id: String
  var parents: js.Array[HtmlurlSha]
  var sha: String
  var tree: ShaUrl
  var url: String
  var verification: Payload
}

object Tree {
  @scala.inline
  def apply(
    author: DateEmailName,
    committer: DateEmailName,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[HtmlurlSha],
    sha: String,
    tree: ShaUrl,
    url: String,
    verification: Payload
  ): Tree = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
}

