package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionIdsRequest extends StObject {
  
  /** The maximum number of results to return. */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /** A page token. Must be a value from ListCollectionIdsResponse. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Reads documents as they were at the given time. This may not be older than 270 seconds. */
  var readTime: js.UndefOr[String] = js.undefined
}
object ListCollectionIdsRequest {
  
  inline def apply(): ListCollectionIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionIdsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCollectionIdsRequest] (val x: Self) extends AnyVal {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
