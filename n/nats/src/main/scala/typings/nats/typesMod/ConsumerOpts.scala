package typings.nats.typesMod

import typings.nats.anon.PartialConsumerConfig
import typings.nats.errorMod.NatsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerOpts extends StObject {
  
  var callbackFn: js.UndefOr[JsMsgCallback] = js.undefined
  
  var config: PartialConsumerConfig
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var isBind: js.UndefOr[Boolean] = js.undefined
  
  var mack: Boolean
  
  var max: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var ordered: Boolean
  
  var queue: js.UndefOr[String] = js.undefined
  
  var stream: String
}
object ConsumerOpts {
  
  inline def apply(config: PartialConsumerConfig, mack: Boolean, ordered: Boolean, stream: String): ConsumerOpts = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], mack = mack.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerOpts]
  }
  
  extension [Self <: ConsumerOpts](x: Self) {
    
    inline def setCallbackFn(value: (/* err */ NatsError | Null, /* msg */ JsMsg | Null) => Unit): Self = StObject.set(x, "callbackFn", js.Any.fromFunction2(value))
    
    inline def setCallbackFnUndefined: Self = StObject.set(x, "callbackFn", js.undefined)
    
    inline def setConfig(value: PartialConsumerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setIsBind(value: Boolean): Self = StObject.set(x, "isBind", value.asInstanceOf[js.Any])
    
    inline def setIsBindUndefined: Self = StObject.set(x, "isBind", js.undefined)
    
    inline def setMack(value: Boolean): Self = StObject.set(x, "mack", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
