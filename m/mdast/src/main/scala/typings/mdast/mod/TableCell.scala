package typings.mdast.mod

import typings.mdast.mdastStrings.tableCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCell
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_TableCell: js.Array[PhrasingContent]
  
  @JSName("type")
  var type_TableCell: tableCell
}
object TableCell {
  
  inline def apply(children: js.Array[PhrasingContent]): TableCell = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("tableCell")
    __obj.asInstanceOf[TableCell]
  }
  
  extension [Self <: TableCell](x: Self) {
    
    inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setType(value: tableCell): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
