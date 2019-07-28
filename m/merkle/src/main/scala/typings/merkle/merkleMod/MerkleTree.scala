package typings.merkle.merkleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerkleTree extends js.Object {
  def depth(): Double
  def level(level: Double): js.UndefOr[Double]
  def levels(): Double
  def nodes(): Double
  def root(): String
}

object MerkleTree {
  @scala.inline
  def apply(
    depth: () => Double,
    level: Double => js.UndefOr[Double],
    levels: () => Double,
    nodes: () => Double,
    root: () => String
  ): MerkleTree = {
    val __obj = js.Dynamic.literal(depth = js.Any.fromFunction0(depth), level = js.Any.fromFunction1(level), levels = js.Any.fromFunction0(levels), nodes = js.Any.fromFunction0(nodes), root = js.Any.fromFunction0(root))
  
    __obj.asInstanceOf[MerkleTree]
  }
}

