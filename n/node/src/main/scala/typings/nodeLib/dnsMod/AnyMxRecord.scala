package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyMxRecord
  extends MxRecord
     with AnyRecord {
  var `type`: nodeLib.nodeLibStrings.MX
}

object AnyMxRecord {
  @scala.inline
  def apply(exchange: java.lang.String, priority: scala.Double, `type`: nodeLib.nodeLibStrings.MX): AnyMxRecord = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("exchange")(exchange)
    __obj.updateDynamic("priority")(priority)
    __obj.asInstanceOf[AnyMxRecord]
  }
}

