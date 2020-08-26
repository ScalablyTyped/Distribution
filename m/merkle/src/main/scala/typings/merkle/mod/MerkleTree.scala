package typings.merkle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerkleTree extends js.Object {
  def depth(): Double = js.native
  def level(level: Double): js.UndefOr[Double] = js.native
  def levels(): Double = js.native
  def nodes(): Double = js.native
  def root(): String = js.native
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
  @scala.inline
  implicit class MerkleTreeOps[Self <: MerkleTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDepth(value: () => Double): Self = this.set("depth", js.Any.fromFunction0(value))
    @scala.inline
    def setLevel(value: Double => js.UndefOr[Double]): Self = this.set("level", js.Any.fromFunction1(value))
    @scala.inline
    def setLevels(value: () => Double): Self = this.set("levels", js.Any.fromFunction0(value))
    @scala.inline
    def setNodes(value: () => Double): Self = this.set("nodes", js.Any.fromFunction0(value))
    @scala.inline
    def setRoot(value: () => String): Self = this.set("root", js.Any.fromFunction0(value))
  }
  
}

