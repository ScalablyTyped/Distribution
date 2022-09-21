package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerInfo extends StObject {
  
  var ack_floor: SequenceInfo
  
  var cluster: js.UndefOr[ClusterInfo] = js.undefined
  
  var config: ConsumerConfig
  
  var created: Double
  
  var delivered: SequenceInfo
  
  var name: String
  
  var num_ack_pending: Double
  
  var num_pending: Double
  
  var num_redelivered: Double
  
  var num_waiting: Double
  
  var push_bound: Boolean
  
  var stream_name: String
}
object ConsumerInfo {
  
  inline def apply(
    ack_floor: SequenceInfo,
    config: ConsumerConfig,
    created: Double,
    delivered: SequenceInfo,
    name: String,
    num_ack_pending: Double,
    num_pending: Double,
    num_redelivered: Double,
    num_waiting: Double,
    push_bound: Boolean,
    stream_name: String
  ): ConsumerInfo = {
    val __obj = js.Dynamic.literal(ack_floor = ack_floor.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], delivered = delivered.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], num_ack_pending = num_ack_pending.asInstanceOf[js.Any], num_pending = num_pending.asInstanceOf[js.Any], num_redelivered = num_redelivered.asInstanceOf[js.Any], num_waiting = num_waiting.asInstanceOf[js.Any], push_bound = push_bound.asInstanceOf[js.Any], stream_name = stream_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerInfo]
  }
  
  extension [Self <: ConsumerInfo](x: Self) {
    
    inline def setAck_floor(value: SequenceInfo): Self = StObject.set(x, "ack_floor", value.asInstanceOf[js.Any])
    
    inline def setCluster(value: ClusterInfo): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setConfig(value: ConsumerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDelivered(value: SequenceInfo): Self = StObject.set(x, "delivered", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNum_ack_pending(value: Double): Self = StObject.set(x, "num_ack_pending", value.asInstanceOf[js.Any])
    
    inline def setNum_pending(value: Double): Self = StObject.set(x, "num_pending", value.asInstanceOf[js.Any])
    
    inline def setNum_redelivered(value: Double): Self = StObject.set(x, "num_redelivered", value.asInstanceOf[js.Any])
    
    inline def setNum_waiting(value: Double): Self = StObject.set(x, "num_waiting", value.asInstanceOf[js.Any])
    
    inline def setPush_bound(value: Boolean): Self = StObject.set(x, "push_bound", value.asInstanceOf[js.Any])
    
    inline def setStream_name(value: String): Self = StObject.set(x, "stream_name", value.asInstanceOf[js.Any])
  }
}
