package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import typings.parse.mod.global.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line no-empty-interface
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
    `object`: Object[Attributes],
    triggerName: String,
    installationId: String = null,
    master: js.UndefOr[Boolean] = js.undefined,
    original: Object[Attributes] = null,
    user: User[Attributes] = null
  ): BeforeSaveRequest = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (!js.isUndefined(master)) __obj.updateDynamic("master")(master.get.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeSaveRequest]
  }
}

