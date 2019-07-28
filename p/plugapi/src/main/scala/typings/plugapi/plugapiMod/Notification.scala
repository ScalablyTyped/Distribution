package typings.plugapi.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var action: String
  var id: Double
  var timestamp: String
  var value: String
}

object Notification {
  @scala.inline
  def apply(action: String, id: Double, timestamp: String, value: String): Notification = {
    val __obj = js.Dynamic.literal(action = action, id = id, timestamp = timestamp, value = value)
  
    __obj.asInstanceOf[Notification]
  }
}

