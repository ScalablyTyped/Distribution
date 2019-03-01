package typings
package mdnsLib.mdnsMod.MDNSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Services ---
trait Service extends js.Object {
  var addresses: js.Array[java.lang.String]
  var flags: scala.Double
  var fullname: java.lang.String
  var host: java.lang.String
  var interfaceIndex: scala.Double
  var name: js.UndefOr[java.lang.String] = js.undefined
  var networkInterface: java.lang.String
  var port: scala.Double
  var rawTxtRecord: js.UndefOr[nodeLib.Buffer] = js.undefined
  var replyDomain: java.lang.String
  var txtRecord: js.UndefOr[js.Any] = js.undefined
  var `type`: ServiceType
}

object Service {
  @scala.inline
  def apply(
    addresses: js.Array[java.lang.String],
    flags: scala.Double,
    fullname: java.lang.String,
    host: java.lang.String,
    interfaceIndex: scala.Double,
    networkInterface: java.lang.String,
    port: scala.Double,
    replyDomain: java.lang.String,
    `type`: ServiceType,
    name: java.lang.String = null,
    rawTxtRecord: nodeLib.Buffer = null,
    txtRecord: js.Any = null
  ): Service = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("addresses")(addresses)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("fullname")(fullname)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("interfaceIndex")(interfaceIndex)
    __obj.updateDynamic("networkInterface")(networkInterface)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("replyDomain")(replyDomain)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rawTxtRecord != null) __obj.updateDynamic("rawTxtRecord")(rawTxtRecord)
    if (txtRecord != null) __obj.updateDynamic("txtRecord")(txtRecord)
    __obj.asInstanceOf[Service]
  }
}

