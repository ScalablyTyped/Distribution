package typings
package plugapiLib.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var action: java.lang.String
  var id: scala.Double
  var timestamp: java.lang.String
  var value: java.lang.String
}

object Notification {
  @scala.inline
  def apply(action: java.lang.String, id: scala.Double, timestamp: java.lang.String, value: java.lang.String): Notification = {
    val __obj = js.Dynamic.literal(action = action, id = id, timestamp = timestamp, value = value)
  
    __obj.asInstanceOf[Notification]
  }
}

