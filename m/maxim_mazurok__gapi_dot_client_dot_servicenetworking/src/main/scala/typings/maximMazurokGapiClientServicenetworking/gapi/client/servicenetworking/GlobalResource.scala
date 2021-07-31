package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalResource extends StObject {
  
  var networks: NetworksResource
}
object GlobalResource {
  
  @scala.inline
  def apply(networks: NetworksResource): GlobalResource = {
    val __obj = js.Dynamic.literal(networks = networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalResource]
  }
  
  @scala.inline
  implicit class GlobalResourceMutableBuilder[Self <: GlobalResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworks(value: NetworksResource): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
  }
}
