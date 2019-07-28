package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Venue extends js.Object {
  var address: String
  var foursquare_id: js.UndefOr[String] = js.undefined
  var location: Location
  var title: String
}

object Venue {
  @scala.inline
  def apply(address: String, location: Location, title: String, foursquare_id: String = null): Venue = {
    val __obj = js.Dynamic.literal(address = address, location = location, title = title)
    if (foursquare_id != null) __obj.updateDynamic("foursquare_id")(foursquare_id)
    __obj.asInstanceOf[Venue]
  }
}

