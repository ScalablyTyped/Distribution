package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Venue extends StObject {
  
  var address: String
  
  var foursquare_id: js.UndefOr[String] = js.undefined
  
  var foursquare_type: js.UndefOr[String] = js.undefined
  
  var location: Location
  
  var title: String
}
object Venue {
  
  inline def apply(address: String, location: Location, title: String): Venue = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Venue]
  }
  
  extension [Self <: Venue](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setFoursquare_id(value: String): Self = StObject.set(x, "foursquare_id", value.asInstanceOf[js.Any])
    
    inline def setFoursquare_idUndefined: Self = StObject.set(x, "foursquare_id", js.undefined)
    
    inline def setFoursquare_type(value: String): Self = StObject.set(x, "foursquare_type", value.asInstanceOf[js.Any])
    
    inline def setFoursquare_typeUndefined: Self = StObject.set(x, "foursquare_type", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
