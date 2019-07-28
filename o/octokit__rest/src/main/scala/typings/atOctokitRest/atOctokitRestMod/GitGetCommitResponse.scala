package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetCommitResponse extends js.Object {
  var author: GitGetCommitResponseAuthor
  var committer: GitGetCommitResponseCommitter
  var message: String
  var parents: js.Array[GitGetCommitResponseParentsItem]
  var sha: String
  var tree: GitGetCommitResponseTree
  var url: String
  var verification: GitGetCommitResponseVerification
}

object GitGetCommitResponse {
  @scala.inline
  def apply(
    author: GitGetCommitResponseAuthor,
    committer: GitGetCommitResponseCommitter,
    message: String,
    parents: js.Array[GitGetCommitResponseParentsItem],
    sha: String,
    tree: GitGetCommitResponseTree,
    url: String,
    verification: GitGetCommitResponseVerification
  ): GitGetCommitResponse = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, message = message, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[GitGetCommitResponse]
  }
}

