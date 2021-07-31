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
  
  @scala.inline
  def apply(children: js.Array[TableContent]): Table = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table")
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: js.Array[AlignType]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAlignVarargs(value: AlignType*): Self = StObject.set(x, "align", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[TableContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: TableContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
