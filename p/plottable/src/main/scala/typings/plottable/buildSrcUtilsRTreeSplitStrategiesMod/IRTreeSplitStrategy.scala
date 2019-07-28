package typings.plottable.buildSrcUtilsRTreeSplitStrategiesMod

import typings.plottable.buildSrcUtilsRTreeMod.RTreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRTreeSplitStrategy extends js.Object {
  def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit
}

object IRTreeSplitStrategy {
  @scala.inline
  def apply(split: (js.Array[RTreeNode[js.Any]], NodePair[js.Any]) => Unit): IRTreeSplitStrategy = {
    val __obj = js.Dynamic.literal(split = js.Any.fromFunction2(split))
  
    __obj.asInstanceOf[IRTreeSplitStrategy]
  }
}

