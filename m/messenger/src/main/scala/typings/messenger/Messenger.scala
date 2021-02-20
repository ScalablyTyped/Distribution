package typings.messenger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messenger extends StObject {
  
  /**
    * Hides all messages.
    */
  def hideAll(): Unit = js.native
  
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message = js.native
}
object Messenger {
  
  @scala.inline
  def apply(hideAll: () => Unit, post: MessageOptions => Message): Messenger = {
    val __obj = js.Dynamic.literal(hideAll = js.Any.fromFunction0(hideAll), post = js.Any.fromFunction1(post))
    __obj.asInstanceOf[Messenger]
  }
  
  @scala.inline
  implicit class MessengerMutableBuilder[Self <: Messenger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideAll(value: () => Unit): Self = StObject.set(x, "hideAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPost(value: MessageOptions => Message): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
  }
}
