package typings.node.anon

import typings.node.v8Mod.HeapStatistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeapSpaceStatistics extends StObject {
  
  var heapSpaceStatistics: js.Array[typings.node.v8Mod.HeapSpaceStatistics]
  
  var heapStatistics: HeapStatistics
}
object HeapSpaceStatistics {
  
  inline def apply(
    heapSpaceStatistics: js.Array[typings.node.v8Mod.HeapSpaceStatistics],
    heapStatistics: HeapStatistics
  ): HeapSpaceStatistics = {
    val __obj = js.Dynamic.literal(heapSpaceStatistics = heapSpaceStatistics.asInstanceOf[js.Any], heapStatistics = heapStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapSpaceStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeapSpaceStatistics] (val x: Self) extends AnyVal {
    
    inline def setHeapSpaceStatistics(value: js.Array[typings.node.v8Mod.HeapSpaceStatistics]): Self = StObject.set(x, "heapSpaceStatistics", value.asInstanceOf[js.Any])
    
    inline def setHeapSpaceStatisticsVarargs(value: typings.node.v8Mod.HeapSpaceStatistics*): Self = StObject.set(x, "heapSpaceStatistics", js.Array(value*))
    
    inline def setHeapStatistics(value: HeapStatistics): Self = StObject.set(x, "heapStatistics", value.asInstanceOf[js.Any])
  }
}
