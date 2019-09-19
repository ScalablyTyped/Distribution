package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCodeResponseItemsItem extends js.Object {
  var git_url: String
  var html_url: String
  var name: String
  var path: String
  var repository: SearchCodeResponseItemsItemRepository
  var score: Double
  var sha: String
  var url: String
}

object SearchCodeResponseItemsItem {
  @scala.inline
  def apply(
    git_url: String,
    html_url: String,
    name: String,
    path: String,
    repository: SearchCodeResponseItemsItemRepository,
    score: Double,
    sha: String,
    url: String
  ): SearchCodeResponseItemsItem = {
    val __obj = js.Dynamic.literal(git_url = git_url, html_url = html_url, name = name, path = path, repository = repository, score = score, sha = sha, url = url)
  
    __obj.asInstanceOf[SearchCodeResponseItemsItem]
  }
}

