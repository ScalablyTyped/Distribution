package typings.openfin.mainMod

import typings.openfin.contextChannelsMod.Channel
import typings.openfin.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.openfin.mainMod.ContextListener
  - typings.openfin.mainMod.IntentListener
  - typings.openfin.contextChannelsMod.ChannelContextListener
*/
trait Listener extends js.Object
object Listener {
  
  @scala.inline
  def ContextListener(handler: Context => Unit, unsubscribe: () => Unit): Listener = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  def IntentListener(handler: Context => js.Any | js.Promise[_], intent: String, unsubscribe: () => Unit): Listener = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), intent = intent.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  def ChannelContextListener(channel: Channel, handler: Context => Unit, unsubscribe: () => Unit): Listener = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Listener]
  }
}
