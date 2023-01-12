package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stop extends StObject {
  
  def stop(): Unit
}
object Stop {
  
  inline def apply(stop: () => Unit): Stop = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Stop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stop] (val x: Self) extends AnyVal {
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
