package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryOptions
import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMatchersClassMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def classs(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node], options: TSQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("classs")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
