package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputVenueMessageContent extends InputLocationMessageContent {
  var address: java.lang.String
  var foursquare_id: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object InputVenueMessageContent {
  @scala.inline
  def apply(
    address: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    foursquare_id: java.lang.String = null
  ): InputVenueMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("title")(title)
    if (foursquare_id != null) __obj.updateDynamic("foursquare_id")(foursquare_id)
    __obj.asInstanceOf[InputVenueMessageContent]
  }
}

