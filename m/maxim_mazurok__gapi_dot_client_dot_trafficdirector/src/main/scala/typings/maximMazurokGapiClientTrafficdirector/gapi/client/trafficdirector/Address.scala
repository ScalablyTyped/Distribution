package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var pipe: js.UndefOr[Pipe] = js.undefined
  
  var socketAddress: js.UndefOr[SocketAddress] = js.undefined
}
object Address {
  
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipe(value: Pipe): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
    
    @scala.inline
    def setSocketAddress(value: SocketAddress): Self = StObject.set(x, "socketAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketAddressUndefined: Self = StObject.set(x, "socketAddress", js.undefined)
  }
}
