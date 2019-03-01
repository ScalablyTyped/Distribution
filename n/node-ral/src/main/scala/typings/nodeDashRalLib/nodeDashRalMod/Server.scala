package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var host: java.lang.String
  var idc: js.UndefOr[java.lang.String] = js.undefined
  var port: java.lang.String | scala.Double
}

object Server {
  @scala.inline
  def apply(host: java.lang.String, port: java.lang.String | scala.Double, idc: java.lang.String = null): Server = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (idc != null) __obj.updateDynamic("idc")(idc)
    __obj.asInstanceOf[Server]
  }
}

