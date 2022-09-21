package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLimits extends StObject {
  
  var max_bytes_required: Double
  
  var max_consumers: Double
  
  var max_memory: Double
  
  var max_storage: Double
  
  var max_streams: Double
  
  var memory_max_stream_bytes: Double
  
  var storage_max_stream_bytes: Double
}
object AccountLimits {
  
  inline def apply(
    max_bytes_required: Double,
    max_consumers: Double,
    max_memory: Double,
    max_storage: Double,
    max_streams: Double,
    memory_max_stream_bytes: Double,
    storage_max_stream_bytes: Double
  ): AccountLimits = {
    val __obj = js.Dynamic.literal(max_bytes_required = max_bytes_required.asInstanceOf[js.Any], max_consumers = max_consumers.asInstanceOf[js.Any], max_memory = max_memory.asInstanceOf[js.Any], max_storage = max_storage.asInstanceOf[js.Any], max_streams = max_streams.asInstanceOf[js.Any], memory_max_stream_bytes = memory_max_stream_bytes.asInstanceOf[js.Any], storage_max_stream_bytes = storage_max_stream_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLimits]
  }
  
  extension [Self <: AccountLimits](x: Self) {
    
    inline def setMax_bytes_required(value: Double): Self = StObject.set(x, "max_bytes_required", value.asInstanceOf[js.Any])
    
    inline def setMax_consumers(value: Double): Self = StObject.set(x, "max_consumers", value.asInstanceOf[js.Any])
    
    inline def setMax_memory(value: Double): Self = StObject.set(x, "max_memory", value.asInstanceOf[js.Any])
    
    inline def setMax_storage(value: Double): Self = StObject.set(x, "max_storage", value.asInstanceOf[js.Any])
    
    inline def setMax_streams(value: Double): Self = StObject.set(x, "max_streams", value.asInstanceOf[js.Any])
    
    inline def setMemory_max_stream_bytes(value: Double): Self = StObject.set(x, "memory_max_stream_bytes", value.asInstanceOf[js.Any])
    
    inline def setStorage_max_stream_bytes(value: Double): Self = StObject.set(x, "storage_max_stream_bytes", value.asInstanceOf[js.Any])
  }
}
