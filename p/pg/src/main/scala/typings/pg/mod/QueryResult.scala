package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResult[R /* <: QueryResultRow */]
  extends StObject
     with QueryResultBase {
  
  var rows: js.Array[R]
}
object QueryResult {
  
  inline def apply[R /* <: QueryResultRow */](command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double, rows: js.Array[R]): QueryResult[R] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryResult[?], R /* <: QueryResultRow */] (val x: Self & QueryResult[R]) extends AnyVal {
    
    inline def setRows(value: js.Array[R]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: R*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
