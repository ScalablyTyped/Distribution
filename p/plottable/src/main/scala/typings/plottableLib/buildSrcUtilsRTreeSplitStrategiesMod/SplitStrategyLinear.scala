package typings
package plottableLib.buildSrcUtilsRTreeSplitStrategiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/rTreeSplitStrategies", "SplitStrategyLinear")
@js.native
class SplitStrategyLinear () extends IRTreeSplitStrategy {
  /**
       * Split the next entry. Choose the entry that expands its parent node's
       * area the least.
       */
  /* private */ def addNext[T](entries: js.Any, nodes: js.Any): js.Any = js.native
  /**
       * Choose the two farthest-apart entries to begin the split.
       */
  /* private */ def chooseFirstSplit[T](entries: js.Any, nodes: js.Any): js.Any = js.native
  /* CompleteClass */
  override def split[T](entries: js.Array[plottableLib.buildSrcUtilsRTreeMod.RTreeNode[T]], nodes: NodePair[T]): scala.Unit = js.native
}

