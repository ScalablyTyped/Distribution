package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononPageEventObject extends StObject {
  
  def addEvent(event: String, callback: js.Function1[/* parameter */ js.UndefOr[Any], Unit]): Unit
}
object PhononPageEventObject {
  
  inline def apply(addEvent: (String, js.Function1[/* parameter */ js.UndefOr[Any], Unit]) => Unit): PhononPageEventObject = {
    val __obj = js.Dynamic.literal(addEvent = js.Any.fromFunction2(addEvent))
    __obj.asInstanceOf[PhononPageEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhononPageEventObject] (val x: Self) extends AnyVal {
    
    inline def setAddEvent(value: (String, js.Function1[/* parameter */ js.UndefOr[Any], Unit]) => Unit): Self = StObject.set(x, "addEvent", js.Any.fromFunction2(value))
  }
}
