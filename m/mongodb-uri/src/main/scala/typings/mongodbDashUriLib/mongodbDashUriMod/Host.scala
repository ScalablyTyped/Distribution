package typings
package mongodbDashUriLib.mongodbDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
}

object Host {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Int | scala.Double = null): Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

