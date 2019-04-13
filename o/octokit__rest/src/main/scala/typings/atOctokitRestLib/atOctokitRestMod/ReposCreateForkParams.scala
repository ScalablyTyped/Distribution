package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateForkParams extends js.Object {
  /**
    * Optional parameter to specify the organization name if forking into an organization.
    */
  var organization: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposCreateForkParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, organization: java.lang.String = null): ReposCreateForkParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    __obj.asInstanceOf[ReposCreateForkParams]
  }
}

