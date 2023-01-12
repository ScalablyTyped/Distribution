package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSessionEvents extends StObject {
  
  def ended(session: ClientSession): Unit
}
object ClientSessionEvents {
  
  inline def apply(ended: ClientSession => Unit): ClientSessionEvents = {
    val __obj = js.Dynamic.literal(ended = js.Any.fromFunction1(ended))
    __obj.asInstanceOf[ClientSessionEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientSessionEvents] (val x: Self) extends AnyVal {
    
    inline def setEnded(value: ClientSession => Unit): Self = StObject.set(x, "ended", js.Any.fromFunction1(value))
  }
}
