package typings
package nesLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var timeout: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var ws: js.UndefOr[js.Any] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(timeout: scala.Double | scala.Boolean = null, ws: js.Any = null): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ws != null) __obj.updateDynamic("ws")(ws)
    __obj.asInstanceOf[ClientOptions]
  }
}

