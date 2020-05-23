package typings.openfin.mainMod

import typings.openfin.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentListener extends Listener {
  /**
    * The intent name that we are listening to. Is whatever is passed into [[addIntentListener]].
    */
  var intent: String
  /**
    * The handler for when this listener receives an intent.
    */
  def handler(context: Context): js.Any | js.Promise[_]
  /**
    * Unsubscribe the listener object. We will no longer receive intent messages on this handler.
    *
    * Calling this method has no effect if the listener has already been unsubscribed. To re-subscribe, call
    * [[addIntentListener]] again to create a new listener object.
    */
  def unsubscribe(): Unit
}

object IntentListener {
  @scala.inline
  def apply(handler: Context => js.Any | js.Promise[_], intent: String, unsubscribe: () => Unit): IntentListener = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), intent = intent.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[IntentListener]
  }
}

