package typings
package merkleLib.merkleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerkleTree extends js.Object {
  def depth(): scala.Double
  def level(level: scala.Double): js.UndefOr[scala.Double]
  def levels(): scala.Double
  def nodes(): scala.Double
  def root(): java.lang.String
}

object MerkleTree {
  @scala.inline
  def apply(
    depth: js.Function0[scala.Double],
    level: js.Function1[scala.Double, js.UndefOr[scala.Double]],
    levels: js.Function0[scala.Double],
    nodes: js.Function0[scala.Double],
    root: js.Function0[java.lang.String]
  ): MerkleTree = {
    val __obj = js.Dynamic.literal(depth = depth, level = level, levels = levels, nodes = nodes, root = root)
  
    __obj.asInstanceOf[MerkleTree]
  }
}

