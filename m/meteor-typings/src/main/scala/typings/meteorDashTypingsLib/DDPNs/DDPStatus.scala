package typings
package meteorDashTypingsLib.DDPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DDPStatus extends js.Object {
  var connected: scala.Boolean
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var retryCount: scala.Double
  var retryTime: js.UndefOr[scala.Double] = js.undefined
  var status: Status
}

