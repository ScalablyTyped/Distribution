package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommit extends js.Object {
  var author: ReposDeleteFileResponseCommitAuthor
  var committer: ReposDeleteFileResponseCommitCommitter
  var html_url: String
  var message: String
  var node_id: String
  var parents: js.Array[ReposDeleteFileResponseCommitParentsItem]
  var sha: String
  var tree: ReposDeleteFileResponseCommitTree
  var url: String
  var verification: ReposDeleteFileResponseCommitVerification
}

object ReposDeleteFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposDeleteFileResponseCommitAuthor,
    committer: ReposDeleteFileResponseCommitCommitter,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[ReposDeleteFileResponseCommitParentsItem],
    sha: String,
    tree: ReposDeleteFileResponseCommitTree,
    url: String,
    verification: ReposDeleteFileResponseCommitVerification
  ): ReposDeleteFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommit]
  }
}

