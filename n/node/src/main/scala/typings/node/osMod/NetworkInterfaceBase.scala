package typings.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceBase extends js.Object {
  var address: java.lang.String
  var cidr: java.lang.String | Null
  var internal: Boolean
  var mac: java.lang.String
  var netmask: java.lang.String
}

object NetworkInterfaceBase {
  @scala.inline
  def apply(
    address: java.lang.String,
    internal: Boolean,
    mac: java.lang.String,
    netmask: java.lang.String,
    cidr: java.lang.String = null
  ): NetworkInterfaceBase = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceBase]
  }
}

