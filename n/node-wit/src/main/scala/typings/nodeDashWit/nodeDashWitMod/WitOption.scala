package typings.nodeDashWit.nodeDashWitMod

import typings.nodeDashWit.nodeDashWitMod.log.Logger
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
    val __obj = js.Dynamic.literal(accessToken = accessToken)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[WitOption]
  }
}

