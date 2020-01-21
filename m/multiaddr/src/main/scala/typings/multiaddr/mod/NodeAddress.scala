package typings.multiaddr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeAddress extends js.Object {
  var address: String
  var family: String
  var port: String
}

object NodeAddress {
  @scala.inline
  def apply(address: String, family: String, port: String): NodeAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeAddress]
  }
}

