package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommitCommit extends js.Object {
  var author: ReposGetBranchResponseCommitCommitAuthor
  var committer: ReposGetBranchResponseCommitCommitCommitter
  var message: java.lang.String
  var tree: ReposGetBranchResponseCommitCommitTree
  var url: java.lang.String
  var verification: ReposGetBranchResponseCommitCommitVerification
}

object ReposGetBranchResponseCommitCommit {
  @scala.inline
  def apply(
    author: ReposGetBranchResponseCommitCommitAuthor,
    committer: ReposGetBranchResponseCommitCommitCommitter,
    message: java.lang.String,
    tree: ReposGetBranchResponseCommitCommitTree,
    url: java.lang.String,
    verification: ReposGetBranchResponseCommitCommitVerification
  ): ReposGetBranchResponseCommitCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, message = message, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposGetBranchResponseCommitCommit]
  }
}

