package typings.opentypeJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table
  extends /* propName */ StringDictionary[js.Any] {
  
  def encode(): js.Array[Double] = js.native
  
  var fields: js.Array[Field] = js.native
  
  def sizeOf(): Double = js.native
  
  var tableName: String = js.native
  
  var tables: js.Array[Table] = js.native
}
object Table {
  
  @scala.inline
  def apply(
    encode: () => js.Array[Double],
    fields: js.Array[Field],
    sizeOf: () => Double,
    tableName: String,
    tables: js.Array[Table]
  ): Table = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction0(encode), fields = fields.asInstanceOf[js.Any], sizeOf = js.Any.fromFunction0(sizeOf), tableName = tableName.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncode(value: () => js.Array[Double]): Self = StObject.set(x, "encode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setSizeOf(value: () => Double): Self = StObject.set(x, "sizeOf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTables(value: js.Array[Table]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: Table*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
