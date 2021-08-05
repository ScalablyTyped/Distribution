package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var pipe: js.UndefOr[Pipe] = js.undefined
  
  var socketAddress: js.UndefOr[SocketAddress] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setPipe(value: Pipe): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    
    inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
    
    inline def setSocketAddress(value: SocketAddress): Self = StObject.set(x, "socketAddress", value.asInstanceOf[js.Any])
    
    inline def setSocketAddressUndefined: Self = StObject.set(x, "socketAddress", js.undefined)
  }
}
