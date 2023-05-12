package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterGC extends StObject {
  
  var afterGC: HeapSpaceStatistics
  
  var beforeGC: HeapSpaceStatistics
  
  var cost: Double
  
  var gcType: String
}
object AfterGC {
  
  inline def apply(afterGC: HeapSpaceStatistics, beforeGC: HeapSpaceStatistics, cost: Double, gcType: String): AfterGC = {
    val __obj = js.Dynamic.literal(afterGC = afterGC.asInstanceOf[js.Any], beforeGC = beforeGC.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], gcType = gcType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterGC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterGC] (val x: Self) extends AnyVal {
    
    inline def setAfterGC(value: HeapSpaceStatistics): Self = StObject.set(x, "afterGC", value.asInstanceOf[js.Any])
    
    inline def setBeforeGC(value: HeapSpaceStatistics): Self = StObject.set(x, "beforeGC", value.asInstanceOf[js.Any])
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setGcType(value: String): Self = StObject.set(x, "gcType", value.asInstanceOf[js.Any])
  }
}
