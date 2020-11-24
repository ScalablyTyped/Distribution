package typings.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscriptionDefinition[T] extends js.Object {
  
  def callback(data: T, envelope: IEnvelope[T]): Unit = js.native
  @JSName("callback")
  var callback_Original: ICallback[T] = js.native
  
  var channel: String = js.native
  
  // after and before lack documentation
  def constraint(predicateFn: js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]): ISubscriptionDefinition[T] = js.native
  
  def constraints(predicateFns: js.Array[js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]]): ISubscriptionDefinition[T] = js.native
  
  def context(theContext: js.Any): ISubscriptionDefinition[T] = js.native
  
  def debounce(interval: Double): ISubscriptionDefinition[T] = js.native
  
  def defer(): ISubscriptionDefinition[T] = js.native
  
  def delay(waitTime: Double): ISubscriptionDefinition[T] = js.native
  
  def disposeAfter(maxCalls: Double): ISubscriptionDefinition[T] = js.native
  
  def distinct(): ISubscriptionDefinition[T] = js.native
  
  def distinctUntilChanged(): ISubscriptionDefinition[T] = js.native
  
  def logError(): ISubscriptionDefinition[T] = js.native
  
  def once(): ISubscriptionDefinition[T] = js.native
  
  def subscribe(callback: ICallback[T]): ISubscriptionDefinition[T] = js.native
  
  def throttle(interval: Double): ISubscriptionDefinition[T] = js.native
  
  var topic: String = js.native
  
  def unsubscribe(): Unit = js.native
}
