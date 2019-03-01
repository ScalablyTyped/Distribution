package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Venue extends js.Object {
  var address: java.lang.String
  var foursquare_id: js.UndefOr[java.lang.String] = js.undefined
  var location: Location
  var title: java.lang.String
}

object Venue {
  @scala.inline
  def apply(
    address: java.lang.String,
    location: Location,
    title: java.lang.String,
    foursquare_id: java.lang.String = null
  ): Venue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("title")(title)
    if (foursquare_id != null) __obj.updateDynamic("foursquare_id")(foursquare_id)
    __obj.asInstanceOf[Venue]
  }
}

