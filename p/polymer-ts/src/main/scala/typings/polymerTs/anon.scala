package typings.polymerTs

import typings.polymerTs.polymerTsStrings.splice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddedCount extends StObject {
    
    var addedCount: Double
    
    var index: Double
    
    var `object`: js.Array[Any]
    
    var removed: js.Array[Any]
    
    var `type`: splice
  }
  object AddedCount {
    
    inline def apply(addedCount: Double, index: Double, `object`: js.Array[Any], removed: js.Array[Any]): AddedCount = {
      val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("splice")
      __obj.asInstanceOf[AddedCount]
    }
    
    extension [Self <: AddedCount](x: Self) {
      
      inline def setAddedCount(value: Double): Self = StObject.set(x, "addedCount", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setObject(value: js.Array[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectVarargs(value: Any*): Self = StObject.set(x, "object", js.Array(value*))
      
      inline def setRemoved(value: js.Array[Any]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: Any*): Self = StObject.set(x, "removed", js.Array(value*))
      
      inline def setType(value: splice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
