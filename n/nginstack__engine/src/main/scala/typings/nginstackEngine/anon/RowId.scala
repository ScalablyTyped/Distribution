package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowId extends StObject {
  
  var rowId: Double
  
  var tableName: String
}
object RowId {
  
  inline def apply(rowId: Double, tableName: String): RowId = {
    val __obj = js.Dynamic.literal(rowId = rowId.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowId]
  }
  
  extension [Self <: RowId](x: Self) {
    
    inline def setRowId(value: Double): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
