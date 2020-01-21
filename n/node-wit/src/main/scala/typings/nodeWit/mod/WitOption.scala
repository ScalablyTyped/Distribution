package typings.nodeWit.mod

import typings.nodeWit.mod.log.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitOption extends js.Object {
  var accessToken: String
  var actions: js.UndefOr[js.Any] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
}

object WitOption {
  @scala.inline
  def apply(accessToken: String, actions: js.Any = null, logger: Logger = null): WitOption = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitOption]
  }
}

