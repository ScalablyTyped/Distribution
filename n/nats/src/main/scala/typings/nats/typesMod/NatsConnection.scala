package typings.nats.typesMod

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NatsConnection extends StObject {
  
  def close(): js.Promise[Unit] = js.native
  
  def closed(): js.Promise[Unit | js.Error] = js.native
  
  def drain(): js.Promise[Unit] = js.native
  
  def flush(): js.Promise[Unit] = js.native
  
  def getServer(): String = js.native
  
  var info: js.UndefOr[ServerInfo] = js.native
  
  def isClosed(): Boolean = js.native
  
  def isDraining(): Boolean = js.native
  
  def jetstream(): JetStreamClient = js.native
  def jetstream(opts: JetStreamOptions): JetStreamClient = js.native
  
  def jetstreamManager(): js.Promise[JetStreamManager] = js.native
  def jetstreamManager(opts: JetStreamOptions): js.Promise[JetStreamManager] = js.native
  
  def publish(subject: String): Unit = js.native
  def publish(subject: String, data: js.typedarray.Uint8Array): Unit = js.native
  def publish(subject: String, data: js.typedarray.Uint8Array, options: PublishOptions): Unit = js.native
  def publish(subject: String, data: Unit, options: PublishOptions): Unit = js.native
  
  def request(subject: String): js.Promise[Msg] = js.native
  def request(subject: String, data: js.typedarray.Uint8Array): js.Promise[Msg] = js.native
  def request(subject: String, data: js.typedarray.Uint8Array, opts: RequestOptions): js.Promise[Msg] = js.native
  def request(subject: String, data: Unit, opts: RequestOptions): js.Promise[Msg] = js.native
  
  def rtt(): js.Promise[Double] = js.native
  
  def stats(): Stats = js.native
  
  def status(): AsyncIterable[Status] = js.native
  
  def subscribe(subject: String): Subscription = js.native
  def subscribe(subject: String, opts: SubscriptionOptions): Subscription = js.native
}
