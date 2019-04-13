package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitResponse extends js.Object {
  var author: GitCreateCommitResponseAuthor
  var committer: GitCreateCommitResponseCommitter
  var message: java.lang.String
  var node_id: java.lang.String
  var parents: js.Array[GitCreateCommitResponseParentsItem]
  var sha: java.lang.String
  var tree: GitCreateCommitResponseTree
  var url: java.lang.String
  var verification: GitCreateCommitResponseVerification
}

object GitCreateCommitResponse {
  @scala.inline
  def apply(
    author: GitCreateCommitResponseAuthor,
    committer: GitCreateCommitResponseCommitter,
    message: java.lang.String,
    node_id: java.lang.String,
    parents: js.Array[GitCreateCommitResponseParentsItem],
    sha: java.lang.String,
    tree: GitCreateCommitResponseTree,
    url: java.lang.String,
    verification: GitCreateCommitResponseVerification
  ): GitCreateCommitResponse = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[GitCreateCommitResponse]
  }
}

