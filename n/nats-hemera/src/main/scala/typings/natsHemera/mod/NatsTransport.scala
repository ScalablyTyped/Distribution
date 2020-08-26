package typings.natsHemera.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NatsTransport extends js.Object {
  def close(): Unit = js.native
  def driver(): js.Any = js.native
  def flush(): Unit = js.native
  def flush(callback: js.Function): Unit = js.native
  def request(subject: String): Double = js.native
  def request(
    subject: String,
    msg: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Double = js.native
  def request(
    subject: String,
    msg: js.UndefOr[scala.Nothing],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ js.Any
  ): Double = js.native
  def request(
    subject: String,
    msg: js.UndefOr[scala.Nothing],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ js.Any,
    callback: js.Function
  ): Double = js.native
  def request(subject: String, msg: String): Double = js.native
  def request(subject: String, msg: String, options: js.UndefOr[scala.Nothing], callback: js.Function): Double = js.native
  def request(
    subject: String,
    msg: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ js.Any
  ): Double = js.native
  def request(
    subject: String,
    msg: String,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ js.Any,
    callback: js.Function
  ): Double = js.native
  def send(subject: String): Unit = js.native
  def send(
    subject: String,
    msg: js.UndefOr[scala.Nothing],
    reply: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): Unit = js.native
  def send(subject: String, msg: js.UndefOr[scala.Nothing], reply: String): Unit = js.native
  def send(subject: String, msg: js.UndefOr[scala.Nothing], reply: String, callback: js.Function): Unit = js.native
  def send(subject: String, msg: String): Unit = js.native
  def send(subject: String, msg: String, reply: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def send(subject: String, msg: String, reply: String): Unit = js.native
  def send(subject: String, msg: String, reply: String, callback: js.Function): Unit = js.native
  def send(subject: String, msg: Buffer): Unit = js.native
  def send(subject: String, msg: Buffer, reply: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
  def send(subject: String, msg: Buffer, reply: String): Unit = js.native
  def send(subject: String, msg: Buffer, reply: String, callback: js.Function): Unit = js.native
  def subscribe(
    subject: String,
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nats.SubscribeOptions */ js.Any,
    callback: js.Function
  ): Double = js.native
  def timeout(sid: Double, timeout: Double, expected: Double, callback: js.Function1[/* sid */ Double, Unit]): Unit = js.native
  def unsubscribe(sid: Double): Unit = js.native
  def unsubscribe(sid: Double, max: Double): Unit = js.native
}

