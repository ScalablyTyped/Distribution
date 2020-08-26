package typings.openfin.processMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessInfo extends js.Object {
  var cpuUsage: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var nonPagedPoolUsage: js.UndefOr[Double] = js.native
  var pageFaultCount: js.UndefOr[Double] = js.native
  var pagedPoolUsage: js.UndefOr[Double] = js.native
  var pagefileUsage: js.UndefOr[Double] = js.native
  var peakNonPagedPoolUsage: js.UndefOr[Double] = js.native
  var peakPagedPoolUsage: js.UndefOr[Double] = js.native
  var peakPagefileUsage: js.UndefOr[Double] = js.native
  var peakWorkingSetSize: js.UndefOr[Double] = js.native
  var processId: js.UndefOr[Double] = js.native
  var uuid: js.UndefOr[String] = js.native
  var workingSetSize: js.UndefOr[Double] = js.native
}

object ProcessInfo {
  @scala.inline
  def apply(): ProcessInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessInfo]
  }
  @scala.inline
  implicit class ProcessInfoOps[Self <: ProcessInfo] (val x: Self) extends AnyVal {
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
    def setCpuUsage(value: Double): Self = this.set("cpuUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuUsage: Self = this.set("cpuUsage", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNonPagedPoolUsage(value: Double): Self = this.set("nonPagedPoolUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonPagedPoolUsage: Self = this.set("nonPagedPoolUsage", js.undefined)
    @scala.inline
    def setPageFaultCount(value: Double): Self = this.set("pageFaultCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageFaultCount: Self = this.set("pageFaultCount", js.undefined)
    @scala.inline
    def setPagedPoolUsage(value: Double): Self = this.set("pagedPoolUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagedPoolUsage: Self = this.set("pagedPoolUsage", js.undefined)
    @scala.inline
    def setPagefileUsage(value: Double): Self = this.set("pagefileUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagefileUsage: Self = this.set("pagefileUsage", js.undefined)
    @scala.inline
    def setPeakNonPagedPoolUsage(value: Double): Self = this.set("peakNonPagedPoolUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeakNonPagedPoolUsage: Self = this.set("peakNonPagedPoolUsage", js.undefined)
    @scala.inline
    def setPeakPagedPoolUsage(value: Double): Self = this.set("peakPagedPoolUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeakPagedPoolUsage: Self = this.set("peakPagedPoolUsage", js.undefined)
    @scala.inline
    def setPeakPagefileUsage(value: Double): Self = this.set("peakPagefileUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeakPagefileUsage: Self = this.set("peakPagefileUsage", js.undefined)
    @scala.inline
    def setPeakWorkingSetSize(value: Double): Self = this.set("peakWorkingSetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeakWorkingSetSize: Self = this.set("peakWorkingSetSize", js.undefined)
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessId: Self = this.set("processId", js.undefined)
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
    @scala.inline
    def setWorkingSetSize(value: Double): Self = this.set("workingSetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingSetSize: Self = this.set("workingSetSize", js.undefined)
  }
  
}

