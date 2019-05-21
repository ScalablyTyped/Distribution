package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsAddRepoToInstallationEndpoint extends js.Object {
  var installation_id: scala.Double
  var repository_id: scala.Double
}

object AppsAddRepoToInstallationEndpoint {
  @scala.inline
  def apply(installation_id: scala.Double, repository_id: scala.Double): AppsAddRepoToInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id, repository_id = repository_id)
  
    __obj.asInstanceOf[AppsAddRepoToInstallationEndpoint]
  }
}

