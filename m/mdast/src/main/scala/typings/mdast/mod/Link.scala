package typings.mdast.mod

import typings.mdast.mdastStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link
  extends StObject
     with Parent
     with Resource {
  
  @JSName("children")
  var children_Link: js.Array[StaticPhrasingContent]
  
  @JSName("type")
  var type_Link: link
}
object Link {
  
  inline def apply(children: js.Array[StaticPhrasingContent], url: String): Link = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link")
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def setChildren(value: js.Array[StaticPhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: StaticPhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
