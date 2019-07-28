package typings.node.clusterMod

import typings.node.nodeStrings.udp4
import typings.node.nodeStrings.udp6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: java.lang.String
  var addressType: Double | udp4 | udp6
  var port: Double
}

object Address {
  @scala.inline
  def apply(address: java.lang.String, addressType: Double | udp4 | udp6, port: Double): Address = {
    val __obj = js.Dynamic.literal(address = address, addressType = addressType.asInstanceOf[js.Any], port = port)
  
    __obj.asInstanceOf[Address]
  }
}

