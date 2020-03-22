package typings.openfin.rvmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RVMInfo extends js.Object {
  var action: String
  var appLogDirectory: String
  var path: String
  var `start-time`: String
  var version: String
  var `working-dir`: String
}

object RVMInfo {
  @scala.inline
  def apply(
    action: String,
    appLogDirectory: String,
    path: String,
    `start-time`: String,
    version: String,
    `working-dir`: String
  ): RVMInfo = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], appLogDirectory = appLogDirectory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("start-time")(`start-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("working-dir")(`working-dir`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RVMInfo]
  }
}

