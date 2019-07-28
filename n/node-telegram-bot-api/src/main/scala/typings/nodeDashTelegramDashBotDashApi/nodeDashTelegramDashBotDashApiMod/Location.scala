package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var latitude: Double
  var longitude: Double
}

object Location {
  @scala.inline
  def apply(latitude: Double, longitude: Double): Location = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[Location]
  }
}

