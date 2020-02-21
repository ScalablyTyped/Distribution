package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommit extends js.Object {
  var author: ReposGetBranchResponseCommitAuthor
  var commit: ReposGetBranchResponseCommitCommit
  var committer: ReposGetBranchResponseCommitCommitter
  var node_id: String
  var parents: js.Array[ReposGetBranchResponseCommitParentsItem]
  var sha: String
  var url: String
}

object ReposGetBranchResponseCommit {
  @scala.inline
  def apply(
    author: ReposGetBranchResponseCommitAuthor,
    commit: ReposGetBranchResponseCommitCommit,
    committer: ReposGetBranchResponseCommitCommitter,
    node_id: String,
    parents: js.Array[ReposGetBranchResponseCommitParentsItem],
    sha: String,
    url: String
  ): ReposGetBranchResponseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetBranchResponseCommit]
  }
}

