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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[AnySrvRecord]
  }
}

