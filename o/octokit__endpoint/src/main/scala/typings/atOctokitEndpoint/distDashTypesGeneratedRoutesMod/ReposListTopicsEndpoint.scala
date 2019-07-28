package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListTopicsEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposListTopicsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposListTopicsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposListTopicsEndpoint]
  }
}

