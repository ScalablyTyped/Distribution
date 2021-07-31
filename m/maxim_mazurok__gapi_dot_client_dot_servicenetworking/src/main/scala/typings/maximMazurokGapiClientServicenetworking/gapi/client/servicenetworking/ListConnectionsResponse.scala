package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectionsResponse extends StObject {
  
  /** The list of Connections. */
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
}
object ListConnectionsResponse {
  
  @scala.inline
  def apply(): ListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsResponse]
  }
  
  @scala.inline
  implicit class ListConnectionsResponseMutableBuilder[Self <: ListConnectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value :_*))
  }
}
