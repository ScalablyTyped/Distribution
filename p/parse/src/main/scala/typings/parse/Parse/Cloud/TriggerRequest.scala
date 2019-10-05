package typings.parse.Parse.Cloud

import typings.parse.Parse.Object
import typings.parse.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerRequest extends js.Object {
  var headers: js.Any
  var installationId: js.UndefOr[String] = js.undefined
  var ip: String
  var log: js.Any
  var master: js.UndefOr[Boolean] = js.undefined
  var `object`: Object
  var original: js.UndefOr[Object] = js.undefined
  var triggerName: String
  var user: js.UndefOr[User] = js.undefined
}

object TriggerRequest {
  @scala.inline
  def apply(
    headers: js.Any,
    ip: String,
    log: js.Any,
    `object`: Object,
    triggerName: String,
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    original: Object = null,
    user: User = null
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

