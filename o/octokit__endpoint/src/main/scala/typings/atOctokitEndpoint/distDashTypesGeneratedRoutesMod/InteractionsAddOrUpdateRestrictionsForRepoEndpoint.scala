package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsAddOrUpdateRestrictionsForRepoEndpoint extends js.Object {
  var limit: String
  var owner: String
  var repo: String
}

object InteractionsAddOrUpdateRestrictionsForRepoEndpoint {
  @scala.inline
  def apply(limit: String, owner: String, repo: String): InteractionsAddOrUpdateRestrictionsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(limit = limit, owner = owner, repo = repo)
  
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForRepoEndpoint]
  }
}

