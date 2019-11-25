package typings.mdns.mdnsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Services ---
trait Service extends js.Object {
  var addresses: js.Array[String]
  var flags: Double
  var fullname: String
  var host: String
  var interfaceIndex: Double
  var name: js.UndefOr[String] = js.undefined
  var networkInterface: String
  var port: Double
  var rawTxtRecord: js.UndefOr[Buffer] = js.undefined
  var replyDomain: String
  var txtRecord: js.UndefOr[js.Any] = js.undefined
  var `type`: ServiceType
}

object Service {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    flags: Double,
    fullname: String,
    host: String,
    interfaceIndex: Double,
    networkInterface: String,
    port: Double,
    replyDomain: String,
    `type`: ServiceType,
    name: String = null,
    rawTxtRecord: Buffer = null,
    txtRecord: js.Any = null
  ): Service = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], interfaceIndex = interfaceIndex.asInstanceOf[js.Any], networkInterface = networkInterface.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], replyDomain = replyDomain.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rawTxtRecord != null) __obj.updateDynamic("rawTxtRecord")(rawTxtRecord.asInstanceOf[js.Any])
    if (txtRecord != null) __obj.updateDynamic("txtRecord")(txtRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

