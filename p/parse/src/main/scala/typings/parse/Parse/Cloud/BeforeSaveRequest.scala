package typings.parse.Parse.Cloud

import typings.parse.Parse.Object
import typings.parse.Parse.User
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
    ip: String,
    log: js.Any,
    `object`: Object,
    triggerName: String,
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    original: Object = null,
    user: User = null
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

