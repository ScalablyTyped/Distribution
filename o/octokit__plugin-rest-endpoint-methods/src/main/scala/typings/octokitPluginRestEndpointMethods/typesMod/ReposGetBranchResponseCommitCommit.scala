package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommitCommit extends js.Object {
  var author: ReposGetBranchResponseCommitCommitAuthor
  var committer: ReposGetBranchResponseCommitCommitCommitter
  var message: String
  var tree: ReposGetBranchResponseCommitCommitTree
  var url: String
  var verification: ReposGetBranchResponseCommitCommitVerification
}

object ReposGetBranchResponseCommitCommit {
  @scala.inline
  def apply(
    author: ReposGetBranchResponseCommitCommitAuthor,
    committer: ReposGetBranchResponseCommitCommitCommitter,
    message: String,
    tree: ReposGetBranchResponseCommitCommitTree,
    url: String,
    verification: ReposGetBranchResponseCommitCommitVerification
  ): ReposGetBranchResponseCommitCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseCommitCommit]
  }
}

