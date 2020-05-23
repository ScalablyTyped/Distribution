package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.DateEmailName
import typings.octokitTypes.anon.Payload
import typings.octokitTypes.anon.ShaUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetCommitResponseData extends js.Object {
  var author: DateEmailName
  var committer: DateEmailName
  var message: String
  var parents: js.Array[ShaUrl]
  var sha: String
  var tree: ShaUrl
  var url: String
  var verification: Payload
}

object GitGetCommitResponseData {
  @scala.inline
  def apply(
    author: DateEmailName,
    committer: DateEmailName,
    message: String,
    parents: js.Array[ShaUrl],
    sha: String,
    tree: ShaUrl,
    url: String,
    verification: Payload
  ): GitGetCommitResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetCommitResponseData]
  }
}

