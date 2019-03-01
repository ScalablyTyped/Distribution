package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketAuthObject extends js.Object {
  var artifacts: js.Any
  var credentials: js.Any
  var isAuthenticated: scala.Boolean
}

object SocketAuthObject {
  @scala.inline
  def apply(artifacts: js.Any, credentials: js.Any, isAuthenticated: scala.Boolean): SocketAuthObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("credentials")(credentials)
    __obj.updateDynamic("isAuthenticated")(isAuthenticated)
    __obj.asInstanceOf[SocketAuthObject]
  }
}

