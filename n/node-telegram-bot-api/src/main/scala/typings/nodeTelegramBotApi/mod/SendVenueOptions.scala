package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
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
  implicit class SendVenueOptionsMutableBuilder[Self <: SendVenueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFoursquare_id(value: String): Self = StObject.set(x, "foursquare_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoursquare_idUndefined: Self = StObject.set(x, "foursquare_id", js.undefined)
  }
}
