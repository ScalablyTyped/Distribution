package typings.openfin.contextChannelsMod

import typings.openfin.contextMod.Context
import typings.openfin.mainMod.ContextListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.mainMod.Listener because Already inherited */ @js.native
trait ChannelContextListener extends ContextListener {
  /**
    * The channel that this listener is observing.
    *
    * Listener will trigger whenever a context is broadcast on this channel.
    */
  var channel: Channel = js.native
}

object ChannelContextListener {
  @scala.inline
  def apply(channel: Channel, handler: Context => Unit, unsubscribe: () => Unit): ChannelContextListener = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[ChannelContextListener]
  }
  @scala.inline
  implicit class ChannelContextListenerOps[Self <: ChannelContextListener] (val x: Self) extends AnyVal {
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
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
  
}

