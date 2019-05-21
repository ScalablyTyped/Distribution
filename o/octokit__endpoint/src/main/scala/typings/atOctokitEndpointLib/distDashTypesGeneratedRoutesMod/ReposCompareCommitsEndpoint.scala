package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsEndpoint extends js.Object {
  var base: java.lang.String
  var head: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposCompareCommitsEndpoint {
  @scala.inline
  def apply(base: java.lang.String, head: java.lang.String, owner: java.lang.String, repo: java.lang.String): ReposCompareCommitsEndpoint = {
    val __obj = js.Dynamic.literal(base = base, head = head, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposCompareCommitsEndpoint]
  }
}

