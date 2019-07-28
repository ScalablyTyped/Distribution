package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsAddRepoToInstallationEndpoint extends js.Object {
  var installation_id: Double
  var repository_id: Double
}

object AppsAddRepoToInstallationEndpoint {
  @scala.inline
  def apply(installation_id: Double, repository_id: Double): AppsAddRepoToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id, repository_id = repository_id)
  
    __obj.asInstanceOf[AppsAddRepoToInstallationEndpoint]
  }
}

