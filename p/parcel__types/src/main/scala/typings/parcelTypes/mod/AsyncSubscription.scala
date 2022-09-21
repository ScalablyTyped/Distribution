package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSubscription extends StObject {
  
  def unsubscribe(): js.Promise[Any]
}
object AsyncSubscription {
  
  inline def apply(unsubscribe: () => js.Promise[Any]): AsyncSubscription = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[AsyncSubscription]
  }
  
  extension [Self <: AsyncSubscription](x: Self) {
    
    inline def setUnsubscribe(value: () => js.Promise[Any]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
