package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCommitsResponseItemsItem extends js.Object {
  var author: SearchCommitsResponseItemsItemAuthor
  var comments_url: String
  var commit: SearchCommitsResponseItemsItemCommit
  var committer: SearchCommitsResponseItemsItemCommitter
  var html_url: String
  var parents: js.Array[SearchCommitsResponseItemsItemParentsItem]
  var repository: SearchCommitsResponseItemsItemRepository
  var score: Double
  var sha: String
  var url: String
}

object SearchCommitsResponseItemsItem {
  @scala.inline
  def apply(
    author: SearchCommitsResponseItemsItemAuthor,
    comments_url: String,
    commit: SearchCommitsResponseItemsItemCommit,
    committer: SearchCommitsResponseItemsItemCommitter,
    html_url: String,
    parents: js.Array[SearchCommitsResponseItemsItemParentsItem],
    repository: SearchCommitsResponseItemsItemRepository,
    score: Double,
    sha: String,
    url: String
  ): SearchCommitsResponseItemsItem = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchCommitsResponseItemsItem]
  }
}

