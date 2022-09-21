package typings.postcssNesting

import typings.postcss.mod.Container
import typings.postcss.nodeMod.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shiftNodesBeforeParentMod {
  
  @JSImport("postcss-nesting/dist/lib/shift-nodes-before-parent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: ChildNode, parent: Container[ChildNode]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
