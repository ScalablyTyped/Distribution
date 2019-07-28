package typings.parchment.distSrcBlotAbstractLeafMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.parchment.distSrcBlotAbstractBlotMod.Leaf because var conflicts: domNode, next, parent, prev, scroll. Inlined index, position, value */ @js.native
trait LeafBlot
  extends typings.parchment.distSrcBlotAbstractShadowMod.default {
  def index(node: Node, offset: Double): Double = js.native
  def position(index: Double): js.Tuple2[Node, Double] = js.native
  def position(index: Double, inclusive: Boolean): js.Tuple2[Node, Double] = js.native
  def value(): js.Any = js.native
}

