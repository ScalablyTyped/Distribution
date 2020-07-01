package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowrebasemerge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListReposAccessibleToInstallationResponseData extends js.Object {
  var repositories: js.Array[Allowrebasemerge]
  var total_count: Double
}

object AppsListReposAccessibleToInstallationResponseData {
  @scala.inline
  def apply(repositories: js.Array[Allowrebasemerge], total_count: Double): AppsListReposAccessibleToInstallationResponseData = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListReposAccessibleToInstallationResponseData]
  }
}

