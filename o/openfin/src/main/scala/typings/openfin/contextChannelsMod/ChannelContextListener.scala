package typings.openfin.contextChannelsMod

import typings.openfin.contextMod.Context
import typings.openfin.mainMod.ContextListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.mainMod.Listener because Already inherited */ trait ChannelContextListener extends ContextListener {
  /**
    * The channel that this listener is observing.
    *
    * Listener will trigger whenever a context is broadcast on this channel.
    */
  var channel: Channel
}

object ChannelContextListener {
  @scala.inline
  def apply(channel: Channel, handler: Context => Unit, unsubscribe: () => Unit): ChannelContextListener = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[ChannelContextListener]
  }
}

