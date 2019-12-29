package typings.portDashNumbers.portDashNumbersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortInfo extends js.Object {
  val description: String
  val port: Double
  val protocol: String
}

object PortInfo {
  @scala.inline
  def apply(description: String, port: Double, protocol: String): PortInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PortInfo]
  }
}

