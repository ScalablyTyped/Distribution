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
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, html_url = html_url, parents = parents, repository = repository, score = score, sha = sha, url = url)
  
    __obj.asInstanceOf[SearchCommitsResponseItemsItem]
  }
}

