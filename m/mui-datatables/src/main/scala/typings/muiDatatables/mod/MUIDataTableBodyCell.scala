package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableBodyCell extends js.Object {
  
  var children: js.UndefOr[js.Any] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var colIndex: js.UndefOr[Double] = js.native
  
  var columnHeader: js.UndefOr[js.Any] = js.native
  
  var dataIndex: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var otherProps: js.UndefOr[js.Any] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
}
object MUIDataTableBodyCell {
  
  @scala.inline
  def apply(): MUIDataTableBodyCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableBodyCell]
  }
  
  @scala.inline
  implicit class MUIDataTableBodyCellOps[Self <: MUIDataTableBodyCell] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setColIndex(value: Double): Self = this.set("colIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColIndex: Self = this.set("colIndex", js.undefined)
    
    @scala.inline
    def setColumnHeader(value: js.Any): Self = this.set("columnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeader: Self = this.set("columnHeader", js.undefined)
    
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOtherProps(value: js.Any): Self = this.set("otherProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherProps: Self = this.set("otherProps", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
}
