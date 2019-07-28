package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MxRecord extends js.Object {
  var exchange: java.lang.String
  var priority: Double
}

object MxRecord {
  @scala.inline
  def apply(exchange: java.lang.String, priority: Double): MxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange, priority = priority)
  
    __obj.asInstanceOf[MxRecord]
  }
}

