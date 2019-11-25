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
  var `object`: Object[_]
  var original: js.UndefOr[Object[_]] = js.undefined
  var triggerName: String
  var user: js.UndefOr[User[_]] = js.undefined
}

object TriggerRequest {
  @scala.inline
  def apply(
    headers: js.Any,
    ip: String,
    log: js.Any,
    `object`: Object[_],
    triggerName: String,
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    original: Object[_] = null,
    user: User[_] = null
  ): TriggerRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerRequest]
  }
}

