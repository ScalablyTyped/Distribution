package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryArrayResult[R /* <: js.Array[js.Any] */]
  extends StObject
     with QueryResultBase {
  
  var rows: js.Array[R]
}
object QueryArrayResult {
  
  @scala.inline
  def apply[R /* <: js.Array[js.Any] */](command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double, rows: js.Array[R]): QueryArrayResult[R] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArrayResult[R]]
  }
  
  @scala.inline
  implicit class QueryArrayResultMutableBuilder[Self <: QueryArrayResult[?], R /* <: js.Array[js.Any] */] (val x: Self & QueryArrayResult[R]) extends AnyVal {
    
    @scala.inline
    def setRows(value: js.Array[R]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: R*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
