package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThreadsResponse extends StObject {
  
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Estimated total number of results. */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
  
  /** List of threads. Note that each thread resource does not contain a list of `messages`. The list of `messages` for a given thread can be fetched using the threads.get method. */
  var threads: js.UndefOr[js.Array[Thread]] = js.native
}
object ListThreadsResponse {
  
  @scala.inline
  def apply(): ListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThreadsResponse]
  }
  
  @scala.inline
  implicit class ListThreadsResponseMutableBuilder[Self <: ListThreadsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResultSizeEstimate(value: Double): Self = StObject.set(x, "resultSizeEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSizeEstimateUndefined: Self = StObject.set(x, "resultSizeEstimate", js.undefined)
    
    @scala.inline
    def setThreads(value: js.Array[Thread]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    @scala.inline
    def setThreadsVarargs(value: Thread*): Self = StObject.set(x, "threads", js.Array(value :_*))
  }
}
