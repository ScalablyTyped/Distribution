package typings.node.dnsMod

import typings.node.nodeStrings.SRV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnySrvRecord
  extends SrvRecord
     with AnyRecord {
  var `type`: SRV
}

object AnySrvRecord {
  @scala.inline
  def apply(name: String, port: Double, priority: Double, `type`: SRV, weight: Double): AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySrvRecord]
  }
}

