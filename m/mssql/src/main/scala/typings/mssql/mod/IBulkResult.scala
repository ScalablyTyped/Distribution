package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBulkResult extends StObject {
  
  var rowsAffected: Double
}
object IBulkResult {
  
  inline def apply(rowsAffected: Double): IBulkResult = {
    val __obj = js.Dynamic.literal(rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBulkResult]
  }
  
  extension [Self <: IBulkResult](x: Self) {
    
    inline def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
  }
}
