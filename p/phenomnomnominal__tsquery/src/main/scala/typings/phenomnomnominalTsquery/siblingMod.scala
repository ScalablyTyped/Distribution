package typings.phenomnomnominalTsquery

import typings.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/matchers/sibling", JSImport.Namespace)
@js.native
object siblingMod extends js.Object {
  def adjacent(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
  def sibling(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
}

