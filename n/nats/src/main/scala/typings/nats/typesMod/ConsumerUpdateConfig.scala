package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerUpdateConfig extends StObject {
  
  var ack_wait: js.UndefOr[Nanos] = js.undefined
  
  var backoff: js.UndefOr[js.Array[Nanos]] = js.undefined
  
  var deliver_subject: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var headers_only: js.UndefOr[Boolean] = js.undefined
  
  var inactive_threshold: js.UndefOr[Nanos] = js.undefined
  
  var max_ack_pending: js.UndefOr[Double] = js.undefined
  
  var max_batch: js.UndefOr[Double] = js.undefined
  
  var max_deliver: js.UndefOr[Double] = js.undefined
  
  var max_expires: js.UndefOr[Nanos] = js.undefined
  
  var max_waiting: js.UndefOr[Double] = js.undefined
  
  var sample_freq: js.UndefOr[String] = js.undefined
}
object ConsumerUpdateConfig {
  
  inline def apply(): ConsumerUpdateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerUpdateConfig]
  }
  
  extension [Self <: ConsumerUpdateConfig](x: Self) {
    
    inline def setAck_wait(value: Nanos): Self = StObject.set(x, "ack_wait", value.asInstanceOf[js.Any])
    
    inline def setAck_waitUndefined: Self = StObject.set(x, "ack_wait", js.undefined)
    
    inline def setBackoff(value: js.Array[Nanos]): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
    
    inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
    
    inline def setBackoffVarargs(value: Nanos*): Self = StObject.set(x, "backoff", js.Array(value*))
    
    inline def setDeliver_subject(value: String): Self = StObject.set(x, "deliver_subject", value.asInstanceOf[js.Any])
    
    inline def setDeliver_subjectUndefined: Self = StObject.set(x, "deliver_subject", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeaders_only(value: Boolean): Self = StObject.set(x, "headers_only", value.asInstanceOf[js.Any])
    
    inline def setHeaders_onlyUndefined: Self = StObject.set(x, "headers_only", js.undefined)
    
    inline def setInactive_threshold(value: Nanos): Self = StObject.set(x, "inactive_threshold", value.asInstanceOf[js.Any])
    
    inline def setInactive_thresholdUndefined: Self = StObject.set(x, "inactive_threshold", js.undefined)
    
    inline def setMax_ack_pending(value: Double): Self = StObject.set(x, "max_ack_pending", value.asInstanceOf[js.Any])
    
    inline def setMax_ack_pendingUndefined: Self = StObject.set(x, "max_ack_pending", js.undefined)
    
    inline def setMax_batch(value: Double): Self = StObject.set(x, "max_batch", value.asInstanceOf[js.Any])
    
    inline def setMax_batchUndefined: Self = StObject.set(x, "max_batch", js.undefined)
    
    inline def setMax_deliver(value: Double): Self = StObject.set(x, "max_deliver", value.asInstanceOf[js.Any])
    
    inline def setMax_deliverUndefined: Self = StObject.set(x, "max_deliver", js.undefined)
    
    inline def setMax_expires(value: Nanos): Self = StObject.set(x, "max_expires", value.asInstanceOf[js.Any])
    
    inline def setMax_expiresUndefined: Self = StObject.set(x, "max_expires", js.undefined)
    
    inline def setMax_waiting(value: Double): Self = StObject.set(x, "max_waiting", value.asInstanceOf[js.Any])
    
    inline def setMax_waitingUndefined: Self = StObject.set(x, "max_waiting", js.undefined)
    
    inline def setSample_freq(value: String): Self = StObject.set(x, "sample_freq", value.asInstanceOf[js.Any])
    
    inline def setSample_freqUndefined: Self = StObject.set(x, "sample_freq", js.undefined)
  }
}
