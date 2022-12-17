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
@JSImport("playcanvas", "DefaultAnimBinder")
@js.native
open class DefaultAnimBinder protected () extends AnimBinder {
  def this(graph: Any) = this()
  
  def _isPathActive(path: Any): Boolean = js.native
  
  def _isPathInMask(path: Any, checkMaskValue: Any): Boolean = js.native
  
  var _mask: Any = js.native
  
  var activeNodes: js.Array[Any] = js.native
  
  def assignMask(mask: Any): Boolean = js.native
  
  def findNode(path: Any): Any = js.native
  
  var graph: Any = js.native
  
  var handlers: LocalPosition = js.native
  
  def resolve(path: Any): Any = js.native
  
  def unresolve(path: Any): Unit = js.native
  
  def update(deltaTime: Any): Unit = js.native
}
object DefaultAnimBinder {
  
  @JSImport("playcanvas", "DefaultAnimBinder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createAnimTarget(func: Any, `type`: Any, valueCount: Any, node: Any, propertyPath: Any, componentType: Any): AnimTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimTarget")(func.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], valueCount.asInstanceOf[js.Any], node.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any], componentType.asInstanceOf[js.Any])).asInstanceOf[AnimTarget]
}
