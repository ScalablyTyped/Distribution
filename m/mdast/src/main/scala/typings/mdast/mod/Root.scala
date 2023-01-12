package typings.mdast.mod

import typings.mdast.mdastStrings.root
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root
  extends StObject
     with Parent {
  
  @JSName("type")
  var type_Root: root
}
object Root {
  
  inline def apply(children: js.Array[Node[Data]]): Root = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("root")
    __obj.asInstanceOf[Root]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
    
    inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
