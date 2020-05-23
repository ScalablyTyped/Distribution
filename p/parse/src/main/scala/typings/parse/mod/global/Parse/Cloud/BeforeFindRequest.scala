package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import typings.parse.mod.global.Parse.Query
import typings.parse.mod.global.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeFindRequest extends TriggerRequest {
  var count: Boolean
  var isGet: Boolean
  var query: Query[Object[Attributes]]
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
    `object`: Object[Attributes],
    query: Query[Object[Attributes]],
    triggerName: String,
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    original: Object[Attributes] = null,
    readPreference: ReadPreferenceOption = null,
    user: User[Attributes] = null
  ): BeforeFindRequest = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], isGet = isGet.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master.get.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeFindRequest]
  }
}

