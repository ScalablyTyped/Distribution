package typings.mdast.mod

import typings.mdast.mdastStrings.strong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strong
  extends Parent
     with StaticPhrasingContent {
  
  @JSName("children")
  var children_Strong: js.Array[PhrasingContent] = js.native
  
  @JSName("type")
  var type_Strong: strong = js.native
}
object Strong {
  
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: strong): Strong = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strong]
  }
  
  @scala.inline
  implicit class StrongMutableBuilder[Self <: Strong] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: strong): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
