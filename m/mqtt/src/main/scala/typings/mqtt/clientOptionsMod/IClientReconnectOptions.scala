package typings.mqtt.clientOptionsMod

import typings.mqtt.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientReconnectOptions extends js.Object {
  
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[Store] = js.native
  
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[Store] = js.native
}
object IClientReconnectOptions {
  
  @scala.inline
  def apply(): IClientReconnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReconnectOptions]
  }
  
  @scala.inline
  implicit class IClientReconnectOptionsOps[Self <: IClientReconnectOptions] (val x: Self) extends AnyVal {
    
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
    def setIncomingStore(value: Store): Self = this.set("incomingStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingStore: Self = this.set("incomingStore", js.undefined)
    
    @scala.inline
    def setOutgoingStore(value: Store): Self = this.set("outgoingStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingStore: Self = this.set("outgoingStore", js.undefined)
  }
}
