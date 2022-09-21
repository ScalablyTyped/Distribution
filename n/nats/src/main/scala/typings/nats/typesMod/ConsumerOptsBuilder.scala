package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerOptsBuilder extends StObject {
  
  def ackAll(): this.type
  
  def ackExplicit(): this.type
  
  def ackNone(): this.type
  
  def ackWait(millis: Double): this.type
  
  def bind(stream: String, durable: String): this.type
  
  def callback(fn: JsMsgCallback): this.type
  
  def deliverAll(): this.type
  
  def deliverGroup(name: String): this.type
  
  def deliverLast(): this.type
  
  def deliverLastPerSubject(): this.type
  
  def deliverNew(): this.type
  
  def deliverTo(subject: String): this.type
  
  def description(description: String): this.type
  
  def durable(name: String): this.type
  
  def filterSubject(s: String): this.type
  
  def flowControl(): this.type
  
  def headersOnly(): this.type
  
  def idleHeartbeat(millis: Double): this.type
  
  def inactiveEphemeralThreshold(millis: Double): this.type
  
  def limit(bps: Double): this.type
  
  def manualAck(): this.type
  
  def maxAckPending(max: Double): this.type
  
  def maxDeliver(max: Double): this.type
  
  def maxMessages(max: Double): this.type
  
  def maxPullBatch(n: Double): this.type
  
  def maxPullRequestExpires(millis: Double): this.type
  
  def maxWaiting(max: Double): this.type
  
  def orderedConsumer(): this.type
  
  def queue(n: String): this.type
  
  def replayInstantly(): this.type
  
  def replayOriginal(): this.type
  
  def sample(n: Double): this.type
  
  def startAtTimeDelta(millis: Double): this.type
  
  def startSequence(seq: Double): this.type
  
  def startTime(time: js.Date): this.type
}
object ConsumerOptsBuilder {
  
  inline def apply(
    ackAll: () => ConsumerOptsBuilder,
    ackExplicit: () => ConsumerOptsBuilder,
    ackNone: () => ConsumerOptsBuilder,
    ackWait: Double => ConsumerOptsBuilder,
    bind: (String, String) => ConsumerOptsBuilder,
    callback: JsMsgCallback => ConsumerOptsBuilder,
    deliverAll: () => ConsumerOptsBuilder,
    deliverGroup: String => ConsumerOptsBuilder,
    deliverLast: () => ConsumerOptsBuilder,
    deliverLastPerSubject: () => ConsumerOptsBuilder,
    deliverNew: () => ConsumerOptsBuilder,
    deliverTo: String => ConsumerOptsBuilder,
    description: String => ConsumerOptsBuilder,
    durable: String => ConsumerOptsBuilder,
    filterSubject: String => ConsumerOptsBuilder,
    flowControl: () => ConsumerOptsBuilder,
    headersOnly: () => ConsumerOptsBuilder,
    idleHeartbeat: Double => ConsumerOptsBuilder,
    inactiveEphemeralThreshold: Double => ConsumerOptsBuilder,
    limit: Double => ConsumerOptsBuilder,
    manualAck: () => ConsumerOptsBuilder,
    maxAckPending: Double => ConsumerOptsBuilder,
    maxDeliver: Double => ConsumerOptsBuilder,
    maxMessages: Double => ConsumerOptsBuilder,
    maxPullBatch: Double => ConsumerOptsBuilder,
    maxPullRequestExpires: Double => ConsumerOptsBuilder,
    maxWaiting: Double => ConsumerOptsBuilder,
    orderedConsumer: () => ConsumerOptsBuilder,
    queue: String => ConsumerOptsBuilder,
    replayInstantly: () => ConsumerOptsBuilder,
    replayOriginal: () => ConsumerOptsBuilder,
    sample: Double => ConsumerOptsBuilder,
    startAtTimeDelta: Double => ConsumerOptsBuilder,
    startSequence: Double => ConsumerOptsBuilder,
    startTime: js.Date => ConsumerOptsBuilder
  ): ConsumerOptsBuilder = {
    val __obj = js.Dynamic.literal(ackAll = js.Any.fromFunction0(ackAll), ackExplicit = js.Any.fromFunction0(ackExplicit), ackNone = js.Any.fromFunction0(ackNone), ackWait = js.Any.fromFunction1(ackWait), bind = js.Any.fromFunction2(bind), callback = js.Any.fromFunction1(callback), deliverAll = js.Any.fromFunction0(deliverAll), deliverGroup = js.Any.fromFunction1(deliverGroup), deliverLast = js.Any.fromFunction0(deliverLast), deliverLastPerSubject = js.Any.fromFunction0(deliverLastPerSubject), deliverNew = js.Any.fromFunction0(deliverNew), deliverTo = js.Any.fromFunction1(deliverTo), description = js.Any.fromFunction1(description), durable = js.Any.fromFunction1(durable), filterSubject = js.Any.fromFunction1(filterSubject), flowControl = js.Any.fromFunction0(flowControl), headersOnly = js.Any.fromFunction0(headersOnly), idleHeartbeat = js.Any.fromFunction1(idleHeartbeat), inactiveEphemeralThreshold = js.Any.fromFunction1(inactiveEphemeralThreshold), limit = js.Any.fromFunction1(limit), manualAck = js.Any.fromFunction0(manualAck), maxAckPending = js.Any.fromFunction1(maxAckPending), maxDeliver = js.Any.fromFunction1(maxDeliver), maxMessages = js.Any.fromFunction1(maxMessages), maxPullBatch = js.Any.fromFunction1(maxPullBatch), maxPullRequestExpires = js.Any.fromFunction1(maxPullRequestExpires), maxWaiting = js.Any.fromFunction1(maxWaiting), orderedConsumer = js.Any.fromFunction0(orderedConsumer), queue = js.Any.fromFunction1(queue), replayInstantly = js.Any.fromFunction0(replayInstantly), replayOriginal = js.Any.fromFunction0(replayOriginal), sample = js.Any.fromFunction1(sample), startAtTimeDelta = js.Any.fromFunction1(startAtTimeDelta), startSequence = js.Any.fromFunction1(startSequence), startTime = js.Any.fromFunction1(startTime))
    __obj.asInstanceOf[ConsumerOptsBuilder]
  }
  
