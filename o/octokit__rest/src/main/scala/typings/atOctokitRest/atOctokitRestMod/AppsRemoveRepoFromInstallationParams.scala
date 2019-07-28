package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsRemoveRepoFromInstallationParams extends js.Object {
  var installation_id: Double
  var repository_id: Double
}

object AppsRemoveRepoFromInstallationParams {
  @scala.inline
  def apply(installation_id: Double, repository_id: Double): AppsRemoveRepoFromInstallationParams = {
    val __obj = js.Dynamic.literal(installation_id = installation_id, repository_id = repository_id)
  
    __obj.asInstanceOf[AppsRemoveRepoFromInstallationParams]
  }
}

