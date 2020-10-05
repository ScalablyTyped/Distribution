package typings.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTrackingHeapObjectsParameterType extends js.Object {
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken when the tracking is stopped.
    */
  var reportProgress: js.UndefOr[Boolean] = js.native
}

object StopTrackingHeapObjectsParameterType {
  @scala.inline
  def apply(): StopTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTrackingHeapObjectsParameterType]
  }
  @scala.inline
  implicit class StopTrackingHeapObjectsParameterTypeOps[Self <: StopTrackingHeapObjectsParameterType] (val x: Self) extends AnyVal {
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
    def setReportProgress(value: Boolean): Self = this.set("reportProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportProgress: Self = this.set("reportProgress", js.undefined)
  }
  
}

