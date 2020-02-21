package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsForAuthenticatedUserResponse extends js.Object {
  var installations: js.Array[AppsListInstallationsForAuthenticatedUserResponseInstallationsItem]
  var total_count: Double
}

object AppsListInstallationsForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    installations: js.Array[AppsListInstallationsForAuthenticatedUserResponseInstallationsItem],
    total_count: Double
  ): AppsListInstallationsForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponse]
  }
}

