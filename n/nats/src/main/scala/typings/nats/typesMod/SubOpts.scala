package typings.nats.typesMod

import typings.nats.errorMod.NatsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubOpts[T] extends StObject {
  
  var callback: js.UndefOr[js.Function2[/* err */ NatsError | Null, /* msg */ T, Unit]] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var queue: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object SubOpts {
  
  inline def apply[T](): SubOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubOpts[T]]
  }
  
  extension [Self <: SubOpts[?], T](x: Self & SubOpts[T]) {
    
    inline def setCallback(value: (/* err */ NatsError | Null, /* msg */ T) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
