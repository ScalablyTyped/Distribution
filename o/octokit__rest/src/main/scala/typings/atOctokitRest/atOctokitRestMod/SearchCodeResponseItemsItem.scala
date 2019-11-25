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
    val __obj = js.Dynamic.literal(git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchCodeResponseItemsItem]
  }
}

