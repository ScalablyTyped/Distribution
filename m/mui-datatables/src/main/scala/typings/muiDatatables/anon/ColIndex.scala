package typings.muiDatatables.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColIndex extends StObject {
  
  var colIndex: Double
  
  var dataIndex: Double
  
  var event: MouseEvent[Element, NativeMouseEvent]
  
  var rowIndex: Double
}
object ColIndex {
  
  inline def apply(
    colIndex: Double,
    dataIndex: Double,
    event: MouseEvent[Element, NativeMouseEvent],
    rowIndex: Double
  ): ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColIndex]
  }
  
  extension [Self <: ColIndex](x: Self) {
    
    inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: MouseEvent[Element, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
