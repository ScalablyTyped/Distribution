package typings.openfin.processMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessInfo extends js.Object {
  var cpuUsage: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nonPagedPoolUsage: js.UndefOr[Double] = js.undefined
  var pageFaultCount: js.UndefOr[Double] = js.undefined
  var pagedPoolUsage: js.UndefOr[Double] = js.undefined
  var pagefileUsage: js.UndefOr[Double] = js.undefined
  var peakNonPagedPoolUsage: js.UndefOr[Double] = js.undefined
  var peakPagedPoolUsage: js.UndefOr[Double] = js.undefined
  var peakPagefileUsage: js.UndefOr[Double] = js.undefined
  var peakWorkingSetSize: js.UndefOr[Double] = js.undefined
  var processId: js.UndefOr[Double] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
  var workingSetSize: js.UndefOr[Double] = js.undefined
}

object ProcessInfo {
  @scala.inline
  def apply(
    cpuUsage: Int | Double = null,
    name: String = null,
    nonPagedPoolUsage: Int | Double = null,
    pageFaultCount: Int | Double = null,
    pagedPoolUsage: Int | Double = null,
    pagefileUsage: Int | Double = null,
    peakNonPagedPoolUsage: Int | Double = null,
    peakPagedPoolUsage: Int | Double = null,
    peakPagefileUsage: Int | Double = null,
    peakWorkingSetSize: Int | Double = null,
    processId: Int | Double = null,
    uuid: String = null,
    workingSetSize: Int | Double = null
  ): ProcessInfo = {
    val __obj = js.Dynamic.literal()
    if (cpuUsage != null) __obj.updateDynamic("cpuUsage")(cpuUsage.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nonPagedPoolUsage != null) __obj.updateDynamic("nonPagedPoolUsage")(nonPagedPoolUsage.asInstanceOf[js.Any])
    if (pageFaultCount != null) __obj.updateDynamic("pageFaultCount")(pageFaultCount.asInstanceOf[js.Any])
    if (pagedPoolUsage != null) __obj.updateDynamic("pagedPoolUsage")(pagedPoolUsage.asInstanceOf[js.Any])
    if (pagefileUsage != null) __obj.updateDynamic("pagefileUsage")(pagefileUsage.asInstanceOf[js.Any])
    if (peakNonPagedPoolUsage != null) __obj.updateDynamic("peakNonPagedPoolUsage")(peakNonPagedPoolUsage.asInstanceOf[js.Any])
    if (peakPagedPoolUsage != null) __obj.updateDynamic("peakPagedPoolUsage")(peakPagedPoolUsage.asInstanceOf[js.Any])
    if (peakPagefileUsage != null) __obj.updateDynamic("peakPagefileUsage")(peakPagefileUsage.asInstanceOf[js.Any])
    if (peakWorkingSetSize != null) __obj.updateDynamic("peakWorkingSetSize")(peakWorkingSetSize.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    if (workingSetSize != null) __obj.updateDynamic("workingSetSize")(workingSetSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessInfo]
  }
}

