package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMatchersFieldMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def field(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("field")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