  extension [Self <: ConsumerOptsBuilder](x: Self) {
    
    inline def setAckAll(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "ackAll", js.Any.fromFunction0(value))
    
    inline def setAckExplicit(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "ackExplicit", js.Any.fromFunction0(value))
    
    inline def setAckNone(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "ackNone", js.Any.fromFunction0(value))
    
    inline def setAckWait(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "ackWait", js.Any.fromFunction1(value))
    
    inline def setBind(value: (String, String) => ConsumerOptsBuilder): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
    
    inline def setCallback(value: JsMsgCallback => ConsumerOptsBuilder): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setDeliverAll(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "deliverAll", js.Any.fromFunction0(value))
    
    inline def setDeliverGroup(value: String => ConsumerOptsBuilder): Self = StObject.set(x, "deliverGroup", js.Any.fromFunction1(value))
    
    inline def setDeliverLast(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "deliverLast", js.Any.fromFunction0(value))
    
    inline def setDeliverLastPerSubject(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "deliverLastPerSubject", js.Any.fromFunction0(value))
    
    inline def setDeliverNew(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "deliverNew", js.Any.fromFunction0(value))
    
    inline def setDeliverTo(value: String => ConsumerOptsBuilder): Self = StObject.set(x, "deliverTo", js.Any.fromFunction1(value))
    
    inline def setDescription(value: String => ConsumerOptsBuilder): Self = StObject.set(x, "description", js.Any.fromFunction1(value))
    
    inline def setDurable(value: String => ConsumerOptsBuilder): Self = StObject.set(x, "durable", js.Any.fromFunction1(value))
    
    inline def setFilterSubject(value: String => ConsumerOptsBuilder): Self = StObject.set(x, "filterSubject", js.Any.fromFunction1(value))
    
    inline def setFlowControl(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "flowControl", js.Any.fromFunction0(value))
    
    inline def setHeadersOnly(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "headersOnly", js.Any.fromFunction0(value))
    
    inline def setIdleHeartbeat(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "idleHeartbeat", js.Any.fromFunction1(value))
    
    inline def setInactiveEphemeralThreshold(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "inactiveEphemeralThreshold", js.Any.fromFunction1(value))
    
    inline def setLimit(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
    
    inline def setManualAck(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "manualAck", js.Any.fromFunction0(value))
    
    inline def setMaxAckPending(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "maxAckPending", js.Any.fromFunction1(value))
    
    inline def setMaxDeliver(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "maxDeliver", js.Any.fromFunction1(value))
    
    inline def setMaxMessages(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "maxMessages", js.Any.fromFunction1(value))
    
    inline def setMaxPullBatch(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "maxPullBatch", js.Any.fromFunction1(value))
    
    inline def setMaxPullRequestExpires(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "maxPullRequestExpires", js.Any.fromFunction1(value))
    
    inline def setMaxWaiting(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "maxWaiting", js.Any.fromFunction1(value))
    
    inline def setOrderedConsumer(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "orderedConsumer", js.Any.fromFunction0(value))
    
    inline def setQueue(value: String => ConsumerOptsBuilder): Self = StObject.set(x, "queue", js.Any.fromFunction1(value))
    
    inline def setReplayInstantly(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "replayInstantly", js.Any.fromFunction0(value))
    
    inline def setReplayOriginal(value: () => ConsumerOptsBuilder): Self = StObject.set(x, "replayOriginal", js.Any.fromFunction0(value))
    
    inline def setSample(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "sample", js.Any.fromFunction1(value))
    
    inline def setStartAtTimeDelta(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "startAtTimeDelta", js.Any.fromFunction1(value))
    
    inline def setStartSequence(value: Double => ConsumerOptsBuilder): Self = StObject.set(x, "startSequence", js.Any.fromFunction1(value))
    
    inline def setStartTime(value: js.Date => ConsumerOptsBuilder): Self = StObject.set(x, "startTime", js.Any.fromFunction1(value))
  }
}
