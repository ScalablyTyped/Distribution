package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-gantt-taskbar`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowIndex extends StObject {
  
  var index: Double
  
  var rowIndex: Double
  
  var subId: `oj-gantt-taskbar`
}
object RowIndex {
  
  inline def apply(index: Double, rowIndex: Double): RowIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], subId = "oj-gantt-taskbar")
    __obj.asInstanceOf[RowIndex]
  }
  
  extension [Self <: RowIndex](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSubId(value: `oj-gantt-taskbar`): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
  }
}
