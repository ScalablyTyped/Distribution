package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBucketsResponse extends StObject {
  
  /** A list of buckets. */
  var buckets: js.UndefOr[js.Array[LogBucket]] = js.undefined
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBucketsResponse {
  
  inline def apply(): ListBucketsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsResponse]
  }
  
  extension [Self <: ListBucketsResponse](x: Self) {
    
    inline def setBuckets(value: js.Array[LogBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: LogBucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
