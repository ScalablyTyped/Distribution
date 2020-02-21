package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTopicsParams extends js.Object {
  /**
    * The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search to specific areas of GitHub. The REST API supports the same qualifiers as GitHub.com. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query).
    */
  var q: String
}

object SearchTopicsParams {
  @scala.inline
  def apply(q: String): SearchTopicsParams = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchTopicsParams]
  }
}

