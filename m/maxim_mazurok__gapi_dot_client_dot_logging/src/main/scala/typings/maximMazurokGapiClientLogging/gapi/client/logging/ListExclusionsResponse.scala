package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExclusionsResponse extends StObject {
  
  /** A list of exclusions. */
  var exclusions: js.UndefOr[js.Array[LogExclusion]] = js.undefined
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListExclusionsResponse {
  
  inline def apply(): ListExclusionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExclusionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExclusionsResponse] (val x: Self) extends AnyVal {
    
    inline def setExclusions(value: js.Array[LogExclusion]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: LogExclusion*): Self = StObject.set(x, "exclusions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
