package typings.mdast.mod

import typings.mdast.mdastStrings.strong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strong
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Strong: js.Array[PhrasingContent]
  
  @JSName("type")
  var type_Strong: strong
}
object Strong {
  
  inline def apply(children: js.Array[PhrasingContent]): Strong = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong")
    __obj.asInstanceOf[Strong]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Strong] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: strong): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
