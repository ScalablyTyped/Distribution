package typings.node.dgramMod

import typings.node.nodeStrings.IPv4
import typings.node.nodeStrings.IPv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteInfo extends js.Object {
  var address: java.lang.String
  var family: IPv4 | IPv6
  var port: Double
  var size: Double
}

object RemoteInfo {
  @scala.inline
  def apply(address: java.lang.String, family: IPv4 | IPv6, port: Double, size: Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(address = address, family = family.asInstanceOf[js.Any], port = port, size = size)
  
    __obj.asInstanceOf[RemoteInfo]
  }
}

