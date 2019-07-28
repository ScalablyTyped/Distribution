package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsGetRestrictionsForRepoParams extends js.Object {
  var owner: String
  var repo: String
}

object InteractionsGetRestrictionsForRepoParams {
  @scala.inline
  def apply(owner: String, repo: String): InteractionsGetRestrictionsForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[InteractionsGetRestrictionsForRepoParams]
  }
}

