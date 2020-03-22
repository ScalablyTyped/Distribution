package typings.openfin.systemApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationInfo extends js.Object {
  var isRunning: Boolean
  var parentUuid: js.UndefOr[String] = js.undefined
  var uuid: String
}

object ApplicationInfo {
  @scala.inline
  def apply(isRunning: Boolean, uuid: String, parentUuid: String = null): ApplicationInfo = {
    val __obj = js.Dynamic.literal(isRunning = isRunning.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (parentUuid != null) __obj.updateDynamic("parentUuid")(parentUuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfo]
  }
}

