package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeSaveRequest extends TriggerRequest {
  var context: js.Object
}

object BeforeSaveRequest {
  @scala.inline
  def apply(
    context: js.Object,
    headers: js.Any,
    ip: java.lang.String,
    log: js.Any,
    `object`: parseLib.ParseNs.Object,
    triggerName: java.lang.String,
    installationId: java.lang.String = null,
    master: js.UndefOr[scala.Boolean] = js.undefined,
    original: parseLib.ParseNs.Object = null,
    user: parseLib.ParseNs.User = null
  ): BeforeSaveRequest = {
    val __obj = js.Dynamic.literal(context = context, headers = headers, ip = ip, log = log, triggerName = triggerName)
    __obj.updateDynamic("object")(`object`)
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master)
    if (original != null) __obj.updateDynamic("original")(original)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[BeforeSaveRequest]
  }
}

