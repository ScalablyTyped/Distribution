package typings
package nodeLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceInfoIPv6
  extends NetworkInterfaceBase
     with NetworkInterfaceInfo {
  var family: nodeLib.nodeLibStrings.IPv6
  var scopeid: scala.Double
}

object NetworkInterfaceInfoIPv6 {
  @scala.inline
  def apply(
    address: java.lang.String,
    family: nodeLib.nodeLibStrings.IPv6,
    internal: scala.Boolean,
    mac: java.lang.String,
    netmask: java.lang.String,
    scopeid: scala.Double,
    cidr: java.lang.String = null
  ): NetworkInterfaceInfoIPv6 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("family")(family)
    __obj.updateDynamic("internal")(internal)
    __obj.updateDynamic("mac")(mac)
    __obj.updateDynamic("netmask")(netmask)
    __obj.updateDynamic("scopeid")(scopeid)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[NetworkInterfaceInfoIPv6]
  }
}

