package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogsResponse extends StObject {
  
  /** A list of log names. For example, "projects/my-project/logs/syslog" or "organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity". */
  var logNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then nextPageToken is included. To get the next set of results, call this method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLogsResponse {
  
  inline def apply(): ListLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogsResponse]
  }
  
  extension [Self <: ListLogsResponse](x: Self) {
    
    inline def setLogNames(value: js.Array[String]): Self = StObject.set(x, "logNames", value.asInstanceOf[js.Any])
    
    inline def setLogNamesUndefined: Self = StObject.set(x, "logNames", js.undefined)
    
    inline def setLogNamesVarargs(value: String*): Self = StObject.set(x, "logNames", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
