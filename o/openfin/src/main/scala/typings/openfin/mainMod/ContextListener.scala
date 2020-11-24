package typings.openfin.mainMod

import typings.openfin.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextListener extends Listener {
  
  /**
    * The handler for when this listener receives a context broadcast.
    */
  def handler(context: Context): Unit = js.native
  
  /**
    * Unsubscribe the listener object. We will no longer receive context messages on this handler.
    *
    * Calling this method has no effect if the listener has already been unsubscribed. To re-subscribe, call
    * [[addContextListener]] again to create a new listener object.
    */
  def unsubscribe(): Unit = js.native
}
object ContextListener {
  
  @scala.inline
  def apply(handler: Context => Unit, unsubscribe: () => Unit): ContextListener = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[ContextListener]
  }
  
  @scala.inline
  implicit class ContextListenerOps[Self <: ContextListener] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: Context => Unit): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
  }
}
