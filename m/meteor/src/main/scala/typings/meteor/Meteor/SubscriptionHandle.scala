package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** utils **/
/** Pub/Sub **/
@js.native
trait SubscriptionHandle extends StObject {
  
  def ready(): Boolean = js.native
  
  def stop(): Unit = js.native
}
object SubscriptionHandle {
  
  @scala.inline
  def apply(ready: () => Boolean, stop: () => Unit): SubscriptionHandle = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[SubscriptionHandle]
  }
  
  @scala.inline
  implicit class SubscriptionHandleMutableBuilder[Self <: SubscriptionHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReady(value: () => Boolean): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
