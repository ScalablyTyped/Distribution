package typings.nats.anon

import typings.nats.errorMod.NatsError
import typings.nats.typesMod.JsMsg
import typings.nats.typesMod.JsMsgCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.ConsumerOpts> */
trait PartialConsumerOpts extends StObject {
  
  var callbackFn: js.UndefOr[JsMsgCallback] = js.undefined
  
  var config: js.UndefOr[PartialConsumerConfig] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var isBind: js.UndefOr[Boolean] = js.undefined
  
  var mack: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var ordered: js.UndefOr[Boolean] = js.undefined
  
  var queue: js.UndefOr[String] = js.undefined
  
  var stream: js.UndefOr[String] = js.undefined
}
object PartialConsumerOpts {
  
  inline def apply(): PartialConsumerOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConsumerOpts]
  }
  
  extension [Self <: PartialConsumerOpts](x: Self) {
    
    inline def setCallbackFn(value: (/* err */ NatsError | Null, /* msg */ JsMsg | Null) => Unit): Self = StObject.set(x, "callbackFn", js.Any.fromFunction2(value))
    
    inline def setCallbackFnUndefined: Self = StObject.set(x, "callbackFn", js.undefined)
    
    inline def setConfig(value: PartialConsumerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setIsBind(value: Boolean): Self = StObject.set(x, "isBind", value.asInstanceOf[js.Any])
    
    inline def setIsBindUndefined: Self = StObject.set(x, "isBind", js.undefined)
    
    inline def setMack(value: Boolean): Self = StObject.set(x, "mack", value.asInstanceOf[js.Any])
    
    inline def setMackUndefined: Self = StObject.set(x, "mack", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
