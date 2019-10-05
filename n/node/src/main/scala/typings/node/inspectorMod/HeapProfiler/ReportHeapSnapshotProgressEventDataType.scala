package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportHeapSnapshotProgressEventDataType extends js.Object {
  var done: Double
  var finished: js.UndefOr[Boolean] = js.undefined
  var total: Double
}

object ReportHeapSnapshotProgressEventDataType {
  @scala.inline
  def apply(done: Double, total: Double, finished: js.UndefOr[Boolean] = js.undefined): ReportHeapSnapshotProgressEventDataType = {
    val __obj = js.Dynamic.literal(done = done, total = total)
    if (!js.isUndefined(finished)) __obj.updateDynamic("finished")(finished)
    __obj.asInstanceOf[ReportHeapSnapshotProgressEventDataType]
  }
}

