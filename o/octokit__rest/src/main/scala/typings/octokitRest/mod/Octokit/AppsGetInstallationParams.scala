package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetInstallationParams extends js.Object {
  var installation_id: Double
}

object AppsGetInstallationParams {
  @scala.inline
  def apply(installation_id: Double): AppsGetInstallationParams = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsGetInstallationParams]
  }
}

