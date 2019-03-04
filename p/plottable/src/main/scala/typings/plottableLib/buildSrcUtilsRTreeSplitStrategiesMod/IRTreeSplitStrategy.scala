package typings
package plottableLib.buildSrcUtilsRTreeSplitStrategiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRTreeSplitStrategy extends js.Object {
  def split[T](entries: js.Array[plottableLib.buildSrcUtilsRTreeMod.RTreeNode[T]], nodes: NodePair[T]): scala.Unit
}

object IRTreeSplitStrategy {
  @scala.inline
  def apply(
    split: js.Function2[
      js.Array[plottableLib.buildSrcUtilsRTreeMod.RTreeNode[js.Any]], 
      NodePair[js.Any], 
      scala.Unit
    ]
  ): IRTreeSplitStrategy = {
    val __obj = js.Dynamic.literal(split = split)
  
    __obj.asInstanceOf[IRTreeSplitStrategy]
  }
}

