package typings.natsHemera.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NatsTransport extends StObject {
  
  def close(): Unit = js.native
  
  def driver(): Any = js.native
  
  def flush(): Unit = js.native
  def flush(callback: js.Function): Unit = js.native
  
  def request(subject: String): Double = js.native
  def request(subject: String, msg: String): Double = js.native
  def request(
    subject: String,
    msg: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ Any
  ): Double = js.native
  def request(
    subject: String,
    msg: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ Any,
    callback: js.Function
  ): Double = js.native
  def request(subject: String, msg: String, options: Unit, callback: js.Function): Double = js.native
  def request(
    subject: String,
    msg: Unit,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ Any
  ): Double = js.native
  def request(
    subject: String,
    msg: Unit,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ Any,
    callback: js.Function
  ): Double = js.native
  def request(subject: String, msg: Unit, options: Unit, callback: js.Function): Double = js.native
  
  def send(subject: String): Unit = js.native
  def send(subject: String, msg: String): Unit = js.native
  def send(subject: String, msg: String, reply: String): Unit = js.native
  def send(subject: String, msg: String, reply: String, callback: js.Function): Unit = js.native
  def send(subject: String, msg: String, reply: Unit, callback: js.Function): Unit = js.native
  def send(subject: String, msg: Unit, reply: String): Unit = js.native
  def send(subject: String, msg: Unit, reply: String, callback: js.Function): Unit = js.native
  def send(subject: String, msg: Unit, reply: Unit, callback: js.Function): Unit = js.native
  def send(subject: String, msg: Buffer): Unit = js.native
  def send(subject: String, msg: Buffer, reply: String): Unit = js.native
  def send(subject: String, msg: Buffer, reply: String, callback: js.Function): Unit = js.native
  def send(subject: String, msg: Buffer, reply: Unit, callback: js.Function): Unit = js.native
  
  def subscribe(
    subject: String,
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ Any,
    callback: js.Function
  ): Double = js.native
  
  def timeout(sid: Double, timeout: Double, expected: Double, callback: js.Function1[/* sid */ Double, Unit]): Unit = js.native
  
  def unsubscribe(sid: Double): Unit = js.native
  def unsubscribe(sid: Double, max: Double): Unit = js.native
}
