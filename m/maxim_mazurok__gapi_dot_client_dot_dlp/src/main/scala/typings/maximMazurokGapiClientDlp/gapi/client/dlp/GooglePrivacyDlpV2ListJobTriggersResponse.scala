package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ListJobTriggersResponse extends StObject {
  
  /** List of triggeredJobs, up to page_size in ListJobTriggersRequest. */
  var jobTriggers: js.UndefOr[js.Array[GooglePrivacyDlpV2JobTrigger]] = js.undefined
  
  /** If the next page is available then the next page token to be used in following ListJobTriggers request. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2ListJobTriggersResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ListJobTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListJobTriggersResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ListJobTriggersResponseMutableBuilder[Self <: GooglePrivacyDlpV2ListJobTriggersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTriggers(value: js.Array[GooglePrivacyDlpV2JobTrigger]): Self = StObject.set(x, "jobTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTriggersUndefined: Self = StObject.set(x, "jobTriggers", js.undefined)
    
    @scala.inline
    def setJobTriggersVarargs(value: GooglePrivacyDlpV2JobTrigger*): Self = StObject.set(x, "jobTriggers", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
