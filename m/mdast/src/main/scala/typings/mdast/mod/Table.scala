package typings.mdast.mod

import typings.mdast.mdastStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table
  extends Parent
     with BlockContent {
  
  var align: js.UndefOr[js.Array[AlignType]] = js.native
  
  @JSName("children")
  var children_Table: js.Array[TableContent] = js.native
  
  @JSName("type")
  var type_Table: table = js.native
}
object Table {
  
  @scala.inline
  def apply(children: js.Array[TableContent], `type`: table): Table = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: TableContent*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[TableContent]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: table): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignVarargs(value: AlignType*): Self = this.set("align", js.Array(value :_*))
    
    @scala.inline
    def setAlign(value: js.Array[AlignType]): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
}
