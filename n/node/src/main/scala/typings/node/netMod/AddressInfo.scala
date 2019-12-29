package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInfo extends js.Object {
  var address: String
  var family: String
  var port: Double
}

object AddressInfo {
  @scala.inline
  def apply(address: String, family: String, port: Double): AddressInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressInfo]
  }
}

