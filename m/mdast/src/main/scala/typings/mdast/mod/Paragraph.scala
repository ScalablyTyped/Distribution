package typings.mdast.mod

import typings.mdast.mdastStrings.paragraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph
  extends StObject
     with Parent
     with BlockContent {
  
  @JSName("children")
  var children_Paragraph: js.Array[PhrasingContent]
  
  @JSName("type")
  var type_Paragraph: paragraph
}
object Paragraph {
  
  @scala.inline
  def apply(children: js.Array[PhrasingContent]): Paragraph = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph")
    __obj.asInstanceOf[Paragraph]
  }
  
  @scala.inline
  implicit class ParagraphMutableBuilder[Self <: Paragraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: paragraph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
