package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicsResponse extends StObject {
  
  /** If not empty, indicates that there may be more topics that match the request; this value should be passed in a new `ListTopicsRequest`. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The resulting topics. */
  var topics: js.UndefOr[js.Array[Topic]] = js.undefined
}
object ListTopicsResponse {
  
  inline def apply(): ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsResponse]
  }
  
  extension [Self <: ListTopicsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTopics(value: js.Array[Topic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
