package typings.messenger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messenger extends StObject {
  
  /**
    * Hides all messages.
    */
  def hideAll(): Unit
  
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message
}
object Messenger {
  
  inline def apply(hideAll: () => Unit, post: MessageOptions => Message): Messenger = {
    val __obj = js.Dynamic.literal(hideAll = js.Any.fromFunction0(hideAll), post = js.Any.fromFunction1(post))
    __obj.asInstanceOf[Messenger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Messenger] (val x: Self) extends AnyVal {
    
    inline def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
    
    inline def setPost(value: MessageOptions => Message): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
  }
}
