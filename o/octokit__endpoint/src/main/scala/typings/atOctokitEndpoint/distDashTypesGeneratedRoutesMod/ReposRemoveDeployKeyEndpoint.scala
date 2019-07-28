package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveDeployKeyEndpoint extends js.Object {
  var key_id: Double
  var owner: String
  var repo: String
}

object ReposRemoveDeployKeyEndpoint {
  @scala.inline
  def apply(key_id: Double, owner: String, repo: String): ReposRemoveDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(key_id = key_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRemoveDeployKeyEndpoint]
  }
}

