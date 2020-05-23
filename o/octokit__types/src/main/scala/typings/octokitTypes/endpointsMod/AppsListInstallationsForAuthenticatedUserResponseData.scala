package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsForAuthenticatedUserResponseData extends js.Object {
  var installations: js.Array[Permissions]
  var total_count: Double
}

object AppsListInstallationsForAuthenticatedUserResponseData {
  @scala.inline
  def apply(installations: js.Array[Permissions], total_count: Double): AppsListInstallationsForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponseData]
  }
}

