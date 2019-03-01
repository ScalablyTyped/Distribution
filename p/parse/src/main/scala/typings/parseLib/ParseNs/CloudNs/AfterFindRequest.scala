package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterFindRequest extends TriggerRequest {
  var objects: js.Array[parseLib.ParseNs.Object]
}

object AfterFindRequest {
  @scala.inline
  def apply(
    headers: js.Any,
    ip: java.lang.String,
    log: js.Any,
    `object`: parseLib.ParseNs.Object,
    objects: js.Array[parseLib.ParseNs.Object],
    triggerName: java.lang.String,
    installationId: nodeLib.String = null,
    master: js.UndefOr[scala.Boolean] = js.undefined,
    original: parseLib.ParseNs.Object = null,
    user: parseLib.ParseNs.User = null
  ): AfterFindRequest = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("triggerName")(triggerName)
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master)
    if (original != null) __obj.updateDynamic("original")(original)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AfterFindRequest]
  }
}

