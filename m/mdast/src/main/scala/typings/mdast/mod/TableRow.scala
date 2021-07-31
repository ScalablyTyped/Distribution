package typings.mdast.mod

import typings.mdast.mdastStrings.tableRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRow
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_TableRow: js.Array[RowContent]
  
  @JSName("type")
  var type_TableRow: tableRow
}
object TableRow {
  
  @scala.inline
  def apply(children: js.Array[RowContent]): TableRow = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tableRow")
    __obj.asInstanceOf[TableRow]
  }
  
  @scala.inline
  implicit class TableRowMutableBuilder[Self <: TableRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[RowContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: RowContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: tableRow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
