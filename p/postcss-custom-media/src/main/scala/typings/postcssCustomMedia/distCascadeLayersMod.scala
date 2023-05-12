package typings.postcssCustomMedia

import typings.postcss.mod.Node
import typings.postcss.mod.Root_
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCascadeLayersMod {
  
  @JSImport("postcss-custom-media/dist/cascade-layers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cascadeLayerNumberForNode(node: Node, layers: WeakMap[Node, Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cascadeLayerNumberForNode")(node.asInstanceOf[js.Any], layers.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def collectCascadeLayerOrder(root: Root_): WeakMap[Node, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectCascadeLayerOrder")(root.asInstanceOf[js.Any]).asInstanceOf[WeakMap[Node, Double]]
}
