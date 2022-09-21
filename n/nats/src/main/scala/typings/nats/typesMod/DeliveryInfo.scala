package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryInfo extends StObject {
  
  var account_hash: js.UndefOr[String] = js.undefined
  
  var consumer: String
  
  var deliverySequence: Double
  
  var domain: String
  
  var pending: Double
  
  var redelivered: Boolean
  
  var redeliveryCount: Double
  
  var stream: String
  
  var streamSequence: Double
  
  var timestampNanos: Double
}
object DeliveryInfo {
  
  inline def apply(
    consumer: String,
    deliverySequence: Double,
    domain: String,
    pending: Double,
    redelivered: Boolean,
    redeliveryCount: Double,
    stream: String,
    streamSequence: Double,
    timestampNanos: Double
  ): DeliveryInfo = {
    val __obj = js.Dynamic.literal(consumer = consumer.asInstanceOf[js.Any], deliverySequence = deliverySequence.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], redelivered = redelivered.asInstanceOf[js.Any], redeliveryCount = redeliveryCount.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], streamSequence = streamSequence.asInstanceOf[js.Any], timestampNanos = timestampNanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryInfo]
  }
  
  extension [Self <: DeliveryInfo](x: Self) {
    
    inline def setAccount_hash(value: String): Self = StObject.set(x, "account_hash", value.asInstanceOf[js.Any])
    
    inline def setAccount_hashUndefined: Self = StObject.set(x, "account_hash", js.undefined)
    
    inline def setConsumer(value: String): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
    
    inline def setDeliverySequence(value: Double): Self = StObject.set(x, "deliverySequence", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setRedelivered(value: Boolean): Self = StObject.set(x, "redelivered", value.asInstanceOf[js.Any])
    
    inline def setRedeliveryCount(value: Double): Self = StObject.set(x, "redeliveryCount", value.asInstanceOf[js.Any])
    
    inline def setStream(value: String): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamSequence(value: Double): Self = StObject.set(x, "streamSequence", value.asInstanceOf[js.Any])
    
    inline def setTimestampNanos(value: Double): Self = StObject.set(x, "timestampNanos", value.asInstanceOf[js.Any])
  }
}
