package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends js.Object {
  
  var pipe: js.UndefOr[Pipe] = js.native
  
  var socketAddress: js.UndefOr[SocketAddress] = js.native
}
object Address {
  
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPipe(value: Pipe): Self = this.set("pipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipe: Self = this.set("pipe", js.undefined)
    
    @scala.inline
    def setSocketAddress(value: SocketAddress): Self = this.set("socketAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketAddress: Self = this.set("socketAddress", js.undefined)
  }
}
