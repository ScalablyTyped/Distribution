package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deliveryseq extends StObject {
  
  var delivery_seq: Double
  
  var stream_seq: Double
}
object Deliveryseq {
  
  inline def apply(delivery_seq: Double, stream_seq: Double): Deliveryseq = {
    val __obj = js.Dynamic.literal(delivery_seq = delivery_seq.asInstanceOf[js.Any], stream_seq = stream_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deliveryseq]
  }
  
  extension [Self <: Deliveryseq](x: Self) {
    
    inline def setDelivery_seq(value: Double): Self = StObject.set(x, "delivery_seq", value.asInstanceOf[js.Any])
    
    inline def setStream_seq(value: Double): Self = StObject.set(x, "stream_seq", value.asInstanceOf[js.Any])
  }
}
