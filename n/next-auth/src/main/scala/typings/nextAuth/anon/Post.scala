package typings.nextAuth.anon

import typings.nextAuth.clientUtilsMod.BroadcastMessage
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Post extends StObject {
  
  /** Notify other tabs/windows. */
  def post(message: Record[String, Any]): Unit
  
  /** Get notified by other tabs/windows. */
  def receive(onReceive: js.Function1[/* message */ BroadcastMessage, Unit]): js.Function0[Unit]
}
object Post {
  
  inline def apply(
    post: Record[String, Any] => Unit,
    receive: js.Function1[/* message */ BroadcastMessage, Unit] => js.Function0[Unit]
  ): Post = {
    val __obj = js.Dynamic.literal(post = js.Any.fromFunction1(post), receive = js.Any.fromFunction1(receive))
    __obj.asInstanceOf[Post]
  }
  
  extension [Self <: Post](x: Self) {
    
    inline def setPost(value: Record[String, Any] => Unit): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
    
    inline def setReceive(value: js.Function1[/* message */ BroadcastMessage, Unit] => js.Function0[Unit]): Self = StObject.set(x, "receive", js.Any.fromFunction1(value))
  }
}
