package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateForkEndpoint extends js.Object {
  var organization: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ReposCreateForkEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, organization: String = null): ReposCreateForkEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    __obj.asInstanceOf[ReposCreateForkEndpoint]
  }
}

