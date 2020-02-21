package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationReposForAuthenticatedUserResponse extends js.Object {
  var repositories: js.Array[AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItem]
  var total_count: Double
}

object AppsListInstallationReposForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    repositories: js.Array[AppsListInstallationReposForAuthenticatedUserResponseRepositoriesItem],
    total_count: Double
  ): AppsListInstallationReposForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsListInstallationReposForAuthenticatedUserResponse]
  }
}

