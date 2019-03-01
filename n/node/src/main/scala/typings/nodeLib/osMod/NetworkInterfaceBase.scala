package typings
package nodeLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfaceBase extends js.Object {
  var address: java.lang.String
  var cidr: java.lang.String | scala.Null
  var internal: scala.Boolean
  var mac: java.lang.String
  var netmask: java.lang.String
}

object NetworkInterfaceBase {
  @scala.inline
  def apply(
    address: java.lang.String,
    internal: scala.Boolean,
    mac: java.lang.String,
    netmask: java.lang.String,
    cidr: java.lang.String = null
  ): NetworkInterfaceBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("internal")(internal)
    __obj.updateDynamic("mac")(mac)
    __obj.updateDynamic("netmask")(netmask)
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    __obj.asInstanceOf[NetworkInterfaceBase]
  }
}

