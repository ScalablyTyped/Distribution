package typings.parse.ParseNs.CloudNs

import typings.parse.ParseNs.Object
import typings.parse.ParseNs.Query
import typings.parse.ParseNs.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeFindRequest extends TriggerRequest {
  var count: Boolean
  var isGet: Boolean
  var query: Query[Object]
  var readPreference: js.UndefOr[ReadPreferenceOption] = js.undefined
}

object BeforeFindRequest {
  @scala.inline
  def apply(
    count: Boolean,
    headers: js.Any,
    ip: String,
    isGet: Boolean,
    log: js.Any,
    `object`: Object,
    query: Query[Object],
    triggerName: String,
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    original: Object = null,
    readPreference: ReadPreferenceOption = null,
    user: User = null
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

