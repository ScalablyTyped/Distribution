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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitGetCommitResponse]
  }
}

