package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsAddRepoToInstallationParams extends js.Object {
  var installation_id: Double
  var repository_id: Double
}

object AppsAddRepoToInstallationParams {
  @scala.inline
  def apply(installation_id: Double, repository_id: Double): AppsAddRepoToInstallationParams = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsAddRepoToInstallationParams]
  }
}

