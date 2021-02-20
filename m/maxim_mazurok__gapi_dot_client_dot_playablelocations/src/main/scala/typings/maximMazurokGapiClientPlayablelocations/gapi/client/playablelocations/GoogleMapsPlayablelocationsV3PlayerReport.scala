package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3PlayerReport extends StObject {
  
  /**
    * Language code (in BCP-47 format) indicating the language of the freeform description provided in `reason_details`. Examples are "en", "en-US" or "ja-Latn". For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Required. The name of the playable location. */
  var locationName: js.UndefOr[String] = js.native
  
  /** Required. A free-form description detailing why the playable location is considered bad. */
  var reasonDetails: js.UndefOr[String] = js.native
  
  /** Required. One or more reasons why this playable location is considered bad. */
  var reasons: js.UndefOr[js.Array[String]] = js.native
}
object GoogleMapsPlayablelocationsV3PlayerReport {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3PlayerReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3PlayerReport]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3PlayerReportMutableBuilder[Self <: GoogleMapsPlayablelocationsV3PlayerReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setLocationName(value: String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
    
    @scala.inline
    def setReasonDetails(value: String): Self = StObject.set(x, "reasonDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonDetailsUndefined: Self = StObject.set(x, "reasonDetails", js.undefined)
    
    @scala.inline
    def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    @scala.inline
    def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value :_*))
  }
}
