package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMatchersSiblingMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/sibling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjacent(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("adjacent")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sibling(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sibling")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
