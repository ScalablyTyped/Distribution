package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisSubscriptionsSubscriptionsMod.SubscriptionDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activate extends StObject {
  
  def activate(): js.Promise[Unit]
  
  def get(): js.Promise[SubscriptionDetail]
}
object Activate {
  
  inline def apply(activate: () => js.Promise[Unit], get: () => js.Promise[SubscriptionDetail]): Activate = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Activate]
  }
  
  extension [Self <: Activate](x: Self) {
    
    inline def setActivate(value: () => js.Promise[Unit]): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
    
    inline def setGet(value: () => js.Promise[SubscriptionDetail]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
  }
}
