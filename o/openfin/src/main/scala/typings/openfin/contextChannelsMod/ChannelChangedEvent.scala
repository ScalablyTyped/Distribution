package typings.openfin.contextChannelsMod

import typings.openfin.identityMod.Identity
import typings.openfin.openfinStrings.`channel-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelChangedEvent extends js.Object {
  
  /**
    * The channel that the window now belongs to.
    *
    * Will be `null` if the window has just been closed, and so is being removed from a channel without being added to
    * another.
    */
  var channel: Channel | Null = js.native
  
  /**
    * The window that has switched channel.
    */
  var identity: Identity = js.native
  
  /**
    * The previous channel that the window belonged to.
    *
    * Will be `null` if the window has just been created, and so doesn't have a previous channel.
    */
  var previousChannel: Channel | Null = js.native
  
  var `type`: `channel-changed` = js.native
}
object ChannelChangedEvent {
  
  @scala.inline
  def apply(identity: Identity, `type`: `channel-changed`): ChannelChangedEvent = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelChangedEvent]
  }
  
  @scala.inline
  implicit class ChannelChangedEventOps[Self <: ChannelChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setIdentity(value: Identity): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `channel-changed`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNull: Self = this.set("channel", null)
    
    @scala.inline
    def setPreviousChannel(value: Channel): Self = this.set("previousChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousChannelNull: Self = this.set("previousChannel", null)
  }
}
