package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateForkEndpoint extends js.Object {
  var organization: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposCreateForkEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, organization: java.lang.String = null): ReposCreateForkEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    __obj.asInstanceOf[ReposCreateForkEndpoint]
  }
}

