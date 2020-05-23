package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateForkEndpoint extends js.Object {
  /**
    * Optional parameter to specify the organization name if forking into an organization.
    */
  var organization: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ReposCreateForkEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, organization: String = null): ReposCreateForkEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateForkEndpoint]
  }
}

