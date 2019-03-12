package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeFindRequest extends TriggerRequest {
  var count: scala.Boolean
  var isGet: scala.Boolean
  var query: parseLib.ParseNs.Query[parseLib.ParseNs.Object]
  var readPreference: js.UndefOr[ReadPreferenceOption] = js.undefined
}

object BeforeFindRequest {
  @scala.inline
  def apply(
    count: scala.Boolean,
    headers: js.Any,
    ip: java.lang.String,
    isGet: scala.Boolean,
    log: js.Any,
    `object`: parseLib.ParseNs.Object,
    query: parseLib.ParseNs.Query[parseLib.ParseNs.Object],
    triggerName: java.lang.String,
    installationId: java.lang.String = null,
    master: js.UndefOr[scala.Boolean] = js.undefined,
    original: parseLib.ParseNs.Object = null,
    readPreference: ReadPreferenceOption = null,
    user: parseLib.ParseNs.User = null
  ): BeforeFindRequest = {
    val __obj = js.Dynamic.literal(count = count, headers = headers, ip = ip, isGet = isGet, log = log, query = query, triggerName = triggerName)
    __obj.updateDynamic("object")(`object`)
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master)
    if (original != null) __obj.updateDynamic("original")(original)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[BeforeFindRequest]
  }
}

