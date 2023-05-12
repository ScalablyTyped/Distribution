package typings.mercadopagoSdkJs.cardform

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardFormListener extends StObject {
  
  var event: js.Array[String]
  
  def fn(evt: Event): Unit
  @JSName("fn")
  var fn_Original: EventListener
}
object CardFormListener {
  
  inline def apply(event: js.Array[String], fn: /* evt */ Event => Unit): CardFormListener = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn))
    __obj.asInstanceOf[CardFormListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardFormListener] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: js.Array[String]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventVarargs(value: String*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setFn(value: /* evt */ Event => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
  }
}
