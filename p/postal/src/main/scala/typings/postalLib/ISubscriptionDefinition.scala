package typings
package postalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionDefinition[T] extends js.Object {
  @JSName("callback")
  var callback_Original: ICallback[T] = js.native
  var channel: java.lang.String = js.native
  var topic: java.lang.String = js.native
  def callback(data: T, envelope: IEnvelope[T]): scala.Unit = js.native
  // after and before lack documentation
  def constraint(predicateFn: js.Function2[/* data */ T, /* envelope */ IEnvelope[T], scala.Boolean]): ISubscriptionDefinition[T] = js.native
  def constraints(predicateFns: js.Array[js.Function2[/* data */ T, /* envelope */ IEnvelope[T], scala.Boolean]]): ISubscriptionDefinition[T] = js.native
  def context(theContext: js.Any): ISubscriptionDefinition[T] = js.native
  def debounce(interval: scala.Double): ISubscriptionDefinition[T] = js.native
  def defer(): ISubscriptionDefinition[T] = js.native
  def delay(waitTime: scala.Double): ISubscriptionDefinition[T] = js.native
  def disposeAfter(maxCalls: scala.Double): ISubscriptionDefinition[T] = js.native
  def distinct(): ISubscriptionDefinition[T] = js.native
  def distinctUntilChanged(): ISubscriptionDefinition[T] = js.native
  def logError(): ISubscriptionDefinition[T] = js.native
  def once(): ISubscriptionDefinition[T] = js.native
  def subscribe(callback: ICallback[T]): ISubscriptionDefinition[T] = js.native
  def throttle(interval: scala.Double): ISubscriptionDefinition[T] = js.native
  def unsubscribe(): scala.Unit = js.native
}

