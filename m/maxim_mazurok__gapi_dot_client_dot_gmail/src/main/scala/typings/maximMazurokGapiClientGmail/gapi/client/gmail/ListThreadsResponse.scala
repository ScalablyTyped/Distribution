package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThreadsResponse extends StObject {
  
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[Double] = js.undefined
  
  /** List of threads. Note that each thread resource does not contain a list of `messages`. The list of `messages` for a given thread can be fetched using the threads.get method. */
  var threads: js.UndefOr[js.Array[Thread]] = js.undefined
}
object ListThreadsResponse {
  
  inline def apply(): ListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThreadsResponse]
  }
  
  extension [Self <: ListThreadsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
    
    inline def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
    
    inline def setThreads(value: js.Array[Thread]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setThreadsVarargs(value: Thread*): Self = StObject.set(x, "threads", js.Array(value*))
  }
}
