package typings.openui5.anon

import typings.openui5.sapUiCommonsTreeNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /**
    * The node which has been selected.
    */
  var node: js.UndefOr[default] = js.undefined
  
  /**
    * The binding context of the selected node.
    */
  var nodeContext: js.UndefOr[js.Object] = js.undefined
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    inline def setNode(value: default): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeContext(value: js.Object): Self = StObject.set(x, "nodeContext", value.asInstanceOf[js.Any])
    
    inline def setNodeContextUndefined: Self = StObject.set(x, "nodeContext", js.undefined)
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
