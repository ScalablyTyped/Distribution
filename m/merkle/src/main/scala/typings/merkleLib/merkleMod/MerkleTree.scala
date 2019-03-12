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
    depth: () => scala.Double,
    level: scala.Double => js.UndefOr[scala.Double],
    levels: () => scala.Double,
    nodes: () => scala.Double,
    root: () => java.lang.String
  ): MerkleTree = {
    val __obj = js.Dynamic.literal(depth = js.Any.fromFunction0(depth), level = js.Any.fromFunction1(level), levels = js.Any.fromFunction0(levels), nodes = js.Any.fromFunction0(nodes), root = js.Any.fromFunction0(root))
  
    __obj.asInstanceOf[MerkleTree]
  }
}

