package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetCommitResponse extends js.Object {
  var author: GitGetCommitResponseAuthor
  var committer: GitGetCommitResponseCommitter
  var message: java.lang.String
  var parents: js.Array[GitGetCommitResponseParentsItem]
  var sha: java.lang.String
  var tree: GitGetCommitResponseTree
  var url: java.lang.String
  var verification: GitGetCommitResponseVerification
}

object GitGetCommitResponse {
  @scala.inline
  def apply(
    author: GitGetCommitResponseAuthor,
    committer: GitGetCommitResponseCommitter,
    message: java.lang.String,
    parents: js.Array[GitGetCommitResponseParentsItem],
    sha: java.lang.String,
    tree: GitGetCommitResponseTree,
    url: java.lang.String,
    verification: GitGetCommitResponseVerification
  ): GitGetCommitResponse = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, message = message, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[GitGetCommitResponse]
  }
}

