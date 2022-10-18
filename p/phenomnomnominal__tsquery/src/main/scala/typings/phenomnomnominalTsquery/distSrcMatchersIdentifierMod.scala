package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.distSrcTsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMatchersIdentifierMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/identifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def identifier(node: Node, selector: TSQuerySelectorNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("identifier")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
