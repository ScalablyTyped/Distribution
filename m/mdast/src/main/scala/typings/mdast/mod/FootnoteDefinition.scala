package typings.mdast.mod

import typings.mdast.mdastStrings.footnoteDefinition
import org.scalablytyped.runtime.StObject
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
  implicit class FootnoteDefinitionMutableBuilder[Self <: FootnoteDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[BlockContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: BlockContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: footnoteDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
