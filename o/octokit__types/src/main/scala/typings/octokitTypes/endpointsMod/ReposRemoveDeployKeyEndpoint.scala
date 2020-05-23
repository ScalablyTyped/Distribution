package typings.octokitTypes.endpointsMod

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
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRemoveDeployKeyEndpoint]
  }
}

