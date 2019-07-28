package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputVenueMessageContent extends InputLocationMessageContent {
  var address: String
  var foursquare_id: js.UndefOr[String] = js.undefined
  var title: String
}

object InputVenueMessageContent {
  @scala.inline
  def apply(address: String, latitude: Double, longitude: Double, title: String, foursquare_id: String = null): InputVenueMessageContent = {
    val __obj = js.Dynamic.literal(address = address, latitude = latitude, longitude = longitude, title = title)
    if (foursquare_id != null) __obj.updateDynamic("foursquare_id")(foursquare_id)
    __obj.asInstanceOf[InputVenueMessageContent]
  }
}

