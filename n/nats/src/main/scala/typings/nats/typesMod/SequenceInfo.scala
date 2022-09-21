package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceInfo extends StObject {
  
  var consumer_seq: Double
  
  var last_active: Nanos
  
  var stream_seq: Double
}
object SequenceInfo {
  
  inline def apply(consumer_seq: Double, last_active: Nanos, stream_seq: Double): SequenceInfo = {
    val __obj = js.Dynamic.literal(consumer_seq = consumer_seq.asInstanceOf[js.Any], last_active = last_active.asInstanceOf[js.Any], stream_seq = stream_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceInfo]
  }
  
  extension [Self <: SequenceInfo](x: Self) {
    
    inline def setConsumer_seq(value: Double): Self = StObject.set(x, "consumer_seq", value.asInstanceOf[js.Any])
    
    inline def setLast_active(value: Nanos): Self = StObject.set(x, "last_active", value.asInstanceOf[js.Any])
    
    inline def setStream_seq(value: Double): Self = StObject.set(x, "stream_seq", value.asInstanceOf[js.Any])
  }
}
