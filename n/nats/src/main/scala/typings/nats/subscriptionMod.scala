package typings.nats

import typings.nats.anon.DispatchedFn
import typings.nats.protocolMod.ProtocolHandler
import typings.nats.queuedIteratorMod.QueuedIteratorImpl
import typings.nats.typesMod.Msg
import typings.nats.typesMod.Sub
import typings.nats.typesMod.Subscription
import typings.nats.typesMod.SubscriptionOptions
import typings.nats.utilMod.Deferred_
import typings.nats.utilMod.Timeout_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nats.typesMod.Base because var conflicts: received. Inlined subject, callback, callback, timeout, max, draining */ @JSImport("nats/lib/nats-base-client/subscription", "SubscriptionImpl")
  @js.native
  open class SubscriptionImpl protected ()
    extends QueuedIteratorImpl[Msg]
       with Sub[Msg] {
    def this(protocol: ProtocolHandler, subject: String) = this()
    def this(protocol: ProtocolHandler, subject: String, opts: SubscriptionOptions) = this()
    
    def cancelTimeout(): Unit = js.native
    
    var cleanupFn: js.UndefOr[js.Function2[/* sub */ Subscription, /* info */ js.UndefOr[Any], Unit]] = js.native
    
    def close(): Unit = js.native
    
    @JSName("closed")
    var closed_SubscriptionImpl: Deferred_[Unit] = js.native
    
    var drained: js.UndefOr[js.Promise[Unit]] = js.native
    
    var draining: Boolean = js.native
    
    /* InferMemberOverrides */
    override def getPending(): Double = js.native
    
    /* InferMemberOverrides */
    override def getProcessed(): Double = js.native
    
    /* InferMemberOverrides */
    override def getReceived(): Double = js.native
    
    var info: js.UndefOr[Any] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var protocol: ProtocolHandler = js.native
    
    var queue: js.UndefOr[String] = js.native
    
    var requestSubject: js.UndefOr[String] = js.native
    
    def setPrePostHandlers(opts: DispatchedFn): Unit = js.native
    
    var sid: Double = js.native
    
    var subject: String = js.native
    
    var timeout: js.UndefOr[Double | Null] = js.native
    
    var timer: js.UndefOr[Timeout_[Unit]] = js.native
  }
}
