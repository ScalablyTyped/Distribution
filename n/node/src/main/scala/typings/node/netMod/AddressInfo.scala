package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInfo extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var port: Double
}

object AddressInfo {
  @scala.inline
  def apply(address: java.lang.String, family: java.lang.String, port: Double): AddressInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressInfo]
  }
}

