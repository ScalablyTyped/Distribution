package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accept extends StObject {
  
  def accept(): Unit
  
  var data: js.Object | Null
  
  def decline(): Unit
  
  def dispose(callback: js.Function1[/* data */ js.Object, Unit]): Unit
  
  def onRequire[T](callbacks: After[T]): Unit
}
object Accept {
  
  inline def apply(
    accept: () => Unit,
    decline: () => Unit,
    dispose: js.Function1[/* data */ js.Object, Unit] => Unit,
    onRequire: After[Any] => Unit
  ): Accept = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), decline = js.Any.fromFunction0(decline), dispose = js.Any.fromFunction1(dispose), onRequire = js.Any.fromFunction1(onRequire), data = null)
    __obj.asInstanceOf[Accept]
  }
  
  extension [Self <: Accept](x: Self) {
    
    inline def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDecline(value: () => Unit): Self = StObject.set(x, "decline", js.Any.fromFunction0(value))
    
    inline def setDispose(value: js.Function1[/* data */ js.Object, Unit] => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    inline def setOnRequire(value: After[Any] => Unit): Self = StObject.set(x, "onRequire", js.Any.fromFunction1(value))
  }
}
