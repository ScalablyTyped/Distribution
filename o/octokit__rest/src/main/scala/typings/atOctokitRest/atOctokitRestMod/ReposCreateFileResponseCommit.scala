package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseCommit extends js.Object {
  var author: ReposCreateFileResponseCommitAuthor
  var committer: ReposCreateFileResponseCommitCommitter
  var html_url: String
  var message: String
  var node_id: String
  var parents: js.Array[ReposCreateFileResponseCommitParentsItem]
  var sha: String
  var tree: ReposCreateFileResponseCommitTree
  var url: String
  var verification: ReposCreateFileResponseCommitVerification
}

object ReposCreateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposCreateFileResponseCommitAuthor,
    committer: ReposCreateFileResponseCommitCommitter,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[ReposCreateFileResponseCommitParentsItem],
    sha: String,
    tree: ReposCreateFileResponseCommitTree,
    url: String,
    verification: ReposCreateFileResponseCommitVerification
  ): ReposCreateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateFileResponseCommit]
  }
}

