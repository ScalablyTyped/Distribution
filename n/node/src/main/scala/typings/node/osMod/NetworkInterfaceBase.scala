package typings.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceBase extends js.Object {
  var address: String
  var cidr: String | Null
  var internal: Boolean
  var mac: String
  var netmask: String
}

object NetworkInterfaceBase {
  @scala.inline
  def apply(address: String, internal: Boolean, mac: String, netmask: String, cidr: String = null): NetworkInterfaceBase = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceBase]
  }
}

