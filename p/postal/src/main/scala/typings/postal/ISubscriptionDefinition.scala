package typings.postal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscriptionDefinition[T] extends StObject {
  
  def callback(data: T, envelope: IEnvelope[T]): Unit
  @JSName("callback")
  var callback_Original: ICallback[T]
  
  var channel: String
  
  // after and before lack documentation
  def constraint(predicateFn: js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]): ISubscriptionDefinition[T]
  
  def constraints(predicateFns: js.Array[js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]]): ISubscriptionDefinition[T]
  
  def context(theContext: Any): ISubscriptionDefinition[T]
  
  def debounce(interval: Double): ISubscriptionDefinition[T]
  
  def defer(): ISubscriptionDefinition[T]
  
  def delay(waitTime: Double): ISubscriptionDefinition[T]
  
  def disposeAfter(maxCalls: Double): ISubscriptionDefinition[T]
  
  def distinct(): ISubscriptionDefinition[T]
  
  def distinctUntilChanged(): ISubscriptionDefinition[T]
  
  def logError(): ISubscriptionDefinition[T]
  
  def once(): ISubscriptionDefinition[T]
  
  def subscribe(callback: ICallback[T]): ISubscriptionDefinition[T]
  
  def throttle(interval: Double): ISubscriptionDefinition[T]
  
  var topic: String
  
  def unsubscribe(): Unit
}
object ISubscriptionDefinition {
  
  inline def apply[T](
    callback: (T, /* envelope */ IEnvelope[T]) => Unit,
    channel: String,
    constraint: js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean] => ISubscriptionDefinition[T],
    constraints: js.Array[js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]] => ISubscriptionDefinition[T],
    context: Any => ISubscriptionDefinition[T],
    debounce: Double => ISubscriptionDefinition[T],
    defer: () => ISubscriptionDefinition[T],
    delay: Double => ISubscriptionDefinition[T],
    disposeAfter: Double => ISubscriptionDefinition[T],
    distinct: () => ISubscriptionDefinition[T],
    distinctUntilChanged: () => ISubscriptionDefinition[T],
    logError: () => ISubscriptionDefinition[T],
    once: () => ISubscriptionDefinition[T],
    subscribe: ICallback[T] => ISubscriptionDefinition[T],
    throttle: Double => ISubscriptionDefinition[T],
    topic: String,
    unsubscribe: () => Unit
  ): ISubscriptionDefinition[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), channel = channel.asInstanceOf[js.Any], constraint = js.Any.fromFunction1(constraint), constraints = js.Any.fromFunction1(constraints), context = js.Any.fromFunction1(context), debounce = js.Any.fromFunction1(debounce), defer = js.Any.fromFunction0(defer), delay = js.Any.fromFunction1(delay), disposeAfter = js.Any.fromFunction1(disposeAfter), distinct = js.Any.fromFunction0(distinct), distinctUntilChanged = js.Any.fromFunction0(distinctUntilChanged), logError = js.Any.fromFunction0(logError), once = js.Any.fromFunction0(once), subscribe = js.Any.fromFunction1(subscribe), throttle = js.Any.fromFunction1(throttle), topic = topic.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[ISubscriptionDefinition[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISubscriptionDefinition[?], T] (val x: Self & ISubscriptionDefinition[T]) extends AnyVal {
    
    inline def setCallback(value: (T, /* envelope */ IEnvelope[T]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConstraint(
      value: js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean] => ISubscriptionDefinition[T]
    ): Self = StObject.set(x, "constraint", js.Any.fromFunction1(value))
    
    inline def setConstraints(
      value: js.Array[js.Function2[/* data */ T, /* envelope */ IEnvelope[T], Boolean]] => ISubscriptionDefinition[T]
    ): Self = StObject.set(x, "constraints", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any => ISubscriptionDefinition[T]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setDebounce(value: Double => ISubscriptionDefinition[T]): Self = StObject.set(x, "debounce", js.Any.fromFunction1(value))
    
    inline def setDefer(value: () => ISubscriptionDefinition[T]): Self = StObject.set(x, "defer", js.Any.fromFunction0(value))
    
    inline def setDelay(value: Double => ISubscriptionDefinition[T]): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
    
    inline def setDisposeAfter(value: Double => ISubscriptionDefinition[T]): Self = StObject.set(x, "disposeAfter", js.Any.fromFunction1(value))
    
    inline def setDistinct(value: () => ISubscriptionDefinition[T]): Self = StObject.set(x, "distinct", js.Any.fromFunction0(value))
    
    inline def setDistinctUntilChanged(value: () => ISubscriptionDefinition[T]): Self = StObject.set(x, "distinctUntilChanged", js.Any.fromFunction0(value))
    
    inline def setLogError(value: () => ISubscriptionDefinition[T]): Self = StObject.set(x, "logError", js.Any.fromFunction0(value))
    
    inline def setOnce(value: () => ISubscriptionDefinition[T]): Self = StObject.set(x, "once", js.Any.fromFunction0(value))
    
    inline def setSubscribe(value: ICallback[T] => ISubscriptionDefinition[T]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setThrottle(value: Double => ISubscriptionDefinition[T]): Self = StObject.set(x, "throttle", js.Any.fromFunction1(value))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
