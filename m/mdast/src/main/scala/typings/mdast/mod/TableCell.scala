package typings.mdast.mod

import typings.mdast.mdastStrings.tableCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCell extends Parent {
  
  @JSName("children")
  var children_TableCell: js.Array[PhrasingContent] = js.native
  
  @JSName("type")
  var type_TableCell: tableCell = js.native
}
object TableCell {
  
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: tableCell): TableCell = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCell]
  }
  
  @scala.inline
  implicit class TableCellMutableBuilder[Self <: TableCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: tableCell): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
