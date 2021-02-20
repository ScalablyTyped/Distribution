package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultBuilder[R /* <: QueryResultRow */] extends QueryResult[R] {
  
  def addRow(row: R): Unit = js.native
}
object ResultBuilder {
  
  @scala.inline
  def apply[R /* <: QueryResultRow */](
    addRow: R => Unit,
    command: String,
    fields: js.Array[FieldDef],
    oid: Double,
    rowCount: Double,
    rows: js.Array[R]
  ): ResultBuilder[R] = {
    val __obj = js.Dynamic.literal(addRow = js.Any.fromFunction1(addRow), command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultBuilder[R]]
  }
  
  @scala.inline
  implicit class ResultBuilderMutableBuilder[Self <: ResultBuilder[_], R /* <: QueryResultRow */] (val x: Self with ResultBuilder[R]) extends AnyVal {
    
    @scala.inline
    def setAddRow(value: R => Unit): Self = StObject.set(x, "addRow", js.Any.fromFunction1(value))
  }
}
