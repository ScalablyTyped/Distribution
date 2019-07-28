package typings.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChannelDefinition[T] extends js.Object {
  var channel: String = js.native
  def publish(topic: String): Unit = js.native
  def publish(topic: String, data: T): Unit = js.native
  def subscribe(topic: String, callback: ICallback[T]): ISubscriptionDefinition[T] = js.native
}

