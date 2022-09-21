package typings.nats.typesMod

import typings.nats.anon.PartialConsumerOpts
import typings.nats.anon.PartialJetStreamPublishOp
import typings.nats.anon.PartialPullOptions
import typings.nats.queuedIteratorMod.QueuedIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JetStreamClient extends StObject {
  
  def fetch(stream: String, durable: String): QueuedIterator[JsMsg] = js.native
  def fetch(stream: String, durable: String, opts: PartialPullOptions): QueuedIterator[JsMsg] = js.native
  
  def publish(subj: String): js.Promise[PubAck] = js.native
  def publish(subj: String, data: js.typedarray.Uint8Array): js.Promise[PubAck] = js.native
  def publish(subj: String, data: js.typedarray.Uint8Array, options: PartialJetStreamPublishOp): js.Promise[PubAck] = js.native
  def publish(subj: String, data: Unit, options: PartialJetStreamPublishOp): js.Promise[PubAck] = js.native
  
  def pull(stream: String, durable: String): js.Promise[JsMsg] = js.native
  def pull(stream: String, durable: String, expires: Double): js.Promise[JsMsg] = js.native
  
  def pullSubscribe(subject: String, opts: PartialConsumerOpts): js.Promise[JetStreamPullSubscription] = js.native
  def pullSubscribe(subject: String, opts: ConsumerOptsBuilder): js.Promise[JetStreamPullSubscription] = js.native
  
  def subscribe(subject: String, opts: PartialConsumerOpts): js.Promise[JetStreamSubscription] = js.native
  def subscribe(subject: String, opts: ConsumerOptsBuilder): js.Promise[JetStreamSubscription] = js.native
  
  var views: Views = js.native
}
