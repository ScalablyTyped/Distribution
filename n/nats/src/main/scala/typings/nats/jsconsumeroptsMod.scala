package typings.nats

import typings.nats.anon.PartialConsumerConfig
import typings.nats.anon.PartialConsumerOpts
import typings.nats.typesMod.ConsumerOpts
import typings.nats.typesMod.ConsumerOptsBuilder
import typings.nats.typesMod.JsMsgCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsconsumeroptsMod {
  
  @JSImport("nats/lib/nats-base-client/jsconsumeropts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nats/lib/nats-base-client/jsconsumeropts", "ConsumerOptsBuilderImpl")
  @js.native
  open class ConsumerOptsBuilderImpl ()
    extends StObject
       with ConsumerOptsBuilder {
    def this(opts: PartialConsumerConfig) = this()
    
    /* CompleteClass */
    override def ackAll(): this.type = js.native
    
    /* CompleteClass */
    override def ackExplicit(): this.type = js.native
    
    /* CompleteClass */
    override def ackNone(): this.type = js.native
    
    /* CompleteClass */
    override def ackWait(millis: Double): this.type = js.native
    
    /* CompleteClass */
    override def bind(stream: String, durable: String): this.type = js.native
    
    /* CompleteClass */
    override def callback(fn: JsMsgCallback): this.type = js.native
    
    var callbackFn: js.UndefOr[JsMsgCallback] = js.native
    
    var config: PartialConsumerConfig = js.native
    
    /* CompleteClass */
    override def deliverAll(): this.type = js.native
    
    /* CompleteClass */
    override def deliverGroup(name: String): this.type = js.native
    
    /* CompleteClass */
    override def deliverLast(): this.type = js.native
    
    /* CompleteClass */
    override def deliverLastPerSubject(): this.type = js.native
    
    /* CompleteClass */
    override def deliverNew(): this.type = js.native
    
    /* CompleteClass */
    override def deliverTo(subject: String): this.type = js.native
    
    /* CompleteClass */
    override def description(description: String): this.type = js.native
    
    /* CompleteClass */
    override def durable(name: String): this.type = js.native
    
    /* CompleteClass */
    override def filterSubject(s: String): this.type = js.native
    
    /* CompleteClass */
    override def flowControl(): this.type = js.native
    
    def getOpts(): ConsumerOpts = js.native
    
    /* CompleteClass */
    override def headersOnly(): this.type = js.native
    
    /* CompleteClass */
    override def idleHeartbeat(millis: Double): this.type = js.native
    
    /* CompleteClass */
    override def inactiveEphemeralThreshold(millis: Double): this.type = js.native
    
    var isBind: js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def limit(bps: Double): this.type = js.native
    
    var mack: Boolean = js.native
    
    /* CompleteClass */
    override def manualAck(): this.type = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    override def maxAckPending(max: Double): this.type = js.native
    
    /* CompleteClass */
    override def maxDeliver(max: Double): this.type = js.native
    
    /* CompleteClass */
    override def maxMessages(max: Double): this.type = js.native
    
    /* CompleteClass */
    override def maxPullBatch(n: Double): this.type = js.native
    
    /* CompleteClass */
    override def maxPullRequestExpires(millis: Double): this.type = js.native
    
    /* CompleteClass */
    override def maxWaiting(max: Double): this.type = js.native
    
    var ordered: Boolean = js.native
    
    /* CompleteClass */
    override def orderedConsumer(): this.type = js.native
    
    var qname: js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def queue(n: String): this.type = js.native
    
    /* CompleteClass */
    override def replayInstantly(): this.type = js.native
    
    /* CompleteClass */
    override def replayOriginal(): this.type = js.native
    
    /* CompleteClass */
    override def sample(n: Double): this.type = js.native
    
    /* CompleteClass */
    override def startAtTimeDelta(millis: Double): this.type = js.native
    
    /* CompleteClass */
    override def startSequence(seq: Double): this.type = js.native
    
    /* CompleteClass */
    override def startTime(time: js.Date): this.type = js.native
    
    var stream: String = js.native
  }
  
  inline def consumerOpts(): ConsumerOptsBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("consumerOpts")().asInstanceOf[ConsumerOptsBuilder]
  inline def consumerOpts(opts: PartialConsumerConfig): ConsumerOptsBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("consumerOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[ConsumerOptsBuilder]
  
  inline def isConsumerOptsBuilder(o: PartialConsumerOpts): /* is nats.nats/lib/nats-base-client/jsconsumeropts.ConsumerOptsBuilderImpl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConsumerOptsBuilder")(o.asInstanceOf[js.Any]).asInstanceOf[/* is nats.nats/lib/nats-base-client/jsconsumeropts.ConsumerOptsBuilderImpl */ Boolean]
  inline def isConsumerOptsBuilder(o: ConsumerOptsBuilder): /* is nats.nats/lib/nats-base-client/jsconsumeropts.ConsumerOptsBuilderImpl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConsumerOptsBuilder")(o.asInstanceOf[js.Any]).asInstanceOf[/* is nats.nats/lib/nats-base-client/jsconsumeropts.ConsumerOptsBuilderImpl */ Boolean]
}
