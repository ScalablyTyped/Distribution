package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ListDlpJobsResponse extends StObject {
  
  /** A list of DlpJobs that matches the specified filter in the request. */
  var jobs: js.UndefOr[js.Array[GooglePrivacyDlpV2DlpJob]] = js.undefined
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2ListDlpJobsResponse {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ListDlpJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListDlpJobsResponse]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ListDlpJobsResponseMutableBuilder[Self <: GooglePrivacyDlpV2ListDlpJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: js.Array[GooglePrivacyDlpV2DlpJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: GooglePrivacyDlpV2DlpJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
