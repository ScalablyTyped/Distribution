package typings
package plugapiLib.plugapiMod.PlugAPINs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Notification]
  }
}

