package typings.nlcst.mod

import typings.nlcst.nlcstStrings.RootNode
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root
  extends StObject
     with Parent {
  
  @JSName("type")
  var type_Root: RootNode
}
object Root {
  
  inline def apply(children: js.Array[Node[Data]]): Root = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RootNode")
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setType(value: RootNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
