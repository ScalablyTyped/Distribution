package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQueryOptions
import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMatchersHasMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/has", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def has(node: Node, selector: TSQuerySelectorNode, _underscore: js.Array[Node], options: TSQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
