package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponseCommit extends js.Object {
  var author: ReposCreateOrUpdateFileResponseCommitAuthor
  var committer: ReposCreateOrUpdateFileResponseCommitCommitter
  var html_url: String
  var message: String
  var node_id: String
  var parents: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem]
  var sha: String
  var tree: ReposCreateOrUpdateFileResponseCommitTree
  var url: String
  var verification: ReposCreateOrUpdateFileResponseCommitVerification
}

object ReposCreateOrUpdateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposCreateOrUpdateFileResponseCommitAuthor,
    committer: ReposCreateOrUpdateFileResponseCommitCommitter,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem],
    sha: String,
    tree: ReposCreateOrUpdateFileResponseCommitTree,
    url: String,
    verification: ReposCreateOrUpdateFileResponseCommitVerification
  ): ReposCreateOrUpdateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseCommit]
  }
}

