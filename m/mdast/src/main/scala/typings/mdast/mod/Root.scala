package typings.mdast.mod

import typings.mdast.mdastStrings.root
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
  
  inline def apply(children: js.Array[Node]): Root = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("root")
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
