package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSubscriptionOptionsFilterOptions extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var socket: Socket
}

object ServerSubscriptionOptionsFilterOptions {
  @scala.inline
  def apply(socket: Socket, credentials: js.Any = null, params: js.Any = null): ServerSubscriptionOptionsFilterOptions = {
    val __obj = js.Dynamic.literal(socket = socket)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[ServerSubscriptionOptionsFilterOptions]
  }
}

