package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SrvRecord extends js.Object {
  var name: java.lang.String
  var port: Double
  var priority: Double
  var weight: Double
}

object SrvRecord {
  @scala.inline
  def apply(name: java.lang.String, port: Double, priority: Double, weight: Double): SrvRecord = {
    val __obj = js.Dynamic.literal(name = name, port = port, priority = priority, weight = weight)
  
    __obj.asInstanceOf[SrvRecord]
  }
}

