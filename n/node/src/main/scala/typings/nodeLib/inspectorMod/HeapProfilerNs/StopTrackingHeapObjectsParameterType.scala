package typings
package nodeLib.inspectorMod.HeapProfilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopTrackingHeapObjectsParameterType extends js.Object {
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken
    * when the tracking is stopped.
    */
  var reportProgress: js.UndefOr[scala.Boolean] = js.undefined
}

object StopTrackingHeapObjectsParameterType {
  @scala.inline
  def apply(reportProgress: js.UndefOr[scala.Boolean] = js.undefined): StopTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reportProgress)) __obj.updateDynamic("reportProgress")(reportProgress)
    __obj.asInstanceOf[StopTrackingHeapObjectsParameterType]
  }
}

