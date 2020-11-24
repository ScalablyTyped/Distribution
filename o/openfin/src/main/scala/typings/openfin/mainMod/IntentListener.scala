package typings.openfin.mainMod

import typings.openfin.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentListener extends Listener {
  
  /**
    * The handler for when this listener receives an intent.
    */
  def handler(context: Context): js.Any | js.Promise[_] = js.native
  
  /**
    * The intent name that we are listening to. Is whatever is passed into [[addIntentListener]].
    */
  var intent: String = js.native
  
  /**
    * Unsubscribe the listener object. We will no longer receive intent messages on this handler.
    *
    * Calling this method has no effect if the listener has already been unsubscribed. To re-subscribe, call
    * [[addIntentListener]] again to create a new listener object.
    */
  def unsubscribe(): Unit = js.native
}
object IntentListener {
  
  @scala.inline
  def apply(handler: Context => js.Any | js.Promise[_], intent: String, unsubscribe: () => Unit): IntentListener = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), intent = intent.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[IntentListener]
  }
  
  @scala.inline
  implicit class IntentListenerOps[Self <: IntentListener] (val x: Self) extends AnyVal {
    
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
    def setHandler(value: Context => js.Any | js.Promise[_]): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
  }
}
