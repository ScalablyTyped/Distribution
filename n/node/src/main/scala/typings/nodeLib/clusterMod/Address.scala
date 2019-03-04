package typings
package nodeLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: java.lang.String
  var addressType: scala.Double | nodeLib.nodeLibStrings.udp4 | nodeLib.nodeLibStrings.udp6
  var port: scala.Double
}

object Address {
  @scala.inline
  def apply(
    address: java.lang.String,
    addressType: scala.Double | nodeLib.nodeLibStrings.udp4 | nodeLib.nodeLibStrings.udp6,
    port: scala.Double
  ): Address = {
    val __obj = js.Dynamic.literal(address = address, addressType = addressType.asInstanceOf[js.Any], port = port)
  
    __obj.asInstanceOf[Address]
  }
}

