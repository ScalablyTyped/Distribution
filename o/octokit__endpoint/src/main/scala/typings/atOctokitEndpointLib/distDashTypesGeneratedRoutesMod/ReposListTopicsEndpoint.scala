package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListTopicsEndpoint extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposListTopicsEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String): ReposListTopicsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposListTopicsEndpoint]
  }
}

