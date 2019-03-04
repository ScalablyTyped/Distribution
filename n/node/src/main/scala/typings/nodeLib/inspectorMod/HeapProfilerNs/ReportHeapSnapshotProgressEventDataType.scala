package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportHeapSnapshotProgressEventDataType extends js.Object {
  var done: scala.Double
  var finished: js.UndefOr[scala.Boolean] = js.undefined
  var total: scala.Double
}

object ReportHeapSnapshotProgressEventDataType {
  @scala.inline
  def apply(done: scala.Double, total: scala.Double, finished: js.UndefOr[scala.Boolean] = js.undefined): ReportHeapSnapshotProgressEventDataType = {
    val __obj = js.Dynamic.literal(done = done, total = total)
    if (!js.isUndefined(finished)) __obj.updateDynamic("finished")(finished)
    __obj.asInstanceOf[ReportHeapSnapshotProgressEventDataType]
  }
}

