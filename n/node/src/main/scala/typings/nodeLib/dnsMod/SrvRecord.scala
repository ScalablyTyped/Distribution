package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SrvRecord extends js.Object {
  var name: java.lang.String
  var port: scala.Double
  var priority: scala.Double
  var weight: scala.Double
}

object SrvRecord {
  @scala.inline
  def apply(name: java.lang.String, port: scala.Double, priority: scala.Double, weight: scala.Double): SrvRecord = {
    val __obj = js.Dynamic.literal(name = name, port = port, priority = priority, weight = weight)
  
    __obj.asInstanceOf[SrvRecord]
  }
}

