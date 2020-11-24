package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendVenueOptions extends SendBasicOptions {
  
  var foursquare_id: js.UndefOr[String] = js.native
}
object SendVenueOptions {
  
  @scala.inline
  def apply(): SendVenueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVenueOptions]
  }
  
  @scala.inline
  implicit class SendVenueOptionsOps[Self <: SendVenueOptions] (val x: Self) extends AnyVal {
    
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
    def setFoursquare_id(value: String): Self = this.set("foursquare_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoursquare_id: Self = this.set("foursquare_id", js.undefined)
  }
}
