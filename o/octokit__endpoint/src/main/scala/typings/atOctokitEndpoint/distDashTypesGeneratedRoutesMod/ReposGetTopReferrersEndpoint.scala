package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetTopReferrersEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetTopReferrersEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetTopReferrersEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetTopReferrersEndpoint]
  }
}

