package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesLegacyEndpoint extends js.Object {
  var keyword: String
  var owner: String
  var repository: String
  var state: String
}

object SearchIssuesLegacyEndpoint {
  @scala.inline
  def apply(keyword: String, owner: String, repository: String, state: String): SearchIssuesLegacyEndpoint = {
    val __obj = js.Dynamic.literal(keyword = keyword, owner = owner, repository = repository, state = state)
  
    __obj.asInstanceOf[SearchIssuesLegacyEndpoint]
  }
}

