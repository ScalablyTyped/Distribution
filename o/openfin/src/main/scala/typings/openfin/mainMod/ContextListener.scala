package typings.openfin.mainMod

import typings.openfin.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextListener extends Listener {
  /**
    * The handler for when this listener receives a context broadcast.
    */
  def handler(context: Context): Unit
  /**
    * Unsubscribe the listener object. We will no longer receive context messages on this handler.
    *
    * Calling this method has no effect if the listener has already been unsubscribed. To re-subscribe, call
    * [[addContextListener]] again to create a new listener object.
    */
  def unsubscribe(): Unit
}

object ContextListener {
  @scala.inline
  def apply(handler: Context => Unit, unsubscribe: () => Unit): ContextListener = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[ContextListener]
  }
}

