package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: Any
  
  def complete(): Unit
  
  var done: Boolean
}
object Callback {
  
  inline def apply(callback: Any, complete: () => Unit, done: Boolean): Callback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], complete = js.Any.fromFunction0(complete), done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
  }
}
