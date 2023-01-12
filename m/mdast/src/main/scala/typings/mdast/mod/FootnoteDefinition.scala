package typings.mdast.mod

import typings.mdast.mdastStrings.footnoteDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FootnoteDefinition
  extends StObject
     with Parent
     with Association {
  
  @JSName("children")
  var children_FootnoteDefinition: js.Array[BlockContent | DefinitionContent]
  
  @JSName("type")
  var type_FootnoteDefinition: footnoteDefinition
}
object FootnoteDefinition {
  
  inline def apply(children: js.Array[BlockContent | DefinitionContent], identifier: String): FootnoteDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnoteDefinition")
    __obj.asInstanceOf[FootnoteDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FootnoteDefinition] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[BlockContent | DefinitionContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (BlockContent | DefinitionContent)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: footnoteDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
