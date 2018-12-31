package typings
package parchmentLib.distSrcBlotAbstractLeafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(parchmentLib.distSrcBlotAbstractBlotMod.Leaf because Would inherit conflicting mutable fields List(domNode, next, parent, prev, scroll))*/
@js.native
trait LeafBlot
  extends parchmentLib.distSrcBlotAbstractShadowMod.default {
  def index(node: stdLib.Node, offset: scala.Double): scala.Double = js.native
  def position(index: scala.Double): js.Tuple2[stdLib.Node, scala.Double] = js.native
  def position(index: scala.Double, inclusive: scala.Boolean): js.Tuple2[stdLib.Node, scala.Double] = js.native
  def value(): js.Any = js.native
}

