package typings.nlcst.mod

import typings.nlcst.nlcstStrings.ParagraphNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Paragraph: js.Array[ParagraphContent]
  
  @JSName("type")
  var type_Paragraph: ParagraphNode
}
object Paragraph {
  
  inline def apply(children: js.Array[ParagraphContent]): Paragraph = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParagraphNode")
    __obj.asInstanceOf[Paragraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paragraph] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[ParagraphContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ParagraphContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: ParagraphNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
