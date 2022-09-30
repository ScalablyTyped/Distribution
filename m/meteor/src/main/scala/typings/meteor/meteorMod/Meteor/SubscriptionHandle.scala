package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** utils **/
/** Pub/Sub **/
trait SubscriptionHandle extends StObject {
  
  /** True if the server has marked the subscription as ready. A reactive data source. */
  def ready(): Boolean
  
  /** Cancel the subscription. This will typically result in the server directing the client to remove the subscription’s data from the client’s cache. */
  def stop(): Unit
}
object SubscriptionHandle {
  
  inline def apply(ready: () => Boolean, stop: () => Unit): SubscriptionHandle = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[SubscriptionHandle]
  }
  
  extension [Self <: SubscriptionHandle](x: Self) {
    
    inline def setReady(value: () => Boolean): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
