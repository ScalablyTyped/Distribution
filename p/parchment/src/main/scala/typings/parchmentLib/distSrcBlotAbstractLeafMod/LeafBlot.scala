package typings
package parchmentLib.distSrcBlotAbstractLeafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- parchmentLib.distSrcBlotAbstractBlotMod.Leaf because var conflicts: domNode, next, parent, prev, scroll. Inlined index, position, value */ @js.native
trait LeafBlot
  extends parchmentLib.distSrcBlotAbstractShadowMod.default {
  def index(node: stdLib.Node, offset: scala.Double): scala.Double = js.native
  def position(index: scala.Double): js.Tuple2[stdLib.Node, scala.Double] = js.native
  def position(index: scala.Double, inclusive: scala.Boolean): js.Tuple2[stdLib.Node, scala.Double] = js.native
  def value(): js.Any = js.native
}

