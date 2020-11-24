package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.venue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultVenue
  extends InlineQueryResultLocationBase
     with InlineQueryResult {
  
  var address: String = js.native
  
  var foursquare_id: js.UndefOr[String] = js.native
  
  var `type`: venue = js.native
}
object InlineQueryResultVenue {
  
  @scala.inline
  def apply(address: String, id: String, latitude: Double, longitude: Double, title: String, `type`: venue): InlineQueryResultVenue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVenue]
  }
  
  @scala.inline
  implicit class InlineQueryResultVenueOps[Self <: InlineQueryResultVenue] (val x: Self) extends AnyVal {
    
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
    def setType(value: venue): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoursquare_id(value: String): Self = this.set("foursquare_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoursquare_id: Self = this.set("foursquare_id", js.undefined)
  }
}
