package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseCommitsItemCommit extends js.Object {
  var author: ReposCompareCommitsResponseCommitsItemCommitAuthor
  var comment_count: Double
  var committer: ReposCompareCommitsResponseCommitsItemCommitCommitter
  var message: String
  var tree: ReposCompareCommitsResponseCommitsItemCommitTree
  var url: String
  var verification: ReposCompareCommitsResponseCommitsItemCommitVerification
}

object ReposCompareCommitsResponseCommitsItemCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseCommitsItemCommitAuthor,
    comment_count: Double,
    committer: ReposCompareCommitsResponseCommitsItemCommitCommitter,
    message: String,
    tree: ReposCompareCommitsResponseCommitsItemCommitTree,
    url: String,
    verification: ReposCompareCommitsResponseCommitsItemCommitVerification
  ): ReposCompareCommitsResponseCommitsItemCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseCommitsItemCommit]
  }
}

