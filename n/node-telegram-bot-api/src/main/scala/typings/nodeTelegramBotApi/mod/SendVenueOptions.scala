package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendVenueOptions
  extends StObject
     with SendBasicOptions {
  
  var foursquare_id: js.UndefOr[String] = js.undefined
}
object SendVenueOptions {
  
  inline def apply(): SendVenueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVenueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendVenueOptions] (val x: Self) extends AnyVal {
    
    inline def setFoursquare_id(value: String): Self = StObject.set(x, "foursquare_id", value.asInstanceOf[js.Any])
    
    inline def setFoursquare_idUndefined: Self = StObject.set(x, "foursquare_id", js.undefined)
  }
}
