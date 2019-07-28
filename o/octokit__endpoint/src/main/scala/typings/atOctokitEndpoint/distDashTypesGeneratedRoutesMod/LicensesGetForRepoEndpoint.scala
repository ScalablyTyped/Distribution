package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesGetForRepoEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object LicensesGetForRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): LicensesGetForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[LicensesGetForRepoEndpoint]
  }
}

