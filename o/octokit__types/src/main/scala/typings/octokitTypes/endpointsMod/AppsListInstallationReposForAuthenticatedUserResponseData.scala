package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationReposForAuthenticatedUserResponseData extends js.Object {
  var repositories: js.Array[Allowmergecommit]
  var total_count: Double
}

object AppsListInstallationReposForAuthenticatedUserResponseData {
  @scala.inline
  def apply(repositories: js.Array[Allowmergecommit], total_count: Double): AppsListInstallationReposForAuthenticatedUserResponseData = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationReposForAuthenticatedUserResponseData]
  }
}

