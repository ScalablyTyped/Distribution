package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResult[R /* <: QueryResultRow */] extends QueryResultBase {
  
  var rows: js.Array[R] = js.native
}
object QueryResult {
  
  @scala.inline
  def apply[R /* <: QueryResultRow */](command: String, fields: js.Array[FieldDef], oid: Double, rowCount: Double, rows: js.Array[R]): QueryResult[R] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult[R]]
  }
  
  @scala.inline
  implicit class QueryResultMutableBuilder[Self <: QueryResult[_], R /* <: QueryResultRow */] (val x: Self with QueryResult[R]) extends AnyVal {
    
    @scala.inline
    def setRows(value: js.Array[R]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: R*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
