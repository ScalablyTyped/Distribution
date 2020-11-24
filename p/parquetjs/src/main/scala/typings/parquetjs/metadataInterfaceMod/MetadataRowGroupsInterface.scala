package typings.parquetjs.metadataInterfaceMod

import typings.nodeInt64.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataRowGroupsInterface extends js.Object {
  
  var columns: js.Array[MetadataRowGroupsColumnsInterface] = js.native
  
  var num_rows: ^ = js.native
  
  var sorting_columns: (js.Array[js.Array[String] | String]) | Null = js.native
  
  var total_byte_size: ^ = js.native
}
object MetadataRowGroupsInterface {
  
  @scala.inline
  def apply(columns: js.Array[MetadataRowGroupsColumnsInterface], num_rows: ^, total_byte_size: ^): MetadataRowGroupsInterface = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], num_rows = num_rows.asInstanceOf[js.Any], total_byte_size = total_byte_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataRowGroupsInterface]
  }
  
  @scala.inline
  implicit class MetadataRowGroupsInterfaceOps[Self <: MetadataRowGroupsInterface] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: MetadataRowGroupsColumnsInterface*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[MetadataRowGroupsColumnsInterface]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_rows(value: ^): Self = this.set("num_rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_byte_size(value: ^): Self = this.set("total_byte_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorting_columnsVarargs(value: (js.Array[String] | String)*): Self = this.set("sorting_columns", js.Array(value :_*))
    
    @scala.inline
    def setSorting_columns(value: js.Array[js.Array[String] | String]): Self = this.set("sorting_columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorting_columnsNull: Self = this.set("sorting_columns", null)
  }
}
