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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[SrvRecord]
  }
}

