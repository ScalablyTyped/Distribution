package typings
package parchmentLib.distSrcBlotAbstractBlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leaf extends Blot {
  def index(node: stdLib.Node, offset: scala.Double): scala.Double = js.native
  def position(index: scala.Double, inclusive: scala.Boolean): js.Tuple2[stdLib.Node, scala.Double] = js.native
  def value(): js.Any = js.native
}

