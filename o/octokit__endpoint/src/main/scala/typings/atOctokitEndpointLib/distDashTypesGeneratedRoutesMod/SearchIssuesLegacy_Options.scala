package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesLegacy_Options extends js.Object {
  var keyword: java.lang.String
  var owner: java.lang.String
  var repository: java.lang.String
  var state: java.lang.String
}

object SearchIssuesLegacy_Options {
  @scala.inline
  def apply(
    keyword: java.lang.String,
    owner: java.lang.String,
    repository: java.lang.String,
    state: java.lang.String
  ): SearchIssuesLegacy_Options = {
    val __obj = js.Dynamic.literal(keyword = keyword, owner = owner, repository = repository, state = state)
  
    __obj.asInstanceOf[SearchIssuesLegacy_Options]
  }
}

