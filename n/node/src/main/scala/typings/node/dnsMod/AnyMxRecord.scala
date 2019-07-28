package typings.node.dnsMod

import typings.node.nodeStrings.MX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyMxRecord
  extends MxRecord
     with AnyRecord {
  var `type`: MX
}

object AnyMxRecord {
  @scala.inline
  def apply(exchange: java.lang.String, priority: Double, `type`: MX): AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange, priority = priority)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyMxRecord]
  }
}

