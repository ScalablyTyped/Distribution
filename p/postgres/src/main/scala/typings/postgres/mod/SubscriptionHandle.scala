package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionHandle extends StObject {
  
  def unsubscribe(): Unit
}
object SubscriptionHandle {
  
  inline def apply(unsubscribe: () => Unit): SubscriptionHandle = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[SubscriptionHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionHandle] (val x: Self) extends AnyVal {
    
    inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
