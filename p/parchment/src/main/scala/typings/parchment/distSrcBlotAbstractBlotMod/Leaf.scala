package typings.parchment.distSrcBlotAbstractBlotMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leaf extends Blot {
  def index(node: Node, offset: Double): Double = js.native
  def position(index: Double, inclusive: Boolean): js.Tuple2[Node, Double] = js.native
  def value(): js.Any = js.native
}

