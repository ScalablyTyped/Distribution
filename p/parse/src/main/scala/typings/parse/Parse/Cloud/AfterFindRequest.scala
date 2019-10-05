package typings.parse.Parse.Cloud

import typings.parse.Parse.Object
import typings.parse.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterFindRequest extends TriggerRequest {
  var objects: js.Array[Object]
}

object AfterFindRequest {
  @scala.inline
  def apply(
    headers: js.Any,
    ip: String,
    log: js.Any,
    `object`: Object,
    objects: js.Array[Object],
    triggerName: String,
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    original: Object = null,
    user: User = null
  ): AfterFindRequest = {
    val __obj = js.Dynamic.literal(headers = headers, ip = ip, log = log, objects = objects, triggerName = triggerName)
    __obj.updateDynamic("object")(`object`)
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master)
    if (original != null) __obj.updateDynamic("original")(original)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AfterFindRequest]
  }
}

