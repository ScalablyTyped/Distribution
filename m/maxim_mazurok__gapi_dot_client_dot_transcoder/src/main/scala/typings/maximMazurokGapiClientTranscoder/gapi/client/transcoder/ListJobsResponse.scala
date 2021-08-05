package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsResponse extends StObject {
  
  /** List of jobs in the specified region. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  
  /** The pagination token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListJobsResponse {
  
  inline def apply(): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsResponse]
  }
  
  extension [Self <: ListJobsResponse](x: Self) {
    
    inline def setJobs(value: js.Array[Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
