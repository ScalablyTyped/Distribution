package typings.plv8Internal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeapStatistics extends StObject {
  
  var external_memory: Double
  
  var heap_size_limit: Double
  
  var number_of_native_contexts: Double
  
  var total_heap_size: Double
  
  var total_physical_size: Double
  
  var used_heap_size: Double
}
object HeapStatistics {
  
  inline def apply(
    external_memory: Double,
    heap_size_limit: Double,
    number_of_native_contexts: Double,
    total_heap_size: Double,
    total_physical_size: Double,
    used_heap_size: Double
  ): HeapStatistics = {
    val __obj = js.Dynamic.literal(external_memory = external_memory.asInstanceOf[js.Any], heap_size_limit = heap_size_limit.asInstanceOf[js.Any], number_of_native_contexts = number_of_native_contexts.asInstanceOf[js.Any], total_heap_size = total_heap_size.asInstanceOf[js.Any], total_physical_size = total_physical_size.asInstanceOf[js.Any], used_heap_size = used_heap_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapStatistics]
  }
  
  extension [Self <: HeapStatistics](x: Self) {
    
    inline def setExternal_memory(value: Double): Self = StObject.set(x, "external_memory", value.asInstanceOf[js.Any])
    
    inline def setHeap_size_limit(value: Double): Self = StObject.set(x, "heap_size_limit", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_native_contexts(value: Double): Self = StObject.set(x, "number_of_native_contexts", value.asInstanceOf[js.Any])
    
    inline def setTotal_heap_size(value: Double): Self = StObject.set(x, "total_heap_size", value.asInstanceOf[js.Any])
    
    inline def setTotal_physical_size(value: Double): Self = StObject.set(x, "total_physical_size", value.asInstanceOf[js.Any])
    
    inline def setUsed_heap_size(value: Double): Self = StObject.set(x, "used_heap_size", value.asInstanceOf[js.Any])
  }
}
