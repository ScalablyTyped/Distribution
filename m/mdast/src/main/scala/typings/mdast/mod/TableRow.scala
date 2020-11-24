package typings.mdast.mod

import typings.mdast.mdastStrings.tableRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRow extends Parent {
  
  @JSName("children")
  var children_TableRow: js.Array[RowContent] = js.native
  
  @JSName("type")
  var type_TableRow: tableRow = js.native
}
object TableRow {
  
  @scala.inline
  def apply(children: js.Array[RowContent], `type`: tableRow): TableRow = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRow]
  }
  
  @scala.inline
  implicit class TableRowOps[Self <: TableRow] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: RowContent*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[RowContent]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: tableRow): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
