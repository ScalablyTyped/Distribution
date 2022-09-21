package typings.mdast.mod

import typings.mdast.mdastStrings.footnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footnote
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Footnote: js.Array[PhrasingContent]
  
  @JSName("type")
  var type_Footnote: footnote
}
object Footnote {
  
  inline def apply(children: js.Array[PhrasingContent]): Footnote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnote")
    __obj.asInstanceOf[Footnote]
  }
  
  extension [Self <: Footnote](x: Self) {
    
    inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: footnote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
