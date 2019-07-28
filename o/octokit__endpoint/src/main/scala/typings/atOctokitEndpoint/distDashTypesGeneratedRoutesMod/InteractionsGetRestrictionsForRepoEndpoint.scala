package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsGetRestrictionsForRepoEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object InteractionsGetRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): InteractionsGetRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[InteractionsGetRestrictionsForRepoEndpoint]
  }
}

