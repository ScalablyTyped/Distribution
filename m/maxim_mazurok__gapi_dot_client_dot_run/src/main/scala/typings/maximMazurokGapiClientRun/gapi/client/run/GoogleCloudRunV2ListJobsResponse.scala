package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ListJobsResponse extends StObject {
  
  /** The resulting list of Jobs. */
  var jobs: js.UndefOr[js.Array[GoogleCloudRunV2Job]] = js.undefined
  
  /** A token indicating there are more items than page_size. Use it in the next ListJobs request to continue. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2ListJobsResponse {
  
  inline def apply(): GoogleCloudRunV2ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ListJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2ListJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: js.Array[GoogleCloudRunV2Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: GoogleCloudRunV2Job*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
