package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPostal extends js.Object {
  var configuration: IConfiguration = js.native
  var wireTaps: js.Array[ICallback[_]] = js.native
  def addWireTap(callback: ICallback[_]): js.Function0[scala.Unit] = js.native
  def channel[T](): IChannelDefinition[T] = js.native
  def channel[T](name: java.lang.String): IChannelDefinition[T] = js.native
  def getSubscribersFor(): js.Array[ISubscriptionDefinition[_]] = js.native
  def getSubscribersFor(options: Anon_TopicChannel): js.Array[ISubscriptionDefinition[_]] = js.native
  def getSubscribersFor(predicateFn: js.Function1[/* sub */ ISubscriptionDefinition[_], scala.Boolean]): js.Array[ISubscriptionDefinition[_]] = js.native
  def publish(envelope: IEnvelope[_]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def subscribe(options: Anon_Callback): ISubscriptionDefinition[_] = js.native
  def unsubscribe(sub: ISubscriptionDefinition[_]): scala.Unit = js.native
  def unsubscribeFor(): scala.Unit = js.native
  def unsubscribeFor(options: Anon_TopicChannel): scala.Unit = js.native
}

