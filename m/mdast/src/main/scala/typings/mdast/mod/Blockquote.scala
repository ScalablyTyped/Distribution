package typings.mdast.mod

import typings.mdast.mdastStrings.blockquote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blockquote
  extends Parent
     with BlockContent {
  
  @JSName("children")
  var children_Blockquote: js.Array[BlockContent] = js.native
  
  @JSName("type")
  var type_Blockquote: blockquote = js.native
}
object Blockquote {
  
  @scala.inline
  def apply(children: js.Array[BlockContent], `type`: blockquote): Blockquote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blockquote]
  }
  
  @scala.inline
  implicit class BlockquoteMutableBuilder[Self <: Blockquote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[BlockContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: BlockContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: blockquote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
