package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChannelDefinition[T] extends js.Object {
  var channel: java.lang.String = js.native
  def publish(topic: java.lang.String): scala.Unit = js.native
  def publish(topic: java.lang.String, data: T): scala.Unit = js.native
  def subscribe(topic: java.lang.String, callback: ICallback[T]): ISubscriptionDefinition[T] = js.native
}

