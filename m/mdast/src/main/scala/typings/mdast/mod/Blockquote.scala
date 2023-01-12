package typings.mdast.mod

import typings.mdast.mdastStrings.blockquote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blockquote
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Blockquote: js.Array[BlockContent | DefinitionContent]
  
  @JSName("type")
  var type_Blockquote: blockquote
}
object Blockquote {
  
  inline def apply(children: js.Array[BlockContent | DefinitionContent]): Blockquote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote")
    __obj.asInstanceOf[Blockquote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blockquote] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[BlockContent | DefinitionContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (BlockContent | DefinitionContent)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: blockquote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
