package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommit extends js.Object {
  var author: ReposGetBranchResponseCommitAuthor
  var commit: ReposGetBranchResponseCommitCommit
  var committer: ReposGetBranchResponseCommitCommitter
  var node_id: java.lang.String
  var parents: js.Array[ReposGetBranchResponseCommitParentsItem]
  var sha: java.lang.String
  var url: java.lang.String
}

object ReposGetBranchResponseCommit {
  @scala.inline
  def apply(
    author: ReposGetBranchResponseCommitAuthor,
    commit: ReposGetBranchResponseCommitCommit,
    committer: ReposGetBranchResponseCommitCommitter,
    node_id: java.lang.String,
    parents: js.Array[ReposGetBranchResponseCommitParentsItem],
    sha: java.lang.String,
    url: java.lang.String
  ): ReposGetBranchResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, commit = commit, committer = committer, node_id = node_id, parents = parents, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposGetBranchResponseCommit]
  }
}

