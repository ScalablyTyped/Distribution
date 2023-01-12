package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRejectPublisherConnectionsResponse extends StObject {
  
  /** The publisher connections that have been rejected. */
  var publisherConnections: js.UndefOr[js.Array[PublisherConnection]] = js.undefined
}
object BatchRejectPublisherConnectionsResponse {
  
  inline def apply(): BatchRejectPublisherConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRejectPublisherConnectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchRejectPublisherConnectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setPublisherConnections(value: js.Array[PublisherConnection]): Self = StObject.set(x, "publisherConnections", value.asInstanceOf[js.Any])
    
    inline def setPublisherConnectionsUndefined: Self = StObject.set(x, "publisherConnections", js.undefined)
    
    inline def setPublisherConnectionsVarargs(value: PublisherConnection*): Self = StObject.set(x, "publisherConnections", js.Array(value*))
  }
}
