package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementation of {@link AnimBinder} for animating a skeleton in the graph-node hierarchy.
  *
  * @implements {AnimBinder}
  * @ignore
  */
@JSGlobal("pc.DefaultAnimBinder")
@js.native
open class DefaultAnimBinder protected ()
  extends typings.playcanvas.mod.DefaultAnimBinder {
  def this(graph: Any) = this()
}
object DefaultAnimBinder {
  
  @JSGlobal("pc.DefaultAnimBinder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createAnimTarget(func: Any, `type`: Any, valueCount: Any, node: Any, propertyPath: Any, componentType: Any): typings.playcanvas.mod.AnimTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimTarget")(func.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], valueCount.asInstanceOf[js.Any], node.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any], componentType.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.AnimTarget]
}
