package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Place extends StObject {
  
  /** Output-only. The language_code that the name is localized with. This should be the language_code specified in the request, but may be a fallback. */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Output-only. The name of the place, localized to the language_code. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Place identifier, as described in https://developers.google.com/places/place-id. */
  var placeId: js.UndefOr[String] = js.undefined
}
object Place {
  
  inline def apply(): Place = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Place]
  }
  
  extension [Self <: Place](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
  }
}
