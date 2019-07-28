package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposDeleteEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposDeleteEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteEndpoint]
  }
}

