package typings
package nodeLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo extends js.Object {
  var address: java.lang.String
  var family: nodeLib.nodeLibStrings.IPv4 | nodeLib.nodeLibStrings.IPv6
  var port: scala.Double
  var size: scala.Double
}

object RemoteInfo {
  @scala.inline
  def apply(
    address: java.lang.String,
    family: nodeLib.nodeLibStrings.IPv4 | nodeLib.nodeLibStrings.IPv6,
    port: scala.Double,
    size: scala.Double
  ): RemoteInfo = {
    val __obj = js.Dynamic.literal(address = address, family = family.asInstanceOf[js.Any], port = port, size = size)
  
    __obj.asInstanceOf[RemoteInfo]
  }
}

