package typings.opentypeJs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncode(value: () => js.Array[Double]): Self = this.set("encode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeOf(value: () => Double): Self = this.set("sizeOf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: Table*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[Table]): Self = this.set("tables", value.asInstanceOf[js.Any])
  }
}
