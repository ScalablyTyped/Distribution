package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitResponse extends js.Object {
  var author: GitCreateCommitResponseAuthor
  var committer: GitCreateCommitResponseCommitter
  var message: String
  var node_id: String
  var parents: js.Array[GitCreateCommitResponseParentsItem]
  var sha: String
  var tree: GitCreateCommitResponseTree
  var url: String
  var verification: GitCreateCommitResponseVerification
}

object GitCreateCommitResponse {
  @scala.inline
  def apply(
    author: GitCreateCommitResponseAuthor,
    committer: GitCreateCommitResponseCommitter,
    message: String,
    node_id: String,
    parents: js.Array[GitCreateCommitResponseParentsItem],
    sha: String,
    tree: GitCreateCommitResponseTree,
    url: String,
    verification: GitCreateCommitResponseVerification
  ): GitCreateCommitResponse = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[GitCreateCommitResponse]
  }
}

