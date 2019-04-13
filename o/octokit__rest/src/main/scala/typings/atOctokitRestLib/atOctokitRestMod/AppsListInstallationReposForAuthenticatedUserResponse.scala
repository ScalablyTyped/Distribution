package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationReposForAuthenticatedUserResponse extends js.Object {
  var repositories: js.Array[AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItem]
  var total_count: scala.Double
}

object AppsListInstallationReposForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    repositories: js.Array[AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItem],
    total_count: scala.Double
  ): AppsListInstallationReposForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(repositories = repositories, total_count = total_count)
  
    __obj.asInstanceOf[AppsListInstallationReposForAuthenticatedUserResponse]
  }
}

