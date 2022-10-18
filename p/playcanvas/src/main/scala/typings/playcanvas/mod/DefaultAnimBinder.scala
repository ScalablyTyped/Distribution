package typings.playcanvas.mod

import typings.playcanvas.anon.LocalPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementation of {@link AnimBinder} for animating a skeleton in the graph-node hierarchy.
  *
  * @implements {AnimBinder}
  * @ignore
  */
trait DefaultAnimBinder
  extends StObject
     with AnimBinder {
  
  def _isPathActive(path: Any): Boolean
  
  def _isPathInMask(path: Any, checkMaskValue: Any): Boolean
  
  var _mask: Any
  
  var activeNodes: js.Array[Any]
  
  def assignMask(mask: Any): Boolean
  
  def findNode(path: Any): Any
  
  var graph: Any
  
  var handlers: LocalPosition
  
  def resolve(path: Any): Any
  
  def unresolve(path: Any): Unit
  
  def update(deltaTime: Any): Unit
}
object DefaultAnimBinder {
  
  inline def apply(
    _isPathActive: Any => Boolean,
    _isPathInMask: (Any, Any) => Boolean,
    _mask: Any,
    activeNodes: js.Array[Any],
    assignMask: Any => Boolean,
    findNode: Any => Any,
    graph: Any,
    handlers: LocalPosition,
    resolve: Any => Any,
    unresolve: Any => Unit,
    update: Any => Unit
  ): DefaultAnimBinder = {
    val __obj = js.Dynamic.literal(_isPathActive = js.Any.fromFunction1(_isPathActive), _isPathInMask = js.Any.fromFunction2(_isPathInMask), _mask = _mask.asInstanceOf[js.Any], activeNodes = activeNodes.asInstanceOf[js.Any], assignMask = js.Any.fromFunction1(assignMask), findNode = js.Any.fromFunction1(findNode), graph = graph.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve), unresolve = js.Any.fromFunction1(unresolve), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DefaultAnimBinder]
  }
  
  extension [Self <: DefaultAnimBinder](x: Self) {
    
    inline def setActiveNodes(value: js.Array[Any]): Self = StObject.set(x, "activeNodes", value.asInstanceOf[js.Any])
    
    inline def setActiveNodesVarargs(value: Any*): Self = StObject.set(x, "activeNodes", js.Array(value*))
    
    inline def setAssignMask(value: Any => Boolean): Self = StObject.set(x, "assignMask", js.Any.fromFunction1(value))
    
    inline def setFindNode(value: Any => Any): Self = StObject.set(x, "findNode", js.Any.fromFunction1(value))
    
    inline def setGraph(value: Any): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setHandlers(value: LocalPosition): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: Any => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setUnresolve(value: Any => Unit): Self = StObject.set(x, "unresolve", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def set_isPathActive(value: Any => Boolean): Self = StObject.set(x, "_isPathActive", js.Any.fromFunction1(value))
    
    inline def set_isPathInMask(value: (Any, Any) => Boolean): Self = StObject.set(x, "_isPathInMask", js.Any.fromFunction2(value))
    
    inline def set_mask(value: Any): Self = StObject.set(x, "_mask", value.asInstanceOf[js.Any])
  }
}
