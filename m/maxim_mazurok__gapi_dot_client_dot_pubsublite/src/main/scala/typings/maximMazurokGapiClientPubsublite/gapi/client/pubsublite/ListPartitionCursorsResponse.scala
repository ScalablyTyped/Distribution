package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartitionCursorsResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The partition cursors from this request. */
  var partitionCursors: js.UndefOr[js.Array[PartitionCursor]] = js.undefined
}
object ListPartitionCursorsResponse {
  
  inline def apply(): ListPartitionCursorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartitionCursorsResponse]
  }
  
  extension [Self <: ListPartitionCursorsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartitionCursors(value: js.Array[PartitionCursor]): Self = StObject.set(x, "partitionCursors", value.asInstanceOf[js.Any])
    
    inline def setPartitionCursorsUndefined: Self = StObject.set(x, "partitionCursors", js.undefined)
    
    inline def setPartitionCursorsVarargs(value: PartitionCursor*): Self = StObject.set(x, "partitionCursors", js.Array(value*))
  }
}
