package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnySrvRecord
  extends SrvRecord
     with AnyRecord {
  var `type`: nodeLib.nodeLibStrings.SRV
}

object AnySrvRecord {
  @scala.inline
  def apply(
    name: java.lang.String,
    port: scala.Double,
    priority: scala.Double,
    `type`: nodeLib.nodeLibStrings.SRV,
    weight: scala.Double
  ): AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name, port = port, priority = priority, weight = weight)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnySrvRecord]
  }
}

