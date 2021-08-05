package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewsResponse extends StObject {
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of views. */
  var views: js.UndefOr[js.Array[LogView]] = js.undefined
}
object ListViewsResponse {
  
  inline def apply(): ListViewsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewsResponse]
  }
  
  extension [Self <: ListViewsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setViews(value: js.Array[LogView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: LogView*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
