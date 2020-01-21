package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsFindUserInstallationParams extends js.Object {
  var username: String
}

object AppsFindUserInstallationParams {
  @scala.inline
  def apply(username: String): AppsFindUserInstallationParams = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsFindUserInstallationParams]
  }
}

