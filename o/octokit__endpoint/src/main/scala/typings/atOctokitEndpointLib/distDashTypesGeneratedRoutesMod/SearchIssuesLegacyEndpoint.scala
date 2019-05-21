package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesLegacyEndpoint extends js.Object {
  var keyword: java.lang.String
  var owner: java.lang.String
  var repository: java.lang.String
  var state: java.lang.String
}

object SearchIssuesLegacyEndpoint {
  @scala.inline
  def apply(
    keyword: java.lang.String,
    owner: java.lang.String,
    repository: java.lang.String,
    state: java.lang.String
  ): SearchIssuesLegacyEndpoint = {
    val __obj = js.Dynamic.literal(keyword = keyword, owner = owner, repository = repository, state = state)
  
    __obj.asInstanceOf[SearchIssuesLegacyEndpoint]
  }
}

