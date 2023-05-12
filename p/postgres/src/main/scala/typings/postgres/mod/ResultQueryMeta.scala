package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultQueryMeta[T /* <: Double | Null */, U]
  extends StObject
     with ResultMeta[T] {
  
  var columns: ColumnList[U]
}
object ResultQueryMeta {
  
  inline def apply[T /* <: Double | Null */, U](columns: ColumnList[U], command: String, count: T, state: State, statement: Statement): ResultQueryMeta[T, U] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultQueryMeta[T, U]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultQueryMeta[?, ?], T /* <: Double | Null */, U] (val x: Self & (ResultQueryMeta[T, U])) extends AnyVal {
    
    inline def setColumns(value: ColumnList[U]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? postgres.postgres.Column<T> : never */ js.Any)*
    ): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
