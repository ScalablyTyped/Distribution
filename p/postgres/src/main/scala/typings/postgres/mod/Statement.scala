package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statement extends StObject {
  
  var columns: ColumnList[String]
  
  /** statement unique name */
  var name: String
  
  /** sql query */
  var string: String
  
  /** parameters types */
  var types: js.Array[Double]
}
object Statement {
  
  inline def apply(columns: ColumnList[String], name: String, string: String, types: js.Array[Double]): Statement = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statement] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: ColumnList[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? postgres.postgres.Column<T> : never */ js.Any)*
    ): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
