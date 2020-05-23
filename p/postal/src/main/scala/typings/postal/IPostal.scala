package typings.postal

import typings.postal.anon.Callback
import typings.postal.anon.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPostal extends js.Object {
  var configuration: IConfiguration = js.native
  var wireTaps: js.Array[ICallback[_]] = js.native
  def addWireTap(callback: ICallback[_]): js.Function0[Unit] = js.native
  def channel[T](): IChannelDefinition[T] = js.native
  def channel[T](name: String): IChannelDefinition[T] = js.native
  def getSubscribersFor(): js.Array[ISubscriptionDefinition[_]] = js.native
  def getSubscribersFor(options: Channel): js.Array[ISubscriptionDefinition[_]] = js.native
  def getSubscribersFor(predicateFn: js.Function1[/* sub */ ISubscriptionDefinition[_], Boolean]): js.Array[ISubscriptionDefinition[_]] = js.native
  def publish(envelope: IEnvelope[_]): Unit = js.native
  def reset(): Unit = js.native
  def subscribe(options: Callback): ISubscriptionDefinition[_] = js.native
  def unsubscribe(sub: ISubscriptionDefinition[_]): Unit = js.native
  def unsubscribeFor(): Unit = js.native
  def unsubscribeFor(options: Channel): Unit = js.native
}

