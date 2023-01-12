package typings.oracleOraclejet.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertNewView extends StObject {
  
  def insertNewView(): Unit
  
  var isInitial: Boolean
  
  var newViewModel: js.Object
  
  var newViewParent: Node
  
  var node: Node
  
  var oldDomNodes: js.Array[Any]
  
  var oldViewModel: js.Object
  
  var oldViewParent: Node
  
  def removeOldView(): Unit
}
object InsertNewView {
  
  inline def apply(
    insertNewView: () => Unit,
    isInitial: Boolean,
    newViewModel: js.Object,
    newViewParent: Node,
    node: Node,
    oldDomNodes: js.Array[Any],
    oldViewModel: js.Object,
    oldViewParent: Node,
    removeOldView: () => Unit
  ): InsertNewView = {
    val __obj = js.Dynamic.literal(insertNewView = js.Any.fromFunction0(insertNewView), isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], newViewParent = newViewParent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldDomNodes = oldDomNodes.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any], oldViewParent = oldViewParent.asInstanceOf[js.Any], removeOldView = js.Any.fromFunction0(removeOldView))
    __obj.asInstanceOf[InsertNewView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertNewView] (val x: Self) extends AnyVal {
    
    inline def setInsertNewView(value: () => Unit): Self = StObject.set(x, "insertNewView", js.Any.fromFunction0(value))
    
    inline def setIsInitial(value: Boolean): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    inline def setNewViewModel(value: js.Object): Self = StObject.set(x, "newViewModel", value.asInstanceOf[js.Any])
    
    inline def setNewViewParent(value: Node): Self = StObject.set(x, "newViewParent", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOldDomNodes(value: js.Array[Any]): Self = StObject.set(x, "oldDomNodes", value.asInstanceOf[js.Any])
    
    inline def setOldDomNodesVarargs(value: Any*): Self = StObject.set(x, "oldDomNodes", js.Array(value*))
    
    inline def setOldViewModel(value: js.Object): Self = StObject.set(x, "oldViewModel", value.asInstanceOf[js.Any])
    
    inline def setOldViewParent(value: Node): Self = StObject.set(x, "oldViewParent", value.asInstanceOf[js.Any])
    
    inline def setRemoveOldView(value: () => Unit): Self = StObject.set(x, "removeOldView", js.Any.fromFunction0(value))
  }
}
