package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Venue extends js.Object {
  var address: String = js.native
  var foursquare_id: js.UndefOr[String] = js.native
  var foursquare_type: js.UndefOr[String] = js.native
  var location: Location = js.native
  var title: String = js.native
}

object Venue {
  @scala.inline
  def apply(address: String, location: Location, title: String): Venue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Venue]
  }
  @scala.inline
  implicit class VenueOps[Self <: Venue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setFoursquare_id(value: String): Self = this.set("foursquare_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoursquare_id: Self = this.set("foursquare_id", js.undefined)
    @scala.inline
    def setFoursquare_type(value: String): Self = this.set("foursquare_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoursquare_type: Self = this.set("foursquare_type", js.undefined)
  }
  
}

