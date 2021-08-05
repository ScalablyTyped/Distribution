package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SQLResultSet extends StObject {
  
  var insertId: Double
  
  var rows: SQLResultSetRowList
  
  var rowsAffected: Double
}
object SQLResultSet {
  
  inline def apply(insertId: Double, rows: SQLResultSetRowList, rowsAffected: Double): SQLResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSet]
  }
  
  extension [Self <: SQLResultSet](x: Self) {
    
    inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setRows(value: SQLResultSetRowList): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
  }
}
