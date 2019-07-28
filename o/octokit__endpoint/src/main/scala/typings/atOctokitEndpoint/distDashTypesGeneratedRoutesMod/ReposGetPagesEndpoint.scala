package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetPagesEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetPagesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetPagesEndpoint]
  }
}

