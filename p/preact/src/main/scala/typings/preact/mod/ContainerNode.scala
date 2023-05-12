package typings.preact.mod

import typings.preact.anon.FnCall
import typings.std.ArrayLike
import typings.std.ChildNode
import typings.std.Node
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Preact render
// -----------------------------------
trait ContainerNode extends StObject {
  
  def appendChild[T /* <: Node */](node: T): T
  @JSName("appendChild")
  var appendChild_Original: js.Function1[/* node */ Node, Node]
  
  var childNodes: ArrayLike[Node]
  
  var firstChild: ChildNode | Null
  
  def insertBefore[T /* <: Node */](node: T): T
  def insertBefore[T /* <: Node */](node: T, child: Node): T
  @JSName("insertBefore")
  var insertBefore_Original: FnCall
  
  var nodeType: Double
  
  var parentNode: ParentNode | Null
  
  def removeChild[T /* <: Node */](child: T): T
  @JSName("removeChild")
  var removeChild_Original: js.Function1[/* child */ Node, Node]
}
object ContainerNode {
  
  inline def apply(
    appendChild: /* node */ Node => Node,
    childNodes: ArrayLike[Node],
    insertBefore: FnCall,
    nodeType: Double,
    removeChild: /* child */ Node => Node
  ): ContainerNode = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), childNodes = childNodes.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), firstChild = null, parentNode = null)
    __obj.asInstanceOf[ContainerNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerNode] (val x: Self) extends AnyVal {
    
    inline def setAppendChild(value: /* node */ Node => Node): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    inline def setChildNodes(value: ArrayLike[Node]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setFirstChild(value: ChildNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
    
    inline def setInsertBefore(value: FnCall): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
    
    inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setParentNode(value: ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
    
    inline def setRemoveChild(value: /* child */ Node => Node): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
  }
}
