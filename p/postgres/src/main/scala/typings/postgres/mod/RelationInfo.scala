package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationInfo extends StObject {
  
  var columns: js.Array[ColumnInfo]
  
  var keys: js.Array[ColumnInfo]
  
  var schema: String
  
  var table: String
}
object RelationInfo {
  
  inline def apply(columns: js.Array[ColumnInfo], keys: js.Array[ColumnInfo], schema: String, table: String): RelationInfo = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationInfo] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[ColumnInfo]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: ColumnInfo*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setKeys(value: js.Array[ColumnInfo]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: ColumnInfo*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
