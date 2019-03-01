package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions
  extends nesLib.clientMod.ClientNs.ClientOptions

object ClientOptions {
  @scala.inline
  def apply(timeout: scala.Double | scala.Boolean = null, ws: js.Any = null): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ws != null) __obj.updateDynamic("ws")(ws)
    __obj.asInstanceOf[ClientOptions]
  }
}

