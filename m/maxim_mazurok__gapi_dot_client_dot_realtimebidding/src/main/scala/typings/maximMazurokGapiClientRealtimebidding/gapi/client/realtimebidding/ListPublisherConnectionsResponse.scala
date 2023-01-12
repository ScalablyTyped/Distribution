package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPublisherConnectionsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListPublisherConnectionsRequest.pageToken field in the subsequent call to the `ListPublisherConnections` method
    * to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of publisher connections. */
  var publisherConnections: js.UndefOr[js.Array[PublisherConnection]] = js.undefined
}
object ListPublisherConnectionsResponse {
  
  inline def apply(): ListPublisherConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublisherConnectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPublisherConnectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPublisherConnections(value: js.Array[PublisherConnection]): Self = StObject.set(x, "publisherConnections", value.asInstanceOf[js.Any])
    
    inline def setPublisherConnectionsUndefined: Self = StObject.set(x, "publisherConnections", js.undefined)
    
    inline def setPublisherConnectionsVarargs(value: PublisherConnection*): Self = StObject.set(x, "publisherConnections", js.Array(value*))
  }
}
