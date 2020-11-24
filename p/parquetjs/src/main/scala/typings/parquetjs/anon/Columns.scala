package typings.parquetjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends js.Object {
  
  var columns: js.Any = js.native
  
  var num_rows: Double = js.native
  
  var sorting_columns: Null | js.Array[String] = js.native
  
  var total_byte_size: Double = js.native
}
object Columns {
  
  @scala.inline
  def apply(columns: js.Any, num_rows: Double, total_byte_size: Double): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_rows(value: Double): Self = this.set("num_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_byte_size(value: Double): Self = this.set("total_byte_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorting_columnsVarargs(value: String*): Self = this.set("sorting_columns", js.Array(value :_*))
    
    @scala.inline
    def setSorting_columns(value: js.Array[String]): Self = this.set("sorting_columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorting_columnsNull: Self = this.set("sorting_columns", null)
  }
}
