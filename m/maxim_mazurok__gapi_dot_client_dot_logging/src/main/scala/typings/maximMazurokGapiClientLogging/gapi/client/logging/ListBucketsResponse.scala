package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketsResponse extends StObject {
  
  /** A list of buckets. */
  var buckets: js.UndefOr[js.Array[LogBucket]] = js.native
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of
    * nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListBucketsResponse {
  
  @scala.inline
  def apply(): ListBucketsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsResponse]
  }
  
  @scala.inline
  implicit class ListBucketsResponseMutableBuilder[Self <: ListBucketsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[LogBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: LogBucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
