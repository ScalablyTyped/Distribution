package typings
package nodeLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceInfoIPv4
  extends NetworkInterfaceBase
     with NetworkInterfaceInfo {
  var family: nodeLib.nodeLibStrings.IPv4
}

object NetworkInterfaceInfoIPv4 {
  @scala.inline
  def apply(
    address: java.lang.String,
    family: nodeLib.nodeLibStrings.IPv4,
    internal: scala.Boolean,
    mac: java.lang.String,
    netmask: java.lang.String,
    cidr: java.lang.String = null
  ): NetworkInterfaceInfoIPv4 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("internal")(internal)
    __obj.updateDynamic("mac")(mac)
    __obj.updateDynamic("netmask")(netmask)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[NetworkInterfaceInfoIPv4]
  }
}

