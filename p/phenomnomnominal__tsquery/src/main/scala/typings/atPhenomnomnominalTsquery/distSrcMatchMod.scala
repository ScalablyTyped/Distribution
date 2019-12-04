package typings.atPhenomnomnominalTsquery

import typings.atPhenomnomnominalTsquery.distSrcTsqueryDashTypesMod.TSQueryOptions
import typings.atPhenomnomnominalTsquery.distSrcTsqueryDashTypesMod.TSQuerySelectorNode
import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/match", JSImport.Namespace)
@js.native
object distSrcMatchMod extends js.Object {
  def findMatches(node: Node, selector: TSQuerySelectorNode): Boolean = js.native
  def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node]): Boolean = js.native
  def findMatches(node: Node, selector: TSQuerySelectorNode, ancestry: js.Array[Node], options: TSQueryOptions): Boolean = js.native
  def `match`[T /* <: Node */](node: Node, selector: TSQuerySelectorNode): js.Array[T] = js.native
  def `match`[T /* <: Node */](node: Node, selector: TSQuerySelectorNode, options: TSQueryOptions): js.Array[T] = js.native
}

