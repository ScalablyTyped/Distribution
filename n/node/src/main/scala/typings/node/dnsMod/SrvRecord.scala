package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SrvRecord extends js.Object {
  var name: String
  var port: Double
  var priority: Double
  var weight: Double
}

object SrvRecord {
  @scala.inline
  def apply(name: String, port: Double, priority: Double, weight: Double): SrvRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SrvRecord]
  }
}

