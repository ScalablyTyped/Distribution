package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCommitsResponseItemsItemCommit extends js.Object {
  var author: SearchCommitsResponseItemsItemCommitAuthor
  var comment_count: Double
  var committer: SearchCommitsResponseItemsItemCommitCommitter
  var message: String
  var tree: SearchCommitsResponseItemsItemCommitTree
  var url: String
}

object SearchCommitsResponseItemsItemCommit {
  @scala.inline
  def apply(
    author: SearchCommitsResponseItemsItemCommitAuthor,
    comment_count: Double,
    committer: SearchCommitsResponseItemsItemCommitCommitter,
    message: String,
    tree: SearchCommitsResponseItemsItemCommitTree,
    url: String
  ): SearchCommitsResponseItemsItemCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchCommitsResponseItemsItemCommit]
  }
}

