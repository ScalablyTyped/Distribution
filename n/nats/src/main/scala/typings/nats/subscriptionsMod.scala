package typings.nats

import typings.nats.errorMod.NatsError
import typings.nats.subscriptionMod.SubscriptionImpl
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionsMod {
  
  @JSImport("nats/lib/nats-base-client/subscriptions", "Subscriptions")
  @js.native
  open class Subscriptions () extends StObject {
    
    def add(s: SubscriptionImpl): SubscriptionImpl = js.native
    
    def all(): js.Array[SubscriptionImpl] = js.native
    
    def cancel(s: SubscriptionImpl): Unit = js.native
    
    def close(): Unit = js.native
    
    def get(sid: Double): js.UndefOr[SubscriptionImpl] = js.native
    
    def getMux(): SubscriptionImpl | Null = js.native
    
    def handleError(): Boolean = js.native
    def handleError(err: NatsError): Boolean = js.native
    
    var mux: SubscriptionImpl | Null = js.native
    
    def resub(s: SubscriptionImpl): SubscriptionImpl = js.native
    
    def setMux(): SubscriptionImpl | Null = js.native
    def setMux(s: SubscriptionImpl): SubscriptionImpl | Null = js.native
    
    var sidCounter: Double = js.native
    
    def size(): Double = js.native
    
    var subs: Map[Double, SubscriptionImpl] = js.native
  }
}
