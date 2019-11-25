package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseBaseCommitCommit extends js.Object {
  var author: ReposCompareCommitsResponseBaseCommitCommitAuthor
  var comment_count: Double
  var committer: ReposCompareCommitsResponseBaseCommitCommitCommitter
  var message: String
  var tree: ReposCompareCommitsResponseBaseCommitCommitTree
  var url: String
  var verification: ReposCompareCommitsResponseBaseCommitCommitVerification
}

object ReposCompareCommitsResponseBaseCommitCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseBaseCommitCommitAuthor,
    comment_count: Double,
    committer: ReposCompareCommitsResponseBaseCommitCommitCommitter,
    message: String,
    tree: ReposCompareCommitsResponseBaseCommitCommitTree,
    url: String,
    verification: ReposCompareCommitsResponseBaseCommitCommitVerification
  ): ReposCompareCommitsResponseBaseCommitCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseBaseCommitCommit]
  }
}

