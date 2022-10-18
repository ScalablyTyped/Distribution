package typings.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIndex extends StObject {
  
  var dataIndex: Double
  
  var rowIndex: Double
}
object DataIndex {
  
  inline def apply(dataIndex: Double, rowIndex: Double): DataIndex = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
  
  extension [Self <: DataIndex](x: Self) {
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
