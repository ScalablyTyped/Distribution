package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerRequest extends js.Object {
  var headers: js.Any
  var installationId: js.UndefOr[java.lang.String] = js.undefined
  var ip: java.lang.String
  var log: js.Any
  var master: js.UndefOr[scala.Boolean] = js.undefined
  var `object`: parseLib.ParseNs.Object
  var original: js.UndefOr[parseLib.ParseNs.Object] = js.undefined
  var triggerName: java.lang.String
  var user: js.UndefOr[parseLib.ParseNs.User] = js.undefined
}

object TriggerRequest {
  @scala.inline
  def apply(
    headers: js.Any,
    ip: java.lang.String,
    log: js.Any,
    `object`: parseLib.ParseNs.Object,
    triggerName: java.lang.String,
    installationId: java.lang.String = null,
    master: js.UndefOr[scala.Boolean] = js.undefined,
    original: parseLib.ParseNs.Object = null,
    user: parseLib.ParseNs.User = null
  ): TriggerRequest = {
    val __obj = js.Dynamic.literal(headers = headers, ip = ip, log = log, triggerName = triggerName)
    __obj.updateDynamic("object")(`object`)
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master)
    if (original != null) __obj.updateDynamic("original")(original)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[TriggerRequest]
  }
}

