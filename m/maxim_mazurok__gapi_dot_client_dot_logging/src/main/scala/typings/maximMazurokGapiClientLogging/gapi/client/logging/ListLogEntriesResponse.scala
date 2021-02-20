package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLogEntriesResponse extends StObject {
  
  /** A list of log entries. If entries is empty, nextPageToken may still be returned, indicating that more entries may exist. See nextPageToken for more information. */
  var entries: js.UndefOr[js.Array[LogEntry]] = js.native
  
  /**
    * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method again using the value of
    * nextPageToken as pageToken.If a value for next_page_token appears and the entries field is empty, it means that the search found no log entries so far but it did not have time to
    * search all the possible log entries. Retry the method with this value for page_token to continue the search. Alternatively, consider speeding up the search by changing your filter
    * to specify a single log name or resource type, or to narrow the time range of the search.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListLogEntriesResponse {
  
  @scala.inline
  def apply(): ListLogEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogEntriesResponse]
  }
  
  @scala.inline
  implicit class ListLogEntriesResponseMutableBuilder[Self <: ListLogEntriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[LogEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: LogEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
