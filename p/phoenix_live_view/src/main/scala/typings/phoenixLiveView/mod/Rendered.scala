package typings.phoenixLiveView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix_live_view", "Rendered")
@js.native
class Rendered protected () extends js.Object {
  def this(viewId: String, rendered: js.Any) = this()
  // public
  def componentCIDs(diff: js.Any): js.Array[Double] = js.native
  def componentToString(cid: Double): String = js.native
  def expandStatics(diff: js.Any): Unit = js.native
  def isComponentOnlyDiff(diff: js.Any): Boolean = js.native
  def mergeDiff(diff: js.Any): Unit = js.native
  def parentViewId(): String = js.native
  def pruneCIDs(cids: js.Array[Double]): js.Any = js.native
  def recursiveMerge(target: js.Object, source: js.Object): Unit = js.native
  def recursiveToString(rendered: js.Any, components: js.Any): String = js.native
  def recursiveToString(rendered: js.Any, components: js.Any, onlyCids: js.Array[Double]): String = js.native
  def toString(onlyCids: js.Array[Double]): String = js.native
}

