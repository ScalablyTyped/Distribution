package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var dataIndex: Double
  
  var index: Double
}
object Index {
  
  inline def apply(dataIndex: Double, index: Double): Index = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
