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
    installationId: nodeLib.String = null,
    master: js.UndefOr[scala.Boolean] = js.undefined,
    original: parseLib.ParseNs.Object = null,
    readPreference: ReadPreferenceOption = null,
    user: parseLib.ParseNs.User = null
  ): BeforeFindRequest = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("isGet")(isGet)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("triggerName")(triggerName)
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master)
    if (original != null) __obj.updateDynamic("original")(original)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[BeforeFindRequest]
  }
}

