package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3PlayerReport extends js.Object {
  
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
  implicit class GoogleMapsPlayablelocationsV3PlayerReportOps[Self <: GoogleMapsPlayablelocationsV3PlayerReport] (val x: Self) extends AnyVal {
    
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
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setLocationName(value: String): Self = this.set("locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationName: Self = this.set("locationName", js.undefined)
    
    @scala.inline
    def setReasonDetails(value: String): Self = this.set("reasonDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonDetails: Self = this.set("reasonDetails", js.undefined)
    
    @scala.inline
    def setReasonsVarargs(value: String*): Self = this.set("reasons", js.Array(value :_*))
    
    @scala.inline
    def setReasons(value: js.Array[String]): Self = this.set("reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasons: Self = this.set("reasons", js.undefined)
  }
}
