package typings.muiDatatables.mod

import typings.muiDatatables.anon.PartialExpandButtonRender
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableProps extends js.Object {
  
  var columns: js.Array[MUIDataTableColumnDef] = js.native
  
  var components: js.UndefOr[PartialExpandButtonRender] = js.native
  
  var data: js.Array[js.Object | (js.Array[Double | String])] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var title: String | ReactNode = js.native
}
object MUIDataTableProps {
  
  @scala.inline
  def apply(columns: js.Array[MUIDataTableColumnDef], data: js.Array[js.Object | (js.Array[Double | String])]): MUIDataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableProps]
  }
  
  @scala.inline
  implicit class MUIDataTablePropsOps[Self <: MUIDataTableProps] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: MUIDataTableColumnDef*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[MUIDataTableColumnDef]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: (js.Object | (js.Array[Double | String]))*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Object | (js.Array[Double | String])]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: PartialExpandButtonRender): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
