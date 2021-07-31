package typings.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommsConnection extends StObject {
  
  def send(): Unit
  
  var session: String
  
  var user: js.Object
}
object CommsConnection {
  
  @scala.inline
  def apply(send: () => Unit, session: String, user: js.Object): CommsConnection = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction0(send), session = session.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommsConnection]
  }
  
  @scala.inline
  implicit class CommsConnectionMutableBuilder[Self <: CommsConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSend(value: () => Unit): Self = StObject.set(x, "send", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
