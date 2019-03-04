package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object Location {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): Location = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[Location]
  }
}

