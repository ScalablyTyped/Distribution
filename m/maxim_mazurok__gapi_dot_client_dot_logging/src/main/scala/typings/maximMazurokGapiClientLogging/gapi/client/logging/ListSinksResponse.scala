package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSinksResponse extends StObject {
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of sinks. */
  var sinks: js.UndefOr[js.Array[LogSink]] = js.undefined
}
object ListSinksResponse {
  
  inline def apply(): ListSinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSinksResponse]
  }
  
  extension [Self <: ListSinksResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSinks(value: js.Array[LogSink]): Self = StObject.set(x, "sinks", value.asInstanceOf[js.Any])
    
    inline def setSinksUndefined: Self = StObject.set(x, "sinks", js.undefined)
    
    inline def setSinksVarargs(value: LogSink*): Self = StObject.set(x, "sinks", js.Array(value :_*))
  }
}
