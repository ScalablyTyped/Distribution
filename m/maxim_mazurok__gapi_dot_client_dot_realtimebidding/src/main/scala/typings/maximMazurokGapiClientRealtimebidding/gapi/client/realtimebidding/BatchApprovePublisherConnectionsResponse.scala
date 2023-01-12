package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchApprovePublisherConnectionsResponse extends StObject {
  
  /** The publisher connections that have been approved. */
  var publisherConnections: js.UndefOr[js.Array[PublisherConnection]] = js.undefined
}
object BatchApprovePublisherConnectionsResponse {
  
  inline def apply(): BatchApprovePublisherConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchApprovePublisherConnectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchApprovePublisherConnectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setPublisherConnections(value: js.Array[PublisherConnection]): Self = StObject.set(x, "publisherConnections", value.asInstanceOf[js.Any])
    
    inline def setPublisherConnectionsUndefined: Self = StObject.set(x, "publisherConnections", js.undefined)
    
    inline def setPublisherConnectionsVarargs(value: PublisherConnection*): Self = StObject.set(x, "publisherConnections", js.Array(value*))
  }
}
