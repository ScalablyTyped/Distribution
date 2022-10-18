package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryOptions
import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMatchMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findMatches(node: Node, selector: TSQuerySelectorNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node], options: TSQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: Unit, options: TSQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def `match`[T /* <: Node */](node: Node, selector: TSQuerySelectorNode): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def `match`[T /* <: Node */](node: Node, selector: TSQuerySelectorNode, options: TSQueryOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
