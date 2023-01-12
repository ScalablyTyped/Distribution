package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ListJobsResponse extends StObject {
  
  /** The list of jobs. */
  var jobs: js.UndefOr[js.Array[GoogleCloudMlV1Job]] = js.undefined
  
  /** Optional. Pass this token as the `page_token` field of the request for a subsequent call. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1ListJobsResponse {
  
  inline def apply(): GoogleCloudMlV1ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1ListJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: js.Array[GoogleCloudMlV1Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: GoogleCloudMlV1Job*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
