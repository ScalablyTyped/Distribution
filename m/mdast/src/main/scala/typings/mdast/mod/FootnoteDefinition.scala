package typings.mdast.mod

import typings.mdast.mdastStrings.footnoteDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FootnoteDefinition
  extends Parent
     with Association
     with DefinitionContent {
  
  @JSName("children")
  var children_FootnoteDefinition: js.Array[BlockContent] = js.native
  
  @JSName("type")
  var type_FootnoteDefinition: footnoteDefinition = js.native
}
object FootnoteDefinition {
  
  @scala.inline
  def apply(children: js.Array[BlockContent], identifier: String, `type`: footnoteDefinition): FootnoteDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteDefinition]
  }
  
  @scala.inline
  implicit class FootnoteDefinitionOps[Self <: FootnoteDefinition] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: BlockContent*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[BlockContent]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: footnoteDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
