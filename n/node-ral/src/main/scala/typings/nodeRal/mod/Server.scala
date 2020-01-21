package typings.nodeRal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  var host: String
  var idc: js.UndefOr[String] = js.undefined
  var port: String | Double
}

object Server {
  @scala.inline
  def apply(host: String, port: String | Double, idc: String = null): Server = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (idc != null) __obj.updateDynamic("idc")(idc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
}

