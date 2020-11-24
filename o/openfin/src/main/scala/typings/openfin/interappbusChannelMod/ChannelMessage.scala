package typings.openfin.interappbusChannelMod

import typings.openfin.identityMod.Identity
import typings.openfin.shapesIdentityMod.ProviderIdentity
import typings.openfin.transportMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMessage
  extends Message[js.Any] {
  
  var ackToSender: js.Any = js.native
  
  var connectAction: Boolean = js.native
  
  var providerIdentity: ProviderIdentity = js.native
  
  var senderIdentity: Identity = js.native
}
object ChannelMessage {
  
  @scala.inline
  def apply(
    ackToSender: js.Any,
    action: String,
    connectAction: Boolean,
    payload: js.Any,
    providerIdentity: ProviderIdentity,
    senderIdentity: Identity
  ): ChannelMessage = {
    val __obj = js.Dynamic.literal(ackToSender = ackToSender.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], connectAction = connectAction.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], providerIdentity = providerIdentity.asInstanceOf[js.Any], senderIdentity = senderIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMessage]
  }
  
  @scala.inline
  implicit class ChannelMessageOps[Self <: ChannelMessage] (val x: Self) extends AnyVal {
    
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
    def setAckToSender(value: js.Any): Self = this.set("ackToSender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectAction(value: Boolean): Self = this.set("connectAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdentity(value: ProviderIdentity): Self = this.set("providerIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderIdentity(value: Identity): Self = this.set("senderIdentity", value.asInstanceOf[js.Any])
  }
}
