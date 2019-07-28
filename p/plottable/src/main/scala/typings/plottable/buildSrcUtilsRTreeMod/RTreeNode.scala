package typings.plottable.buildSrcUtilsRTreeMod

import typings.plottable.buildSrcUtilsRTreeSplitStrategiesMod.IRTreeSplitStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/rTree", "RTreeNode")
@js.native
class RTreeNode[T] protected () extends js.Object {
  def this(leaf: Boolean) = this()
  var bounds: RTreeBounds = js.native
  var entries: js.Array[RTreeNode[T]] = js.native
  var leaf: Boolean = js.native
  var parent: RTreeNode[T] = js.native
  var value: T = js.native
  /**
    * Inserts a child node and updates the ancestry bounds.
    */
  def insert(node: RTreeNode[T]): this.type = js.native
  /**
    * Returns the depth from this node to the deepest leaf descendant.
    */
  def maxDepth(): Double = js.native
  /**
    * Returns `true` iff this node has more children than the `maxNodeChildren`
    * parameter.
    */
  def overflow(maxNodeChildren: Double): Boolean = js.native
  /**
    * Removes a child node and updates the ancestry bounds.
    *
    * If the node argument is not a child, do nothing.
    */
  def remove(node: RTreeNode[T]): this.type = js.native
  /**
    * Splits this node by creating two new nodes and dividing the this node's
    * children between them. This node is removed from its parent and the two
    * new nodes are added.
    *
    * If this node is the root, a new parent node is created.
    *
    * Returns the parent node.
    */
  def split(strategy: IRTreeSplitStrategy): RTreeNode[T] = js.native
  /**
    * Chooses an node from then entries that minimizes the area difference that
    * adding the bounds the each entry would cause.
    */
  def subtree(bounds: RTreeBounds): RTreeNode[T] = js.native
  /**
    * Returns the difference in area that adding an entry `bounds` to the node
    * would cause.
    */
  def unionAreaDifference(bounds: RTreeBounds): Double = js.native
}

/* static members */
@JSImport("plottable/build/src/utils/rTree", "RTreeNode")
@js.native
object RTreeNode extends js.Object {
  def valueNode[T](bounds: RTreeBounds, value: T): RTreeNode[T] = js.native
}

