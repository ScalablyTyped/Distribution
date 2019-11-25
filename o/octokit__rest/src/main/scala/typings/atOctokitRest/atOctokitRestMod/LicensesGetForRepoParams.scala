package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesGetForRepoParams extends js.Object {
  var owner: String
  var repo: String
}

object LicensesGetForRepoParams {
  @scala.inline
  def apply(owner: String, repo: String): LicensesGetForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LicensesGetForRepoParams]
  }
}

