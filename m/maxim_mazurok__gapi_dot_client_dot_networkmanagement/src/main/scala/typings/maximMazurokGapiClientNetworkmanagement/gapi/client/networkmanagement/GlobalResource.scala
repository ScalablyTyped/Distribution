package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalResource extends StObject {
  
  var connectivityTests: ConnectivityTestsResource
  
  var operations: OperationsResource
}
object GlobalResource {
  
  @scala.inline
  def apply(connectivityTests: ConnectivityTestsResource, operations: OperationsResource): GlobalResource = {
    val __obj = js.Dynamic.literal(connectivityTests = connectivityTests.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalResource]
  }
  
  @scala.inline
  implicit class GlobalResourceMutableBuilder[Self <: GlobalResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectivityTests(value: ConnectivityTestsResource): Self = StObject.set(x, "connectivityTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
