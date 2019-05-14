package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsAddOrUpdateMembership_Options extends js.Object {
  var org: java.lang.String
  var role: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object OrgsAddOrUpdateMembership_Options {
  @scala.inline
  def apply(org: java.lang.String, username: java.lang.String, role: java.lang.String = null): OrgsAddOrUpdateMembership_Options = {
    val __obj = js.Dynamic.literal(org = org, username = username)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[OrgsAddOrUpdateMembership_Options]
  }
}

