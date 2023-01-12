package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsPlayablelocationsV3PlayerReport extends StObject {
  
  /**
    * Language code (in BCP-47 format) indicating the language of the freeform description provided in `reason_details`. Examples are "en", "en-US" or "ja-Latn". For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the playable location. */
  var locationName: js.UndefOr[String] = js.undefined
  
  /** Required. A free-form description detailing why the playable location is considered bad. */
  var reasonDetails: js.UndefOr[String] = js.undefined
  
  /** Required. One or more reasons why this playable location is considered bad. */
  var reasons: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleMapsPlayablelocationsV3PlayerReport {
  
  inline def apply(): GoogleMapsPlayablelocationsV3PlayerReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3PlayerReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleMapsPlayablelocationsV3PlayerReport] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLocationName(value: String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
    
    inline def setReasonDetails(value: String): Self = StObject.set(x, "reasonDetails", value.asInstanceOf[js.Any])
    
    inline def setReasonDetailsUndefined: Self = StObject.set(x, "reasonDetails", js.undefined)
    
    inline def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value*))
  }
}
