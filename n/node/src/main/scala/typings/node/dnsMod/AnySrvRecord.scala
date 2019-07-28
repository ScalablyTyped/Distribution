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
  def apply(name: java.lang.String, port: Double, priority: Double, `type`: SRV, weight: Double): AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name, port = port, priority = priority, weight = weight)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnySrvRecord]
  }
}

