package typings.mdast.mod

import typings.mdast.mdastStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table
  extends StObject
     with Parent
     with BlockContent {
  
  var align: js.UndefOr[js.Array[AlignType]] = js.undefined
  
  @JSName("children")
  var children_Table: js.Array[TableContent]
  
  @JSName("type")
  var type_Table: table
}
object Table {
  
  inline def apply(children: js.Array[TableContent]): Table = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table")
    __obj.asInstanceOf[Table]
  }
  
  extension [Self <: Table](x: Self) {
    
    inline def setAlign(value: js.Array[AlignType]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlignVarargs(value: AlignType*): Self = StObject.set(x, "align", js.Array(value :_*))
    
    inline def setChildren(value: js.Array[TableContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: TableContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setType(value: table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
