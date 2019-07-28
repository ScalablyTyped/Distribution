package typings.node.osMod

import typings.node.nodeStrings.IPv4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceInfoIPv4
  extends NetworkInterfaceBase
     with NetworkInterfaceInfo {
  var family: IPv4
}

object NetworkInterfaceInfoIPv4 {
  @scala.inline
  def apply(
    address: java.lang.String,
    family: IPv4,
    internal: Boolean,
    mac: java.lang.String,
    netmask: java.lang.String,
    cidr: java.lang.String = null
  ): NetworkInterfaceInfoIPv4 = {
    val __obj = js.Dynamic.literal(address = address, family = family, internal = internal, mac = mac, netmask = netmask)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[NetworkInterfaceInfoIPv4]
  }
}

