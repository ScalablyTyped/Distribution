package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Place extends StObject {
  
  /** Output-only. The language_code that the name is localized with. This should be the language_code specified in the request, but may be a fallback. */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Output-only. The name of the place, localized to the language_code. */
  var name: js.UndefOr[String] = js.native
  
  /** Place identifier, as described in https://developers.google.com/places/place-id. */
  var placeId: js.UndefOr[String] = js.native
}
object Place {
  
  @scala.inline
  def apply(): Place = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Place]
  }
  
  @scala.inline
  implicit class PlaceMutableBuilder[Self <: Place] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
  }
}
