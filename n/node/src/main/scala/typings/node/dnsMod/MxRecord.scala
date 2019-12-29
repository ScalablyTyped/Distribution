package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MxRecord extends js.Object {
  var exchange: String
  var priority: Double
}

object MxRecord {
  @scala.inline
  def apply(exchange: String, priority: Double): MxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MxRecord]
  }
}

