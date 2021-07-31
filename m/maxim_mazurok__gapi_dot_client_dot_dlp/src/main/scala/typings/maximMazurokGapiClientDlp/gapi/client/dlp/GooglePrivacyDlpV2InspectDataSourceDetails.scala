package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InspectDataSourceDetails extends StObject {
  
  /** The configuration used for this job. */
  var requestedOptions: js.UndefOr[GooglePrivacyDlpV2RequestedOptions] = js.undefined
  
  /** A summary of the outcome of this inspect job. */
  var result: js.UndefOr[GooglePrivacyDlpV2Result] = js.undefined
}
object GooglePrivacyDlpV2InspectDataSourceDetails {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectDataSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectDataSourceDetails]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectDataSourceDetailsMutableBuilder[Self <: GooglePrivacyDlpV2InspectDataSourceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedOptions(value: GooglePrivacyDlpV2RequestedOptions): Self = StObject.set(x, "requestedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedOptionsUndefined: Self = StObject.set(x, "requestedOptions", js.undefined)
    
    @scala.inline
    def setResult(value: GooglePrivacyDlpV2Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
