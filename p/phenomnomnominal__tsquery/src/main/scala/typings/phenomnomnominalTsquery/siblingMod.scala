package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siblingMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/sibling", "adjacent")
  @js.native
  def adjacent(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/matchers/sibling", "sibling")
  @js.native
  def sibling(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
}
